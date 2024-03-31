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

# comment the once you dont need
EVOSUITE_JAR = "/Users/sejalpekam/evosuite-1.2.0.jar"
RANDOOP_JAR = os.path.join(os.path.expanduser("~"), "Downloads", "randoop-4.3.2", "randoop-all-4.3.2.jar")
FAILED_PROJECTS = []


class Dataset(Enum):
    DEFECTS4J = "Defects4J"
    QUIXBUGS = "QuixBugs"
    BEARS = "Bears"
    BUGSWARM = "BugSwarm"


def compile_project(project_dir, java_filename):
    """
    Compile a single project using Maven. If compilation fails, continue with the next project and
    add the project to the list of failed projects to check manually later.
    """
    command = ['javac', java_filename]
    try:
        subprocess.run(command, check=True, cwd=project_dir, capture_output=True)
        print(java_filename, " Compiled")
        return True, ""
    except subprocess.CalledProcessError as e:
        logger.error(f"Failed to compile {e.output}")
        return False, e.stderr.decode()


def comment_package(version_path, name, version):
    strToCommentFile = ""
    if version == "Buggy-Version":
        strToCommentFile = str(version_path) +"/java_programs/"+ name+".java"
    else:
        strToCommentFile = str(version_path) +"/correct_java_programs/"+ name+".java"

    with open(strToCommentFile , 'r') as file:
        lines = file.readlines()

    with open(strToCommentFile , 'w') as file:
            for line in lines:
                if 'package' in line:
                    line = f'// {line.strip()}\n'
                file.write(line)
            print(name, " editted")


def generate_randoop_test(classpath: str, testclass: str, version: str):
    """
    Generate tests for a single test class using Randoop
    """

    # TODO: Use the version to determine what test to generate and where to place it

    # java -classpath ${RANDOOP_JAR} randoop.main.Main gentests --classlist=myclasses.txt --time-limit=60
    command = [
        'java', '-classpath', f"{classpath}:{RANDOOP_JAR}", 'randoop.main.Main', 'gentests',
        '--testclass=' + testclass, '--time-limit=60'
    ]

    subprocess.run(command, check=True)


def generate_evosuite_test(classpath: str, testclass: str):
    """
    Generate tests for a single test class using EvoSuite
    """
    print("Generating tests for", classpath," ",testclass)
    # TODO: Use the version to determine what test to generate and where to place it

     # $(echo $EVOSUITE) -class className -projectCP pathToClassFiles
    command = [
       'java', '-jar', EVOSUITE_JAR, '-class', testclass, '-projectCP', classpath, '-base_dir', classpath
    ]
    subprocess.run(command, check=True)
    print("generated evosuite_test for", testclass)


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
        if dataset is not Dataset.QUIXBUGS:
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
                # comment_package(version_path, bug.name, version)

                if not (version_path / 'target').exists():
                    success, error_message = compile_project(version_path, bug.name + '.java')
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

                # For Randoop
                # modify the parameters according to your need
                logger.info(f"Randoop: Generating tests for {bug.name} in {version}... {version_path}")
                generate_randoop_test(version_path, bug.name, version)
                logger.info(f"Randoop: Test generation completed for {dataset.value}-{bug.name}-{version}")

                # logger.info(f"Generating tests for {bug.name} in {version}... {version_path}")
                # generate_evosuite_test(version_path, bug.name)
                # logger.info(f"Test generation completed for {dataset.value}-{bug.name}-{version}")


    # Save the failed project data to a JSON file
    with open('failed_projects.json', 'w') as file:
        json.dump(FAILED_PROJECTS, file, indent=4)
