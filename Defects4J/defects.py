import csv
import shutil
import subprocess
import os
# import git
from distutils.dir_util import copy_tree


project_bugs = {}
field_list = [
    'bug.id',
    'project.id',
    'project.name',
    'project.build.file',
    'project.vcs',
    'project.repository',
    'project.bugs.csv',
    'revision.id.buggy',
    'revision.id.fixed',
    'revision.date.buggy',
    'revision.date.fixed',
    'report.id',
    'report.url',
    'classes.modified',
    'classes.relevant.src',
    'classes.relevant.test',
    'tests.relevant',
    'tests.trigger',
    'tests.trigger.cause',
    'deprecated.version',
    'deprecated.reason'
]
field_list_string = ','.join(field_list)

csv_file_path = '/Users/shrushtijagtap/uiuc/Spring2024/CS527/Project/defects4j/output.csv'
count = 0

def checkout_and_copy(bug_id, project_id, modified_classes, work_dir, repo_path, failingTests):
    # Create a folder for both buggy and fixed versions
    buggy_dir = os.path.join(f'{project_id}_{bug_id}', 'Buggy-Version')
    fixed_dir = os.path.join(f'{project_id}_{bug_id}', 'Patched-Version')
    # os.makedirs(buggy_dir, exist_ok=True)
    # os.makedirs(fixed_dir, exist_ok=True)

    # print(project_id)

    # Checkout Buggy
    subprocess.run(['defects4j', 'checkout', '-p', project_id, '-v', f"{bug_id}b", '-w', work_dir], check=True,
                   cwd=repo_path)
    shutil.copytree(work_dir, buggy_dir, ignore=shutil.ignore_patterns('.git'))
    # For each class, the file is copied to the buggy folder
    # This part can be cleaned up since its basically the same for both buggy and fixed
    # print(work_dir, 'ttttt', repo_path + project_id + bug_id)
    #copy_tree(work_dir, buggy_dir)
    # for cls in modified_classes.split(';'):
    #     src_file_path = os.path.join(work_dir, 'source', cls.replace('.', '/') + '.java')
    #     dest_file_path = os.path.join(buggy_dir, cls.replace('.', '/') + '.java')
    #     os.makedirs(os.path.dirname(dest_file_path), exist_ok=True)
    #     shutil.copy(src_file_path, dest_file_path)

    # Checkout Fix
    subprocess.run(['defects4j', 'checkout', '-p', project_id, '-v', f"{bug_id}f", '-w', work_dir], check=True,
                   cwd=repo_path)
    shutil.copytree(work_dir, fixed_dir, ignore=shutil.ignore_patterns('.git'))
    #copy_tree(work_dir, fixed_dir)
    # for cls in modified_classes.split(';'):
    #     src_file_path = os.path.join(work_dir, 'source', cls.replace('.', '/') + '.java')
    #     dest_file_path = os.path.join(fixed_dir, cls.replace('.', '/') + '.java')
    #     os.makedirs(os.path.dirname(dest_file_path), exist_ok=True)
    #     shutil.copy(src_file_path, dest_file_path)

    patch_file = os.path.join(f'{project_id}_{bug_id}', 'Diff')
    with open(patch_file, 'w') as patch_out:
        subprocess.run(['git', 'diff', '--no-index', f'{buggy_dir}', f'{fixed_dir}'],
                       stdout=patch_out)
        
    failedTests_file = os.path.join(f'{project_id}_{bug_id}', 'test.txt')
    with open(failedTests_file, 'w') as test_out:
        for test in failingTests:
            test_out.write(test+"\n")

    modifiedClasses_file = os.path.join(f'{project_id}_{bug_id}', 'modified_classes.txt')
    with open(modifiedClasses_file, 'w') as class_out:
        for mc in modified_classes.split(';'):
            class_out.write(mc.replace('.', '/') + '.java'+"\n")


def get_buffy_and_fixed_versions(repo_path, count):
    # Each line in the csv file is a bug for the project
    with open(csv_file_path, newline='') as csvfile:
        reader = csv.DictReader(csvfile, fieldnames=field_list)
        for row in reader:
            if count == 4:
                break
            count += 1 
            bug_id = row['bug.id']
            project_id = row['project.id']
            modified_classes = row['classes.modified']

            failingTests = []
            for t in row['tests.trigger'].split(';'):
                failingTests.append(t.replace("::", "."))
            print(failingTests)

            # This is where the repo will be cloned
            work_dir = os.path.join('/tmp/temp_storage', f"{project_id}_{bug_id}")
            # print(work_dir)
            checkout_and_copy(bug_id, project_id, modified_classes, work_dir, repo_path, failingTests)
            #row['revision.id.buggy'], row['revision.id.fixed']


def fill_project_bug_dict():
    with open(csv_file_path, newline='') as csvfile:
        reader = csv.DictReader(csvfile, fieldnames=field_list)
        for row in reader:
            test = len(row['tests.relevant'].split(';'))
            test_failed = len(row['tests.trigger'].split(';'))

            # failingTests = []
            # for t in row['tests.trigger'].split(';'):
            #     failingTests.append(t)
            # print(failingTests)

            if project_bugs.get(row['project.id']) is None:
                project_bugs[row['project.id']] = {"passed": test - test_failed, "failed": test_failed}
            else:
                project_bugs[row['project.id']]["passed"] += (test - test_failed)
                project_bugs[row['project.id']]["failed"] += test_failed


def process_bug(project_id, repo_path,  count):
    subprocess.run(['git', 'checkout', 'master'], cwd=repo_path)

    # Temp output file cleanup
    if os.path.exists(csv_file_path):
        os.remove(csv_file_path)

    # Generate temp output file for the project
    # This file has all the metadata for the bugs of a single project
    subprocess.run(['defects4j', 'query', '-p', project_id, '-q', field_list_string, '-o', 'output.csv'], cwd=repo_path)

    # fill_project_bug_dict was used to count the number of bugs that passed and failed
    fill_project_bug_dict()

    get_buffy_and_fixed_versions(repo_path,  count)


def main(repo_path):
    # Load bug IDs
    project_ids = ['Jsoup', 'Chart', 'Cli', 'Closure', 'Codec', 'Collections', 'Compress', 'Csv', 'Gson', 'JacksonCore',
                   'JacksonDatabind', 'JacksonXml', 'JxPath', 'Lang', 'Math', 'Mockito', 'Time']

    # project_ids = ['JxPath', 'Mockito']
    
    for project_id in project_ids:
        count = 0
        process_bug(project_id, repo_path, count)

    for project_name, bug_count in project_bugs.items():
        print(f'| {project_name} | {bug_count["passed"]} | {bug_count["failed"]} |')


main("/Users/shrushtijagtap/uiuc/Spring2024/CS527/Project/defects4j/")
#main("https://github.com/rjust/defects4j.git")