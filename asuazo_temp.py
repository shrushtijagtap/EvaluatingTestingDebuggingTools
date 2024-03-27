import json
import logging
import subprocess
import os
from enum import Enum
from pathlib import Path

# ----  Set up logging ----
logging.basicConfig(level=logging.DEBUG)
logger = logging.getLogger(__name__)

# ---- Configuration variables ----

# repo path = current directory
REPO_PATH: Path = Path.cwd()
# Set the Randoop JAR path to the downloads directory
RANDOOP_JAR = os.path.join(os.path.expanduser("~"), "Downloads", "randoop-4.3.2", "randoop-all-4.3.2.jar")

FAILED_PROJECTS = []


class Dataset(Enum):
    DEFECTS4J = "Defects4J"
    QUIXBUGS = "QuixBugs"
    BEARS = "Bears"
    BUGSWARM = "BugSwarm"


def extract_class_name(test_name):
    """
    Get the qualified class name from the test name (from the test.txt file)
    """
    class_name = test_name.rsplit('.', 1)[0]
    class_name = class_name.split('.')[-1]
    class_name = class_name.replace('Tests', '')

    # Check the project structure and create a qualified class name
    for root, dirs, files in os.walk(version_path):
        for inner_file in files:
            if inner_file == class_name + '.class':
                logger.debug(f"Found class: {inner_file}")
                package_path = os.path.relpath(root, version_path).replace(os.path.sep, '.')
                # Remove initial target.classes. from the package path
                package_path = package_path.split('.', 2)[-1]
                return f"{package_path}.{class_name}"


def compile_project(project_dir):
    """
    Compile a single project using Maven. If compilation fails, continue with the next project and
    add the project to the list of failed projects to check manually later.
    """
    command = ['mvn', 'clean', 'compile']
    try:
        subprocess.run(command, check=True, cwd=project_dir, capture_output=True)
        return True, ""
    except subprocess.CalledProcessError as e:
        logger.error(f"Failed to compile {e.output}")
        return False, e.stderr.decode()


def get_maven_classpath(project_dir):
    command = ['mvn', 'dependency:build-classpath', '-Dmdep.outputFile=cp.txt']
    subprocess.run(command, check=True, cwd=project_dir)
    classpath_file = os.path.join(project_dir, 'cp.txt')
    with open(classpath_file, 'r') as file:
        return file.read().strip()


def generate_randoop_test(classpath: str, testclass: str, version: str, output_dir: str):
    """
    Generate tests for a single test class using Randoop
    """

    # TODO: Use the version to determine what test to generate and where to place it

    # java -classpath ${RANDOOP_JAR} randoop.main.Main gentests --classlist=myclasses.txt --time-limit=60
    command = [
        'java', '-classpath', f"{classpath}:{RANDOOP_JAR}", 'randoop.main.Main', 'gentests',
        '--testclass=' + testclass, '--time-limit=60', '--junit-output-dir=' + output_dir
    ]

    subprocess.run(command, check=True)


if __name__ == '__main__':
    # For each dataset:
    # For each bug:
    # For both buggy and patched versions:
    # 1. Compile the project
    # 2. Run Randoop to generate tests
    # 3. Store generated tests under the projects test folder
    # 4. Rename the generated tests to be prefixed with "Randoop"

    for dataset in Dataset:

        # NOTE: Temporarily only testing the BEARS dataset
        if dataset is not Dataset.BEARS:
            continue

        # Root path for the dataset
        dataset_path = REPO_PATH / dataset.value

        # Iterate over each bug in the dataset
        for bug in dataset_path.iterdir():

            # Just look at project directories
            if not bug.is_dir() or bug.name == "results":
                continue

            # Compile and generate tests for both buggy and patched versions
            for version in ["Buggy-Version", "Patched-Version"]:
                version_path = bug / version
                logger.info(f"Processing {dataset.value}-{bug.name}-{version}")
                logger.debug(f"Path: {version_path}")

                # Compile the project if it has not been compiled yet
                if not (version_path / 'target').exists():
                    success, error_message = compile_project(version_path)
                    # If project was not compiled successfully, add it to the list of failed projects
                    # and continue with the next project.
                    if not success:
                        FAILED_PROJECTS.append({
                            "dataset": dataset.value,
                            "bug": bug.name,
                            "version": version,
                            "error": error_message
                        })
                        logger.error(f"Failed to compile {dataset.value}-{bug.name}-{version}")
                        logger.error(error_message)
                        continue

                # ----  Project is compiled, generate tests ----
                # Get the list of failed tests for the bug to check the class we need to generate tests for
                failed_test_file = version_path.parent / 'test.txt'
                class_names = set()
                with open(failed_test_file, 'r') as file:
                    failed_tests = file.read().splitlines()
                    for test in failed_tests:
                        qualified_class_name = extract_class_name(test)
                        if qualified_class_name:
                            class_names.add(qualified_class_name)

                logger.debug(f"Failed class: {class_names}")

                # Get the classpath for the project
                classpath = get_maven_classpath(version_path)
                classpath = f"{str(version_path / 'target' / 'classes')}{os.pathsep}{classpath}"
                logger.debug(f"Classpath: {classpath}")

                # Output directory for the generated tests should be in the existing test folder
                output_dir = version_path / 'src' / 'test' / 'java'

                # Randoop
                for testclass in class_names:
                    logger.info(f"Generating tests for {testclass} in {version}...")
                    generate_randoop_test(classpath, testclass, version, str(output_dir))
                    logger.info(f"Test generation completed for {dataset.value}-{bug.name}-{version}")

                    # NOTE: I use this to test just a single project at a time
                    # exit(0)

    # Save the failed project data to a JSON file
    with open('failed_projects.json', 'w') as file:
        json.dump(FAILED_PROJECTS, file, indent=4)
