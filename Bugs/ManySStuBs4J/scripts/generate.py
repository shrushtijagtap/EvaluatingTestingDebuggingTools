import json
import requests
import os
import git


def commit_exists(repo, commit_id):
    try:
        commit = repo.commit(commit_id)
        return True
    except git.GitCommandError:
        return False

# def fetch_changes(repo_path, commit_id, file_path):
#     repo = git.Repo(repo_path)
#     if commit_exists(repo, commit_id):
#         commit = repo.commit(commit_id)
#         for file in commit.stats.files.keys():
#             if file == file_path:
#                 blob = commit.tree / file  
#                 file_content = blob.data_stream.read().decode("utf-8")
#                 return file_content
#     return None
    
def fetch_changes(repo_path, commit_id, file_path):
    repo = git.Repo(repo_path)
    
    if commit_exists(repo, commit_id):
        commit = repo.commit(commit_id)
        
        if file_path in commit.stats.files:
            blob = commit.tree / file_path
            file_content = blob.data_stream.read().decode("utf-8")
            return file_content
        else:
            # File not found in the specified commit, try fetching from the branch
            branch_name = repo.active_branch.name
            try:
                repo.git.checkout(commit_id, force=True)
                blob = repo.commit(commit_id).tree / file_path
                file_content = blob.data_stream.read().decode("utf-8")
                return file_content
            finally:
                # Return to the original branch after fetching the file
                repo.git.checkout(branch_name, force=True)

    return None


with open('repo.txt') as clone_repos:
    repo_links = clone_repos.readlines()

for repo_link in repo_links:
    lis = []
    with open('sstubs') as f:
        d = json.load(f)

        hint = repo_link.split('/')[3]
        print(hint)
        for i in d:
            if hint in i['projectName']:
                lis.append(i)
            # lis[j['projectName']] = j
    print(len(lis))

    repo_name = hint
    leng = len(repo_link)

    if not os.path.exists(repo_name):
        os.makedirs(repo_name)
        repo = git.Repo.clone_from(str(repo_link[:leng-1]), repo_name)
    else:
        repo = git.Repo(repo_name)
    
    bugs_for_project = lis
    directory_path = "/Users/shrushtijagtap/uiuc/Spring 2024/CS 527/Project/ManySStuBs4J/" + repo_name

    if not os.path.exists(directory_path):
        os.mkdir(directory_path)
    if not os.path.exists(directory_path + '_'):
        os.mkdir(directory_path + '_')

    count = 0
    for bug in bugs_for_project:
            count = count + 1
            bug_file_path = bug['bugFilePath']
            if not os.path.exists(directory_path + '_/bug'):
                os.mkdir(directory_path + '_/bug')
            if not os.path.exists(directory_path + '_/fixed'):
                os.mkdir(directory_path + '_/fixed')
            if not os.path.exists(directory_path + '_/diff'):
                os.mkdir(directory_path + '_/diff')
            bugPath = directory_path + '_/bug/' +  str(count)
            fixedPath = directory_path + '_/fixed/' +  str(count)
            diffPath = directory_path + '_/diff/' + str(count)

            fixedFile = fetch_changes(repo_name, bug['fixCommitSHA1'], bug['bugFilePath']) 
            bugFile = fetch_changes(repo_name, bug['fixCommitParentSHA1'], bug['bugFilePath'])

            diffFile = bug['fixPatch']
            if bugFile != None:
                with open(bugPath, 'w') as file:
                    file.write(bugFile)
            if fixedFile != None:
                with open(fixedPath, 'w') as file:
                    file.write(fixedFile)
            with open(diffPath, 'w') as file:
                file.write(diffFile)

    repo.close()
    os.system(f"rm -rf {repo_name}")