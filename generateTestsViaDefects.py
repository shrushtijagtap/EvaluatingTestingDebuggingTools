import json
import logging
import subprocess
import os
from enum import Enum
from pathlib import Path
import shutil
import tarfile

failed_bug = []

# ----  Set up logging ----
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)
GENTEST_JAR = "/Users/shrushtijagtap/uiuc/Spring2024/CS527/Project/Defrepo/defects4j/framework/bin/gen_tests.pl"


def generate_tests(version_path, bname, version):
    project, id = bname.split('_')

    if version == "Buggy-Version":
        version_bf = id + "b"
        command = [GENTEST_JAR, '-g', 'randoop', '-p', project, '-v', version_bf, '-n', '1', '-o', version_path, '-b', '240', '-E']
    else:
        version_bf = id + "f"
        command = [GENTEST_JAR, '-g', 'randoop', '-p', project, '-v', version_bf, '-n', '1', '-o', version_path, '-b', '240']
    
    try:
        subprocess.run(command, check=True, cwd=version_path, capture_output=True)
        print("Generated tests for ", bname, version)
    except subprocess.CalledProcessError as e:
        logger.error(f"Failed to generate tests with -E {e.output}, trying just regression tests now")
        try:
            command = [GENTEST_JAR, '-g', 'randoop', '-p', project, '-v', version_bf, '-n', '1', '-o', version_path, '-b', '240']
            subprocess.run(command, check=True, cwd=version_path, capture_output=True)
            print("Generated tests for ", bname, version)
        except:
            logger.error(f"Failed to generate tests all together {e.output}")
            failed_bug.append(bname)
            print("Generation of tests failed ", bname, version)
    restructure_folders(version_path, bname)


def extract_tar_bz2(file_path, extract_folder):
    with tarfile.open(file_path, "r:bz2") as tar:
        tar.extractall(path=extract_folder)


def restructure_folders(root_path, bname):
    # List all directories in the root path
        bug_name, bug_id = bname.split('_')
    # for bug_name in os.listdir(root_path):
        bug_path = os.path.join(root_path, bug_name)
        if os.path.isdir(bug_path):
            # Look for the randoop directory
            randoop_path = os.path.join(bug_path, 'randoop')
            if os.path.exists(randoop_path):
                # Move contents of the '1' directory to the 'randoop-tests' directory
                source_dir = os.path.join(randoop_path, '1')
                dest_dir = os.path.join(bug_path, 'randoop-tests')

                if os.path.exists(dest_dir):
                    shutil.rmtree(dest_dir)
                
                os.makedirs(dest_dir)
                for item in os.listdir(source_dir):
                    source_item = os.path.join(source_dir, item)
                    dest_item = os.path.join(dest_dir, item)
                    if os.path.isdir(source_item):
                        shutil.move(source_item, dest_item)
                    else:
                        shutil.move(source_item, dest_item)
                
                tar_bz2_files = [f for f in os.listdir(dest_dir) if f.endswith('.tar.bz2')]
                for tar_bz2_file in tar_bz2_files:
                    extract_tar_bz2(os.path.join(dest_dir, tar_bz2_file), dest_dir)
                
                # Move 'randoop-tests' to the root path
                shutil.move(dest_dir, root_path)
                # Remove 'randoop' and 'bug_name' directories
                shutil.rmtree(randoop_path)

                try:
                    os.rmdir(bug_path)
                except subprocess.CalledProcessError as e:
                    logger.error(f"Failed to delete temp folder: {e.output}")


if __name__ == '__main__':
        # Root path for the dataset
        dataset_path = Path("/Users/shrushtijagtap/uiuc/Spring2024/CS527/CS527-Project/Defects4J")

        for bug in dataset_path.iterdir():
            print("*******************", bug.name,"***********************")

            if not bug.is_dir() or "Mockito" in bug.name or bug.name == "results":
                # or bug.name == "Math_3":
                print("skipping")
                continue

            # Compile and generate tests for both buggy and patched versions
            for version in ["Buggy-Version", "Patched-Version"]:
                version_path = bug / version
                logger.info(f"Processing -{bug.name}-{version}")
                logger.info(f"Path: {version_path}")

                # if "Gson_4" in bug.name and "Buggy-Version" in str(version_path):
                #     continue

                generate_tests(version_path, bug.name, version)

        print("Failed bugs: ", failed_bug)