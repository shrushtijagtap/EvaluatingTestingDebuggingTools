import json
import random
import subprocess
import os

# Target repository is in the parent directory/bears-benchmark
repo_path = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', 'bears-benchmark'))
bug_entry = {}

selected_bug_ids = ['Bears-106', 'Bears-108', 'Bears-115', 'Bears-118', 'Bears-123', 'Bears-127', 'Bears-128',
                    'Bears-129', 'Bears-130', 'Bears-137', 'Bears-141', 'Bears-143', 'Bears-197', 'Bears-198',
                    'Bears-21', 'Bears-222', 'Bears-226', 'Bears-245', 'Bears-246', 'Bears-99']


def load_json_data(filepath):
    with open(filepath, 'r') as file:
        return json.load(file)


def print_random_bug_ids():
    all_bug_ids = [bug['bugId'] for bug in load_json_data(f'{repo_path}/scripts/data/bug_id_and_branch.json')]
    print(sorted(random.sample(all_bug_ids, 20)))


def get_failed_test_list(bug_id, data):
    for project in data:
        if project['bugId'] == bug_id:
            return [failure['testClass'] for failure in project['tests']['failureDetails']]
    return []


def get_branch_name(bug_id, data):
    for project in data:
        if project['bugId'] == bug_id:
            repo_name = project['bugName']
            return repo_name
    return ""


def process_bug(bug_id, data):
    # Add dictionary entry for the bug id
    bug_entry[bug_id] = {}

    # Add list of failed tests for the bug id
    bug_entry[bug_id]['failed_tests'] = get_failed_test_list(bug_id, data)

    # Create a directory for the bug id
    buggy_dir = os.path.join(bug_id, 'Buggy-Version')
    fixed_dir = os.path.join(bug_id, 'Fixed-Version')
    os.makedirs(buggy_dir, exist_ok=True)
    os.makedirs(fixed_dir, exist_ok=True)

    # Checkout the bug branch
    branch_name = get_branch_name(bug_id, data)
    subprocess.run(['git', 'checkout', branch_name], cwd=repo_path)

    # Checkout the buggy commit
    subprocess.run(['git', 'checkout', 'HEAD^1'], cwd=repo_path)
    ## Copy the entire directory to the target directory
    subprocess.run(['cp', '-r', repo_path, buggy_dir])

    # Checkout the fix commit
    subprocess.run(['git', 'checkout', 'HEAD^1'], cwd=repo_path)
    ## Copy the entire directory to the target directory
    subprocess.run(['cp', '-r', repo_path, fixed_dir])

    # Generate the diff file
    diff_file = os.path.join(bug_id, 'Diff')
    with open(diff_file, 'w') as diff:
        subprocess.run(['git', 'diff', '--no-index', buggy_dir, fixed_dir], stdout=diff)


if __name__ == '__main__':
    data = load_json_data(f'{repo_path}/docs/data/bears-bugs.json')

    # For each selected bug, run the function to extract buggy/fixed versions and generate the diff file
    for bug_id in selected_bug_ids:
        process_bug(bug_id, data)
        break

    print(json.dumps(bug_entry, indent=4))