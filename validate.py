import argparse
from pathlib import Path
from enum import Enum

'''
Problems founds

- Sript needs to run using the Bugs folder as the path
- Bears had "Fixed-Version" instead of "Patched-Version"
- The scripts takes into account the result folder but included any other folders we had such as scripts so we moved it to the root of the repository

'''

class Dataset(Enum):
    DEFECTS4J = "Defects4J"
    QUIXBUGS = "QuixBugs"
    BEARS = "Bears"
    BUGSWARM = "BugSwarm"


def list_bug_candidates(dataset_path):
    return [folder for folder in dataset_path.iterdir() if folder.is_dir() and folder.name != "results"]


def validate(repo_path: Path):
    validate_pass = True
    dataset_requirements = {
        Dataset.DEFECTS4J: 68,
        Dataset.QUIXBUGS: 20,
        Dataset.BEARS: 20,
        Dataset.BUGSWARM: 20
    }

    for dataset in Dataset:
        if dataset != Dataset.DEFECTS4J: continue
        dataset_path = repo_path / dataset.value

        if not dataset_path.exists():
            print(f"[FAIL] No {dataset.value} folder")
            validate_pass = False
            continue

        candidates = list_bug_candidates(dataset_path)
        min_bugs = dataset_requirements[dataset]

        if len(candidates) < min_bugs:
            print(f"[FAIL] Missing {min_bugs - len(candidates)} bugs in {dataset.value}")
            validate_pass = False

        for folder in candidates:
            if not all((folder / subfolder).exists() for subfolder in ["Buggy-Version", "Patched-Version"]):
                print(f"[FAIL] Incomplete versions in {dataset.value}-{folder.name}")
                validate_pass = False

            if not any(file.suffix == '.txt' for file in folder.iterdir()):
                print(f"[FAIL] No failed test file in {dataset.value}-{folder.name}")
                validate_pass = False

    if validate_pass:
        print("[PASS] Validation pass")


def main():
    # parser = argparse.ArgumentParser(description="Validate repository structure for bug datasets.")
    # parser.add_argument("repo_path", type=str, help="Path to the repository")
    # args = parser.parse_args()

    # validate(Path(args.repo_path))
    validate(Path("Bugs"))


if __name__ == '__main__':
    main()
