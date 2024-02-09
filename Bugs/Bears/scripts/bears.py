import json
import subprocess
import os

project_bugs = {}


# Load the JSON data
def load_json_data(filepath):
    with open(filepath, 'r') as file:
        return json.load(file)


def get_failing_classes_info(bug_id, data):
    for project in data:
        if project['bugId'] == bug_id:
            class_name = project['diff'].split(' ')[2]
            class_name = class_name[2:]
            return class_name
    return ""


def get_branch(bug_id, data):
    for project in data:
        if project['bugId'] == bug_id:
            repo_name = project['bugName']
            return repo_name
    return ""


def process_test_per_bug(bug_id, repo_path, data):
    for entry in data:
        if entry['bugId'] == bug_id:
            if project_bugs.get(entry['repository']['name']) is None:
                project_bugs[entry['repository']['name']] = 1
            else:
                project_bugs[entry['repository']['name']] += 1


def process_bug(bug_id, repo_path, data):
    failing_class_name = get_failing_classes_info(bug_id, data)

    # Checkout bug branch
    branch_name = get_branch(bug_id, data)
    subprocess.run(['git', 'checkout', branch_name], cwd=repo_path)

    # Remove the class name from the path
    failing_class_path_no_name = "/".join(failing_class_name.split("/")[:-1])
    buggy_dir = os.path.join(bug_id, 'buggy', failing_class_path_no_name)
    fixed_dir = os.path.join(bug_id, 'fixed', failing_class_path_no_name)
    os.makedirs(buggy_dir, exist_ok=True)
    os.makedirs(fixed_dir, exist_ok=True)

    # Commit - Buggy version
    subprocess.run(['git', 'checkout', 'HEAD^1'], cwd=repo_path)
    subprocess.run(['cp', f'{repo_path}/{failing_class_name}', fixed_dir])

    # Commit - Fix version
    subprocess.run(['git', 'checkout', 'HEAD^1'], cwd=repo_path)
    subprocess.run(['cp', f'{repo_path}/{failing_class_name}', buggy_dir])

    a = f'{buggy_dir}/{failing_class_name.split("/")[-1]}'
    b = f'{fixed_dir}/{failing_class_name.split("/")[-1]}'

    patch = os.path.join(bug_id, 'src.patch')
    with open(patch, 'w') as patch_out:
        subprocess.run(['git', 'diff', '--no-index', f'{a}', f'{b}'],
                       stdout=patch_out)


def main(repo_path):
    bug_ids = [bug['bugId'] for bug in load_json_data(f'{repo_path}/scripts/data/bug_id_and_branch.json')]
    data = load_json_data(f'{repo_path}/docs/data/bears-bugs.json')

    for bug_id in bug_ids:
        process_test_per_bug(bug_id, repo_path, data)

    for project_name, bug_count in project_bugs.items():
        print(f'| {project_name} | {bug_count} |')
