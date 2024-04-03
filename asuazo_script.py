import json
import logging
import shutil
import subprocess
import os
from concurrent.futures import ProcessPoolExecutor, as_completed
from enum import Enum
from pathlib import Path

"""
NOTES:

Bears-222 needs to be run manually since it has multiple nested projects
Bears-198 has test that fail in the patched version as well

"""

# ----  Set up logging ----
logging.basicConfig(level=logging.DEBUG)
logger = logging.getLogger(__name__)

# ---- Configuration variables ----

# repo path = current directory
REPO_PATH: Path = Path.cwd()
EVOSUITE_JAR = os.path.join(os.path.expanduser("~"), "Downloads", "evosuite-1.2.0.jar")
RANDOOP_JAR = os.path.join(os.path.expanduser("~"), "Downloads", "randoop-4.3.2", "randoop-all-4.3.2.jar")
FAILED_PROJECTS = []

# Used to skip certain steps
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
    DEFECTS4J = "Defects4J"
    QUIXBUGS = "QuixBugs"
    BEARS = "Bears"
    BUGSWARM = "BugSwarm"


def initialize_jenv():
    """
    Using this at the moment to ensure that my Java environment is set up correctly
    """
    subprocess.check_output(['jenv', 'init', '-'], universal_newlines=True)
    # Set the JAVA_HOME environment variable to /Library/Java/JavaVirtualMachines/temurin-8.jdk/Contents/Home
    os.environ['JAVA_HOME'] = '/Library/Java/JavaVirtualMachines/temurin-8.jdk/Contents/Home'


def copy_dependencies(project_dir):
    """
    Copy the dependencies to the project directory
    """
    command = ['mvn', 'dependency:copy-dependencies']

    log_file_path = project_dir / 'dependencies.log'

    with open(log_file_path, 'w') as log_file:
        try:
            subprocess.run(command, check=True, cwd=project_dir, stdout=log_file, stderr=log_file)
            return True, ""
        except subprocess.CalledProcessError as e:
            return False, f"Copy dependency failed. Logs stored in: {log_file_path}"


def get_class_name_by_test_name(base_path: Path, class_names: set, version: str):
    failed_test_file = base_path / 'test.txt'
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
    """
    Compile a single project using Maven. If compilation fails, continue with the next project and
    add the project to the list of failed projects to check manually later.
    """
    logger.info(f"Compiling project {project_dir}...")
    command = ['mvn', 'clean', 'compile']

    log_file_path = project_dir / 'compile.log'

    with open(log_file_path, 'w') as log_file:
        try:
            subprocess.run(command, check=True, cwd=project_dir, stdout=log_file, stderr=log_file)
            return True, ""
        except subprocess.CalledProcessError as e:
            return False, f"Compilation failed. Logs stored in: {log_file_path}"


def get_maven_classpath(project_dir):
    command = ['mvn', 'dependency:build-classpath', '-Dmdep.outputFile=cp.txt']

    log_file_path = project_dir / 'compile.log'

    with open(log_file_path, 'w') as log_file:
        try:
            subprocess.run(command, check=True, cwd=project_dir, stdout=log_file, stderr=log_file)
            classpath_file = os.path.join(project_dir, 'cp.txt')
            with open(classpath_file, 'r') as file:
                return file.read().strip()
        except subprocess.CalledProcessError as e:
            return ""


def generate_randoop_test(project_dir: Path, classpath: str, testclass: str, output_dir: str):
    """
    Generate tests for a single test class using Randoop
    """

    # TODO: Use the version to determine what test to generate and where to place it

    # java -classpath ${RANDOOP_JAR} randoop.main.Main gentests --classlist=myclasses.txt --time-limit=60
    # Add RANDOOP_CONFIG to the command
    command = [
        'java', '-classpath', f"{classpath}:{RANDOOP_JAR}", 'randoop.main.Main', 'gentests',
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


def run_tests_and_generate_report(project_dir: Path):
    # Run the tests
    subprocess.run(['mvn', 'clean', 'clover:setup', 'test', '-Dmaven.test.failure.ignore=true', 'clover:aggregate',
                    'clover:clover'], cwd=project_dir, check=True)


def process_bug(bug_path: Path, version: str, dataset: Dataset):
    bug_name = bug_path.name
    version_path = bug_path / version

    logger.info(f"Processing {bug_name} - {version}")

    # Compile the project if it has not been compiled yet
    if RECOMPILE or not (version_path / 'target').exists():
        success, error_message = compile_project(version_path)

        # If project was not compiled successfully, add it to the list of failed projects
        # and continue with the next project.
        if not success:
            FAILED_PROJECTS.append({
                "dataset": dataset.value,
                "bug": bug_name,
                "version": version,
                "error": error_message
            })
            logger.error(f" **** Failed to compile {dataset.value}-{bug_name}-{version} **** ")
            return
    else:
        logger.info(f"Project already compiled: {dataset.value}-{bug_name}-{version}")

    if GET_CLASSPATH_AND_DEPENDENCIES:
        success, error_message = copy_dependencies(version_path)
        if not success:
            return "Failed to copy dependencies"

    # ----  Project is compiled, generate tests ----
    # Get the list of failed tests for the bug to check the class we need to generate tests for
    class_names = set()
    get_class_name_by_modified_test_file(version_path.parent, class_names, version)

    logger.debug(f"Failed class: {class_names}")

    # Get the classpath for the project
    classpath = get_maven_classpath(version_path)
    if not classpath:
        logger.error(f"Failed to get classpath for {dataset.value}-{bug_name}-{version}")
        return "Failed to get classpath"

    classpath = f"{str(version_path / 'target' / 'classes')}{os.pathsep}{classpath}"

    # Check if project has either a test or src/test/java folder
    test_dir = version_path / 'src' / 'test' / 'java'
    if not test_dir.exists():
        test_dir = version_path / 'test'
        if not test_dir.exists():
            logger.error(f"Project does not either test or src/test/java dir")
            return "Project does not have a test directory"

    opposite_version = "Patched-Version" if version == "Buggy-Version" else "Buggy-Version"

    # Output directory for the generated tests should be in the existing test folder
    randoop_output_dir = version_path / 'randoop-tests'
    # Create a path for the opposite version
    randoop_output_dir_opposite = bug_path / opposite_version / 'randoop-tests-from-other-version'

    # Create the output directory if it does not exist
    randoop_output_dir.mkdir(parents=True, exist_ok=True)
    randoop_output_dir_opposite.mkdir(parents=True, exist_ok=True)

    evo_output_dir = version_path / 'evosuite-tests'
    evo_output_dir_opposite = bug_path / opposite_version / 'evosuite-tests-from-other-version'

    # Create the output directory if it does not exist
    evo_output_dir.mkdir(parents=True, exist_ok=True)
    evo_output_dir_opposite.mkdir(parents=True, exist_ok=True)

    # TEST GENERATION
    for testclass in class_names:

        if GENERATE_RANDOOP_TESTS:
            logger.info(f"Generating tests for {testclass} in {version}...")

            # ----- RANDOOP -----

            success, error_message = generate_randoop_test(version_path, classpath, testclass, str(randoop_output_dir))

            if not success:
                logger.error(f"Failed to randoop generate tests for {testclass} in {version}. Error: {error_message}")
                continue


        # ----- EVOSUITE -----
        if GENERATE_EVO_TESTS:
            # Generate tests
            success, error_message = generate_evosuite_test(version_path, classpath, testclass,
                                                            str(evo_output_dir))

            if not success:
                logger.error(f"Failed to generate tests for {testclass} in {version}. Error: {error_message}")
                continue

            # Place them in the project test folder
            rename_and_copy_tests(evo_output_dir, test_dir, "Evosuite")

            # Place a copy of the generated tests in the opposite version
            copy_tests(evo_output_dir, evo_output_dir_opposite)

            logger.info(f"Test generation completed for {dataset.value}-{bug_name}-{version}")

        if RUN_TESTS:
            # Run the tests and generate the report
            run_tests_and_generate_report(version_path)

            logger.info(f"Tests run and report generated for {dataset.value}-{bug_name}-{version}")

    return bug_name, version


if __name__ == '__main__':
    # For each dataset:
    # For each bug:
    # For both buggy and patched versions:
    # 1. Compile the project
    # 2. Run Randoop to generate tests
    # 3. Store generated tests under the projects test folder
    # 4. Rename the generated tests to be prefixed with "Randoop"

    # NOTE: You can remove this is your JAVA_HOME is already set or modify it to point to the correct path
    initialize_jenv()
    dataset = Dataset.BEARS
    dataset_path = REPO_PATH / dataset.value
    bugs = [bug for bug in dataset_path.iterdir() if
            bug.is_dir() and bug.name not in ["results"] and bug.name in ["Bears-21", "Bears-222", "Bears-198", "Bears-226", "Bears-245", "Bears-246",]]

    # ----  Process the bugs in parallel ----
    with ProcessPoolExecutor(max_workers=os.cpu_count()) as executor:
        # Stores all futures
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
