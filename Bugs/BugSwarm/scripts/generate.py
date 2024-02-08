import json
import requests
import os
from unidiff import PatchSet
import git
from io import StringIO

def fetch_changes(repo_path, commit_id):
    cont = {}
    repo = git.Repo(repo_path)
    try:
        commit = repo.commit(commit_id)
        for file in commit.stats.files.keys():
            blob = commit.tree / file  
            file_content = blob.data_stream.read().decode("utf-8")
            cont[file] = file_content
    except:
        return {}
    
    return cont

def fetch_diff(repo_path, sha1, sha2):
    git_repo = git.Repo(repo_path)
    files = {}
    try:
        source_commit = git_repo.commit( sha1 )
        target_commit = git_repo.commit( sha2 )

        git_diff = source_commit.diff( target_commit )
        uni_diff_text = git_repo.git.diff(sha1+ '~1', sha2,
                                        ignore_blank_lines=True, 
                                        ignore_space_at_eol=True)
        diffs = []
        patch_set = PatchSet(StringIO(uni_diff_text))

        change_list = []

        
        for patched_file in patch_set:
            file_path = patched_file.path  
            del_line_no = [line 
                        for hunk in patched_file for line in hunk 
                        if line.is_added and
                        line.value.strip() != '']  
            ad_line_no = [line for hunk in patched_file 
                        for line in hunk if line.is_removed and
                        line.value.strip() != '']   
            files[file_path] = str(del_line_no) + '\n' + str(ad_line_no)
    except:
        return files
    return files

lis = {}
with open('/home/ashwin/UIUC/CS527/Export.json') as f:
    d = json.load(f)

    for j in d:
        if j['repo'] not in lis:
            lis[j['repo']] = []
        lis[j['repo']].append(j)
        
for j in lis:
    repo_name = j.split('/')[0]
    if not os.path.exists(repo_name):
        os.makedirs(repo_name)
        repo = git.Repo.clone_from('https://github.com/' + j + '.git', repo_name)
    else:
        repo = git.Repo(repo_name)

    bugs_for_project = lis[j]
    directory_path = "/home/ashwin/UIUC/CS527/" + repo_name
    if not os.path.exists(directory_path):
        os.mkdir(directory_path)
    if not os.path.exists(directory_path + '_'):
        os.mkdir(directory_path + '_')

    count = 0
    for bug in bugs_for_project:
        count = count + 1
        if not os.path.exists(directory_path + '_/bug'):
            os.mkdir(directory_path + '_/bug')
        if not os.path.exists(directory_path + '_/fixed'):
            os.mkdir(directory_path + '_/fixed')
        if not os.path.exists(directory_path + '_/diff'):
            os.mkdir(directory_path + '_/diff')
        
        bugFiles = fetch_changes( repo_name, bug['failed_job']['trigger_sha'])
        
        fixedFiles = fetch_changes(repo_name, bug['passed_job']['trigger_sha'])
        diffFiles = fetch_diff(repo_name, bug['failed_job']['trigger_sha'], bug['passed_job']['trigger_sha'])
        c = 0
        for bugFile in bugFiles:
        # diffFile = bug['fixPatch']
            bugPath = directory_path + '_/bug/_' +  str(count) + '_' + str(c)
            c = c+1
        # diffPath = directory_path + '_/diff/_' + str(count)
            if bugFiles[bugFile] != None:
                with open(bugPath, 'w') as file:
                    file.write(bugFiles[bugFile])
        c=0
        for fixedFile in fixedFiles:
            fixedPath = directory_path + '_/fixed/_' +  str(count) + '_' + str(c)
            c = c+1
            if fixedFiles[fixedFile] != None:
                with open(fixedPath, 'w') as file:
                    file.write(fixedFiles[fixedFile])
        c=0
        for diffFile in diffFiles:
            diffPath = directory_path + '_/diff/_' + str(count) + '_' + str(c)
            c = c+1
            if diffFiles[diffFile] != None:

                with open(diffPath, 'w') as file:
                    file.write(diffFiles[diffFile])

    repo.close()
    os.system(f"rm -rf {repo_name}")
    # break
    # print(lis[0])


# /home/ashwin/UIUC/CS527/Activiti
    