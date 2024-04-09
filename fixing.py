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
BUGSW_PATH ="/Users/shreyachaudhary/Desktop/cs527/CS527-Project/BugSwarm"
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


def extract_paths_from_diff_file(bug_path,version):
    diff_file_path = f'{bug_path}/Diff'
    logger.info({bug_path})
    modified_classes_file_path = f'{bug_path}/modified_classes.txt'

    discard_lines = []
    og_dir=[]


    with open("Diff", 'r') as input:
        for line in input.readlines():
            if(line.startswith("diff --git")):
                line = line.split(' b')
                for l in line:
                    l = l.split('/')
                    l = l[l.index('BugSwarm'):]
                    l = '/'.join(l).rstrip('\n')
                    diff_file_path.append(l)

    with open('modified_classes.txt', 'r') as discard:
        for dis in discard.readlines():
            modified_classes_file_path.append(dis.rstrip('\n'))


    for inpl in diff_file_path:
        for disl in modified_classes_file_path:
            if disl in inpl:
                inpl = inpl.removesuffix(disl)
                og_dir.append(inpl)

    return [line for line in output_lines if  version in line]




def process_bug(bug_path, version, dataset):
    """Process a single bug for both versions."""
    bug_name = bug_path.name
    version_path = bug_path / version
    logger.info(f"Processing {bug_name} - {version}")

    #ogl_dir = extract_paths_from_diff_file(bug_path,version)
    #logger.info({og_dir})

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
    logger.info({bug_path})
    if GET_CLASSPATH_AND_DEPENDENCIES:
        success, error_message = copy_dependencies(bug_path, version_path)
        if not success:
            return f"Failed to copy dependencies for {dataset.value}-{bug_name}-{version}"

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
