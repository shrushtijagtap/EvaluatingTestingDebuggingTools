import logging
import subprocess
import os
from concurrent.futures import ProcessPoolExecutor, as_completed
from enum import Enum
from pathlib import Path
import re

# Configure logging
logging.basicConfig(level=logging.DEBUG)
logger = logging.getLogger(__name__)


# Configuration variables
REPO_PATH = Path.cwd()
EVOSUITE_JAR = "/Users/shreyachaudhary/Desktop/cs527/evosuite/evosuite-1.0.6.jar"
RANDOOP_JAR = "/Users/shreyachaudhary/Desktop/cs527/randoop-4.3.2/randoop-all-4.3.2.jar"
DATASET_PATH = "/Users/shreyachaudhary/Desktop/cs527/CS527-Project"
FAILED_PROJECTS = []

# Used to control steps
RECOMPILE = False
GET_CLASSPATH_AND_DEPENDENCIES = True
GENERATE_EVO_TESTS = False
GENERATE_RANDOOP_TESTS = False
RUN_TESTS = False

VERSIONS = ["Patched-Version", "Buggy-Version"]

RANDOOP_CONFIG = {
    "time_limit": 60,
    "maxsize": 1000,
    "usethreads": "true",
    "flaky-test-behavior": "DISCARD",
}

EVOSUITE_CONFIG = {
    "Dsearch_budget": 60,
}

class Dataset(Enum):
    BUGSWARM = "BugSwarm"

def get_class_name_by_test_name(base_path: Path, class_names: set, version: str):
    failed_test_file = base_path / 'failed_test.txt'
    with open(failed_test_file, 'r') as file:
        failed_tests = file.read().splitlines()
        for test in failed_tests:
            qualified_class_name = extract_class_name(test, base_path / version)
            if qualified_class_name:
                class_names.add(qualified_class_name)


def get_class_name_by_modified_test_file(base_path: Path, class_names: set, version: str):
    failed_test_file = base_path / 'modified_classes.txt'
    with open(failed_test_file, 'r') as file:
        failed_tests = file.read().splitlines()
        for test in failed_tests:
            qualified_class_name = test.replace('.java', '').replace('/', '.')
            # Check the project structure and create a qualified class name
            # If there is a src/main/java dir in the project
            string_to_remove = 'src.main.java.' if base_path.joinpath(version, 'src', 'main',
                                                                      'java').exists() else 'src.'
            logger.debug(f"String to remove: {string_to_remove}")
            qualified_class_name = qualified_class_name.replace(string_to_remove, '')
            if qualified_class_name:
                class_names.add(qualified_class_name)


def extract_class_name(test_name, version_path):
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
    """Compile a project using Maven."""
    logger.info(f"Compiling project {project_dir}...")
    command = ['mvn', 'clean', 'compile']
    log_file_path = project_dir / 'compile.log'
    with open(log_file_path, 'w') as log_file:
        try:
            subprocess.run(command, check=True, cwd=project_dir, stdout=log_file, stderr=log_file)
            return True, ""
        except subprocess.CalledProcessError as e:
            return False, f"Compilation failed. Logs stored in: {log_file_path}"

def copy_dependencies(project_dir, version_path):
    """Copy dependencies to a specified directory based on modified_classes.txt."""

    modified_classes_file_path = project_dir / 'modified_classes.txt'
    try:
        with open(modified_classes_file_path, 'r') as modified_classes_file:
            extracted_path = modified_classes_file.readline().strip(" ")
            logger.info({extracted_path})
            extracted_path = extracted_path.split("/")
            
    except FileNotFoundError:
        return False, f"File not found: {modified_classes_file_path}"
            
    first_word = extracted_path[0]
    target_dir_path = version_path / first_word  

    # Combine extracted path with version_path to get the target directory path
    logger.info({target_dir_path})
    # Check if the target directory exists
    if not target_dir_path.exists():
        return False, f"Target directory does not exist: {target_dir_path}"

    # Create 'target/dependency' directory in the target directory
    dependency_dir = target_dir_path / 'target' / 'dependency'
    dependency_dir.mkdir(parents=True, exist_ok=True)
    
    
    # Prepare and execute Maven command to copy dependencies
    command = ['mvn', 'dependency:copy-dependencies', f'-DoutputDirectory={dependency_dir}']
    
    try:
        subprocess.run(command, check=True, cwd=target_dir_path)
        return True, dependency_dir  # Return True and the path of dependency_dir on success
    except subprocess.CalledProcessError as e:
        return False, f"Copy dependency failed. Error: {e}"



def generate_randoop_test(project_dir: Path, classpath: str,dependency_dir: Path, testclass: str, output_dir: str):
    """
    Generate tests for a single test class using Randoop
    """

    # TODO: Use the version to determine what test to generate and where to place it

    # java -classpath ${RANDOOP_JAR} randoop.main.Main gentests --classlist=myclasses.txt --time-limit=60
    # Add RANDOOP_CONFIG to the command
    command = [
        'java', '-classpath', f"{classpath}:{RANDOOP_JAR}:{dependency_dir}/*", 'randoop.main.Main', 'gentests',
        '--testclass=' + testclass, '--junit-output-dir=' + output_dir
    ]

    command.extend([f"--{key}={value}" for key, value in RANDOOP_CONFIG.items()])

    log_file_path = project_dir / 'randoop.log'

    with open(log_file_path, 'w') as log_file:
        try:
            subprocess.run(command, check=True, stdout=log_file, stderr=log_file)
            return True, ""
        except subprocess.CalledProcessError as e:
            return False, f"Randoop failed. Logs stored in: {log_file_path}"


def generate_evosuite_test(project_dir: Path, classpath: str, testclass: str, output_dir: str):
    """
    Generate tests for a single test class using EvoSuite
    """
    logger.info(f"EvoSuite Generation...")

    command = [
        'java', '-jar', EVOSUITE_JAR, '-class', testclass, '-projectCP', classpath, '-base_dir', output_dir
    ]

    command.extend([f"-{key}={value}" for key, value in EVOSUITE_CONFIG.items()])

    log_file_path = project_dir / 'evosuite.log'

    with open(log_file_path, 'w') as log_file:
        try:
            subprocess.run(command, check=True, stdout=log_file, stderr=log_file)
            return True, ""
        except subprocess.CalledProcessError as e:
            return False, f"Evosuite failed. Logs stored in: {log_file_path}"


def copy_tests(source_dir: Path, target_dir: Path):
    """ Copy tests from source to target directory """
    for test_file in source_dir.glob("**/*.java"):
        shutil.copy2(test_file, target_dir)


def rename_and_copy_tests(source_dir: Path, target_dir: Path, prefix: str):
    """ Rename tests by adding a Randoop/Evosuite previx and copy them to the projects test folder """
    for test_file in source_dir.glob("**/*.java"):
        shutil.copy2(test_file, target_dir / test_file.name)
        continue

        new_name = f"{prefix}{test_file.name}"
        target_file_path = target_dir / new_name

        shutil.copy2(test_file, target_file_path)

        # Replace the class name
        old_class_name = test_file.stem

        command = f'sed -i "" "s/{old_class_name}/{prefix}{old_class_name}/g" "{target_file_path}"'
        subprocess.run(command, shell=True, check=True)


def process_bug(bug_path, version, dataset):
    """Process a single bug for both versions."""
    bug_name = bug_path.name
    version_path = bug_path / version
    logger.info(f"Processing {bug_name} - {version}")

    if RECOMPILE or not (version_path / 'target').exists():
        success, error_message = compile_project(version_path)
        if not success:
            FAILED_PROJECTS.append({
                "dataset": dataset.value,
                "bug": bug_name,
                "version": version,
                "error": error_message
            })
            logger.error(f"**** Failed to compile {dataset.value}-{bug_name}-{version} ****")
            return

    if GET_CLASSPATH_AND_DEPENDENCIES:
        success, dep_dir= copy_dependencies(bug_path, version_path)
        if not success:
             logger.error(f"not found {dep_dir}")

    class_names = set()
    get_class_name_by_modified_test_file(version_path.parent, class_names, version)
    logger.debug(f"Failed class: {class_names}")

    classpath = str(version_path / 'target' / 'classes')

    if not classpath:
        logger.error(f"Failed to get classpath for {dataset.value}-{bug_name}-{version}")
        return f"Failed to get classpath for {dataset.value}-{bug_name}-{version}"

    test_dir = version_path / 'src' / 'test' 
    if not test_dir.exists():
        test_dir = version_path / 'test'
        if not test_dir.exists():
            logger.error(f"Project does not have a test directory")
            return f"Project does not have a test directory for {dataset.value}-{bug_name}-{version}"

    opposite_version = "Patched-Version" if version == "Buggy-Version" else "Buggy-Version"
    randoop_output_dir = version_path / 'randoop-tests'
    randoop_output_dir_opposite = bug_path / opposite_version / 'randoop-tests-from-other-version'
    randoop_output_dir.mkdir(parents=True, exist_ok=True)
    randoop_output_dir_opposite.mkdir(parents=True, exist_ok=True)

    evo_output_dir = version_path / 'evosuite-tests'
    evo_output_dir_opposite = bug_path / opposite_version / 'evosuite-tests-from-other-version'
    evo_output_dir.mkdir(parents=True, exist_ok=True)
    evo_output_dir_opposite.mkdir(parents=True, exist_ok=True)

    for testclass in class_names:
        if GENERATE_RANDOOP_TESTS:
            logger.info(f"Generating Randoop tests for {testclass} in {version}...")
            success, error_message = generate_randoop_test(version_path, classpath, dep_dir,testclass, randoop_output_dir)
            if not success:
                logger.error(f"Failed to generate Randoop tests for {testclass} in {version}. Error: {error_message}")
                continue

        if GENERATE_EVO_TESTS:
            logger.info(f"Generating Evosuite tests for {testclass} in {version}...")
            success, error_message = generate_evosuite_test(version_path, classpath, testclass, evo_output_dir)
            if not success:
                logger.error(f"Failed to generate Evosuite tests for {testclass} in {version}. Error: {error_message}")
                continue

            rename_and_copy_tests(evo_output_dir, test_dir, "Evosuite")
            copy_tests(evo_output_dir, evo_output_dir_opposite)
            logger.info(f"Test generation completed for {dataset.value}-{bug_name}-{version}")

    
    return bug_name, version


if __name__ == '__main__':
    logging.basicConfig(level=logging.DEBUG)
    dataset = Dataset.BUGSWARM
    dataset_path = REPO_PATH / dataset.value
    bugs = [bug for bug in dataset_path.iterdir() if bug.is_dir() and bug.name in ["fastjson2-9745790836"]]

    with ProcessPoolExecutor(max_workers=os.cpu_count()) as executor:
        future_to_bug_map = {
            executor.submit(process_bug, bug, version, dataset): (bug.name, version)
            for bug in bugs for version in VERSIONS
        }

        for future in as_completed(future_to_bug_map):
            bug_name, version = future_to_bug_map[future]
            try:
                result = future.result()
                print(f"{bug_name} - {version} processed with result: {result}")
            except Exception as exc:
                print(f"{bug_name} - {version} generated an exception: {exc}")


#if __name__ == '__main__':
    # For each dataset:
    # For each bug:
    # For both buggy and patched versions:
    # 1. Compile the project
    # 2. Run Randoop to generate tests
    # 3. Store generated tests under the projects test folder
    # 4. Rename the generated tests to be prefixed with "Randoop"

    # NOTE: You can remove this is your JAVA_HOME is already set or modify it to point to the correct path
   
    #dataset = Dataset.BUGSWARM
    #dataset_path = REPO_PATH / dataset.value
    #bugs = [bug for bug in dataset_path.iterdir() if
            #bug.is_dir() and bug.name not in ["results"] and bug.name in ["fastjson-9745790836"]]
    # ----  Process the bugs in parallel ----
    #with ProcessPoolExecutor(max_workers=os.cpu_count()) as executor:
        # Stores all futures
        #future_to_bug_map = {
            #executor.submit(process_bug, bug, version, dataset): (bug.name, version)
            #for bug in bugs for version in VERSIONS
        #}

        #for future in as_completed(future_to_bug_map):
            #bug_name, version = future_to_bug_map[future]
            #try:
                #result = future.result()
                #print(f"{bug_name} - {version} processed with result: {result}")
            #except Exception as exc:
                #print(f"{bug_name} - {version} generated an exception: {exc}")



