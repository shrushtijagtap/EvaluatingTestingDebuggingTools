import xml.etree.ElementTree as ElementTree

import json
import logging
import os
from enum import Enum
from pathlib import Path

# ----  Set up logging ----
logging.basicConfig(level=logging.DEBUG)
logger = logging.getLogger(__name__)

# repo path = current directory
REPO_PATH: Path = Path.cwd()


class Dataset(Enum):
    DEFECTS4J = "Defects4J"
    QUIXBUGS = "QuixBugs"
    BEARS = "Bears"
    BUGSWARM = "BugSwarm"


# ---- Configuration variables ----
MANUAL_CONFIG = {
    "dataset": [Dataset.BEARS],
    "bug_id": ["Bears-21"],
}


def parse_coverage_report(report_path, modified_classes):
    tree = ElementTree.parse(report_path)
    root = tree.getroot()
    test_hits = {}
    for file_element in root.findall('.//file'):
        class_name = file_element.get('name').replace('/', '.')[:-5]
        # logger.debug(f"Modified classes: {modified_classes}")
        # We only care about the modified classes
        if class_name in modified_classes:
            for line in file_element.findall('.//line'):

                line_number = int(line.get('num'))
                test_hits[line_number] = {"total": 0, "fail": 0}

                logger.debug(f"Line number: {line_number}")

                # Check if the line was covered by failing tests
                # <line falsecount="8" truecount="13" num="52" type="cond"/>
                false_count = line.get('falsecount', None)
                if false_count:
                    false_count = int(false_count)
                    test_hits[line_number]["fail"] = false_count
                else:
                    hit_count = int(line.get('count'))
                    logger.debug(f"Hit count: {hit_count}")
                    test_hits[line_number]["total"] = hit_count

    return test_hits


def process_projects():
    results = {}

    for dataset in MANUAL_CONFIG["dataset"]:
        dataset_path = os.path.join(REPO_PATH, dataset.value)

        # Check each directory, skip it if there is no clover.xml
        for bug_dir in MANUAL_CONFIG["bug_id"]:
            bug_path = os.path.join(dataset_path, bug_dir)
            xml_path = os.path.join(bug_path, 'Buggy-Version', 'target', 'site', 'clover', 'clover.xml')
            if not os.path.exists(xml_path):
                print(f"No coverage for {bug_dir}")
                continue

            with open(os.path.join(bug_path, 'modified_classes.txt'), 'r') as file:
                modified_classes = [line.strip().replace('/', '.') for line in file.readlines()]
                # Extract the last part of the class name
                modified_classes = [class_name.split('.')[-2] for class_name in modified_classes]

            results[bug_dir] = parse_coverage_report(xml_path, modified_classes)

    return results


if __name__ == '__main__':
    results = process_projects()
    print(json.dumps(results, indent=4))
