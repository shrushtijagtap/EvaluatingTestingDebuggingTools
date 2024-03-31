import json
import logging
import subprocess
import os
from enum import Enum
from pathlib import Path

# ----  Set up logging ----
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)
GENTEST_JAR = "/Users/shrushtijagtap/uiuc/Spring2024/CS527/Project/Defrepo/defects4j/framework/bin/gen_tests.pl"

def generate_tests(version_path, bname, version):
    project, id = bname.split('_')
    if version == "Buggy-Version":
        version_bf = id + "b"
    else:
        version_bf = id + "f"

    command = [GENTEST_JAR, '-g', 'evosuite', '-p', project, '-v', version_bf, '-n', '1', '-o', version_path, '-b', '240']
    try:
        subprocess.run(command, check=True, cwd=version_path, capture_output=True)
    except subprocess.CalledProcessError as e:
        logger.error(f"Failed to compile {e.output}")
 

if __name__ == '__main__':
        # Root path for the dataset
        dataset_path = Path("/Users/shrushtijagtap/uiuc/Spring2024/CS527/Defects4J-Pending")

        for bug in dataset_path.iterdir():
            print("*******************", bug.name,"***********************")

            if not bug.is_dir():
                continue

            # Compile and generate tests for both buggy and patched versions
            for version in ["Buggy-Version", "Patched-Version"]:
                version_path = bug / version
                logger.info(f"Processing -{bug.name}-{version}")
                logger.debug(f"Path: {version_path}")

                generate_tests(version_path, bug.name, version)


