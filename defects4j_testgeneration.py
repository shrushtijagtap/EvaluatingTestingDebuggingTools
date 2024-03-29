import json
import logging
import subprocess
import os
from enum import Enum
from pathlib import Path

# ----  Set up logging ----
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)

# ---- Configuration variables ----
# repo path = current directory
REPO_PATH: Path = Path.cwd()
EVOSUITE_JAR = "/Users/shrushtijagtap/uiuc/Spring2024/CS527/evosuite-1.2.0.jar"
#RANDOOP_JAR = os.path.join(os.path.expanduser("~"), "Downloads", "randoop-4.3.2", "randoop-all-4.3.2.jar")
FAILED_PROJECTS = []


class Dataset(Enum):
    DEFECTS4J = "Defects4J"
    QUIXBUGS = "QuixBugs"
    BEARS = "Bears"
    BUGSWARM = "BugSwarm"


def validPath(pathpassed, filename, bugorfixVersion = ""):
    path = str(pathpassed)
    full_path = os.path.join(path, bugorfixVersion, filename)
    
    if not Path(full_path).is_file() and "Gson" in path:
        full_path = os.path.join(path, bugorfixVersion, "gson", filename)
        return full_path

    if not Path(full_path).is_file():
        full_path = os.path.join(path, bugorfixVersion, "src", filename)
        if not Path(full_path).is_file():
            full_path = os.path.join(path, bugorfixVersion, "source", filename)

    print("valid path: ", full_path)
    return full_path


def initialize_jenv():
    """
    Using this at the moment to ensure that my Java environment is set up correctly
    """
    subprocess.check_output(['jenv', 'init', '-'], universal_newlines=True)
    # Set the JAVA_HOME environment variable to /Library/Java/JavaVirtualMachines/temurin-8.jdk/Contents/Home
    os.environ['JAVA_HOME'] = '/Library/Java/JavaVirtualMachines/temurin-8.jdk/Contents/Home'


def compile_project_maven(project_dir):
    """
    Compile a single project using Maven. If compilation fails, continue with the next project and
    add the project to the list of failed projects to check manually later.
    """
    # if mvn: 
    command = ['mvn', 'clean', 'compile']
    try:
        subprocess.run(command, check=True, cwd=project_dir, capture_output=True)
        return True, ""
    except subprocess.CalledProcessError as e:
        logger.error(f"Failed to compile {e.output}")
        return False, e.stderr.decode()
    

def compile_project_javac(bug, class_names, version):
    """
    Compile a single project using Maven. If compilation fails, continue with the next project and
    add the project to the list of failed projects to check manually later.
    """
    #     javac
    for class_name in class_names:
        classpath = validPath(bug, class_name, version)
        command = ['javac', classpath]
        # command = ['javac', '-cp', classpath, classpath]
        try:
            subprocess.run(command, check=True, capture_output=True)
        except subprocess.CalledProcessError as e:
            logger.error(f"Failed to compile {e.output}")
            return False, e.stderr.decode()
    

def run_maven_classpath(project_dir):
    print("running maven classpath")
    command = ['mvn', 'dependency:build-classpath', '-Dmdep.outputFile=cp.txt']
    subprocess.run(command, check=True, cwd=project_dir)
    # classpath_file = os.path.join(project_dir, 'cp.txt')
    # with open(classpath_file, 'r') as file:
    #     return file.read().strip()


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


def generate_evosuite_test(classpath: str, testclass: str):
    """
    Generate tests for a single test class using EvoSuite
    """
     # $(echo $EVOSUITE) -class className -projectCP pathToClassFiles
    testclass = testclass.replace(".java", "")

    index = classpath.find(testclass)
    classpath = classpath[:index]

    command = [
       'java', '-jar', EVOSUITE_JAR, '-class', testclass, '-projectCP', classpath[:-1], '-base_dir', classpath[:-1]
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

    # NOTE: You can remove this is your JAVA_HOME is already set or modify it to point to the correct path
    # initialize_jenv()
    for dataset in Dataset:
        # NOTE: Temporarily only testing the BEARS dataset
        if dataset is not Dataset.DEFECTS4J:
            continue

        # Root path for the dataset
        dataset_path = REPO_PATH / dataset.value

        # Iterate over each bug in the dataset
        for bug in dataset_path.iterdir():
            print("*******************", bug.name,"***********************")

            # Just look at project directories
            if not bug.is_dir() or bug.name == "results":
                continue

            # Compile and generate tests for both buggy and patched versions
            for version in ["Buggy-Version", "Patched-Version"]:
                version_path = bug / version
                logger.info(f"Processing {dataset.value}-{bug.name}-{version}")
                logger.debug(f"Path: {version_path}")


                # Get the list of failed tests for the bug to check the class we need to generate tests for
                failed_test_file = version_path.parent / 'modified_classes.txt'
                class_names = set()
                with open(failed_test_file, 'r') as file:
                    failed_tests = file.read().splitlines()
                    for test in failed_tests:
                        class_names.add(test)

                logger.debug(f"Failed class: {class_names}")


                pom_file = os.path.join(version_path, 'pom.xml')
                # Compile the project if it has not been compiled yet
                # NOTE: Remove this check if you want to recompile the project every time
                if not (version_path / 'target').exists():
                    if os.path.exists(pom_file):
                        success, error_message = compile_project_maven(version_path)
                    else:
                        success, error_message = compile_project_javac(bug, class_names, version)
                    
                    # If project was not compiled successfully, add it to the list of failed projects
                    # and continue with the next project.
                    if not success:
                        FAILED_PROJECTS.append({
                            "dataset": dataset.value,
                            "bug": bug.name,
                            "version": version,
                            "error": error_message
                        })
                        logger.error(f" **** Failed to compile {dataset.value}-{bug.name}-{version} **** ")
                        continue
                else:
                    logger.info(f"Project already compiled: {dataset.value}-{bug.name}-{version}")

                if os.path.exists(pom_file):
                    run_maven_classpath(version_path)


                for testclass in class_names:
                    classpath = validPath(bug, testclass, version)
                    logger.info(f"Generating tests for {testclass} in {version}...")
                    #generate_randoop_test(classpath, testclass, version, str(output_dir))
                    generate_evosuite_test(classpath, testclass)
                    logger.info(f"Test generation completed for {dataset.value}-{bug.name}-{version}")
    

    # Save the failed project data to a JSON file
    with open('failed_projects.json', 'w') as file:
        json.dump(FAILED_PROJECTS, file, indent=4)
