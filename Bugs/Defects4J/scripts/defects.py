import csv
import shutil
import subprocess
import os

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

csv_file_path = 'defects4j/output.csv'


def checkout_and_copy(bug_id, project_id, modified_classes, work_dir, repo_path):

    buggy_dir = os.path.join(f'{project_id}_{bug_id}', 'buggy')
    fixed_dir = os.path.join(f'{project_id}_{bug_id}', 'fixed')
    os.makedirs(buggy_dir, exist_ok=True)
    os.makedirs(fixed_dir, exist_ok=True)

    # Checkout Buggy
    subprocess.run(['defects4j', 'checkout', '-p', project_id, '-v', f"{bug_id}b", '-w', work_dir], check=True, cwd=repo_path)

    # Modified class struct
    # org.apache.commons.math3.fraction.BigFraction;org.apache.commons.math3.fraction.Fraction
    for cls in modified_classes.split(';'):
        src_file_path = os.path.join(work_dir, 'src', cls.replace('.', '/') + '.java')
        dest_file_path = os.path.join(buggy_dir, cls.replace('.', '/') + '.java')
        os.makedirs(os.path.dirname(dest_file_path), exist_ok=True)
        shutil.copy(src_file_path, dest_file_path)

    # Checkout Fix
    subprocess.run(['defects4j', 'checkout', '-p', project_id, '-v', f"{bug_id}f", '-w', work_dir], check=True,
                   cwd=repo_path)

    for cls in modified_classes.split(';'):
        src_file_path = os.path.join(work_dir, 'src', cls.replace('.', '/') + '.java')
        dest_file_path = os.path.join(fixed_dir, cls.replace('.', '/') + '.java')
        os.makedirs(os.path.dirname(dest_file_path), exist_ok=True)
        shutil.copy(src_file_path, dest_file_path)

    patch_file = os.path.join(f'{project_id}_{bug_id}', 'src.patch')
    with open(patch_file, 'w') as patch_out:
        subprocess.run(['git', 'diff', '--no-index', f'{buggy_dir}', f'{fixed_dir}'],
                       stdout=patch_out)


def process_bug(project_id, repo_path):

    subprocess.run(['git', 'checkout', 'master'], cwd=repo_path)

    # Temp output file cleanup
    if os.path.exists(csv_file_path):
        os.remove(csv_file_path)

    # Generate temp output file for the project
    subprocess.run(['defects4j', 'query', '-p', project_id, '-q', field_list_string, '-o', 'output.csv'], cwd=repo_path)

    with open(csv_file_path, newline='') as csvfile:
        reader = csv.DictReader(csvfile, fieldnames=field_list)
        for row in reader:
            test = len(row['tests.relevant'].split(';'))
            test_failed = len(row['tests.trigger'].split(';'))

            if project_bugs.get(row['project.id']) is None:
                project_bugs[row['project.id']] = {"passed": test - test_failed, "failed": test_failed}
            else:
                project_bugs[row['project.id']]["passed"] += (test - test_failed)
                project_bugs[row['project.id']]["failed"] += test_failed

    # with open(csv_file_path, newline='') as csvfile:
    #     reader = csv.DictReader(csvfile, fieldnames=field_list)
    #     for row in reader:
    #         bug_id = row['bug.id']
    #         project_id = row['project.id']
    #         modified_classes = row['classes.modified']
    #
    #         work_dir = os.path.join('/tmp/temp_storage', f"{project_id}_{bug_id}")
    #
    #         if int(bug_id) > 169:
    #             checkout_and_copy(bug_id, project_id, row['revision.id.buggy'], row['revision.id.fixed'], modified_classes,
    #                           work_dir, repo_path)


def main(repo_path):
    # Load bug IDs
    project_ids = ['Chart', 'Cli', 'Closure', 'Codec', 'Collections', 'Compress', 'Csv', 'Gson', 'JacksonCore',
                   'JacksonDatabind', 'JacksonXml', 'Jsoup', 'JxPath', 'Lang', 'Math', 'Mockito', 'Time']

    for project_id in project_ids:
        process_bug(project_id, repo_path)

    for project_name, bug_count in project_bugs.items():
        print(f'| {project_name} | {bug_count["passed"]} | {bug_count["failed"]} |')
