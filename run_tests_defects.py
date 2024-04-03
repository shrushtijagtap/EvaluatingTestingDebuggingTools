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
logging.basicConfig(level=logging.DEBUG)
logger = logging.getLogger(__name__)


def run_test(version_path, zippath, bname):
    command = ["defects4j", 'test', '-w', version_path, '-s', zippath]
    print("\n")
    print("command: ", command)
    try:
        result = subprocess.run(command, check=True, cwd=version_path, capture_output=True)
        print(result.stdout)
    except subprocess.CalledProcessError as e:
        logger.error(f"Failed to test {e.output}")
        failed_bug.append(bname)


def compress_and_rename(root_dir, pname):
    # Constructing the source directory path
    project_name, id = pname.split("_")
    source_dir = os.path.join(root_dir, "evosuite-tests")
    
    if "Buggy-Version" in str(root_dir):
        project_id = id + "b"
    else:
        project_id = id + "f"
    
    # Constructing the destination file name
    dest_filename = f"{project_name}-{project_id}-evosuite.1.tar.bz2"
    
    # Constructing the destination file path
    dest_path = os.path.join(source_dir, dest_filename)
    #print("dest_path: ", dest_path)
    os.makedirs(os.path.dirname(dest_path), exist_ok=True)

    # Creating a tar.bz2 file
    with tarfile.open(dest_path, "w:bz2") as tar:
        tar.add(source_dir, arcname=os.path.basename(source_dir))
    
    #print(f"Compression and renaming completed. File saved as: {dest_path}")
    return dest_filename


if __name__ == '__main__':
        # Root path for the dataset
        dataset_path = Path("/Users/shrushtijagtap/uiuc/Spring2024/CS527/Temp_test")
        version = ["Buggy-Version", "Patched-Version"]
        dpath = str(dataset_path)

        for bug in dataset_path.iterdir():
            print("*******************", bug.name,"***********************")

            if not bug.is_dir():
                print("skipping")
                continue

            version_path_buggy = dpath + "/" + bug.name + "/" + version[0]
            version_path_fixed = dpath + "/" + bug.name + "/" + version[1]

            evo_tarname_buggy = compress_and_rename(version_path_buggy, bug.name)
            evo_tarname_fixed = compress_and_rename(version_path_fixed, bug.name)
            rp_tarname_buggy = evo_tarname_buggy.replace("evosuite", "randoop")
            rp_tarname_fixed = evo_tarname_fixed.replace("evosuite", "randoop")
            # print("evo tarname buggy: ", evo_tarname_buggy, "evo tarname fixed: ", evo_tarname_fixed)
            # print("rp tarname buggy: ", rp_tarname_buggy, "rp tarname fixed: ", rp_tarname_fixed)

            print("***buggy***")
            #evo
            run_test(version_path_buggy, version_path_buggy+"/evosuite-tests/"+evo_tarname_buggy, bug.name)
            run_test(version_path_fixed, version_path_buggy+"/evosuite-tests/"+evo_tarname_buggy, bug.name)
            #rp
            run_test(version_path_buggy, version_path_buggy+"/randoop-tests/"+rp_tarname_buggy, bug.name)
            run_test(version_path_fixed, version_path_buggy+"/randoop-tests/"+rp_tarname_buggy, bug.name)


            print("\n")
            print("***fixed***")
            #evo
            run_test(version_path_buggy, version_path_fixed+"/evosuite-tests/"+evo_tarname_fixed, bug.name)
            run_test(version_path_fixed, version_path_fixed+"/evosuite-tests/"+evo_tarname_fixed, bug.name)
            #rp
            run_test(version_path_buggy, version_path_fixed+"/randoop-tests/"+rp_tarname_fixed, bug.name)
            run_test(version_path_fixed, version_path_fixed+"/randoop-tests/"+rp_tarname_fixed, bug.name)


        print("Failed bugs: ", failed_bug)