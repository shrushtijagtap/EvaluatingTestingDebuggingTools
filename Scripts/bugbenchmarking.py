from codebleu import calc_codebleu
from Levenshtein import distance
import re
import fnmatch
import os
import subprocess

def codebleu(buggy_path, patched_path):
    buggy_code = ""
    with open(buggy_path, 'r') as file:
        for line in file:
            buggy_code += line.strip() + "\n"

    patched_code = ""
    with open(patched_path, 'r') as file:
        for line in file:
            patched_code+= line.strip() + "\n"
            
    result = calc_codebleu([buggy_code], [patched_code], lang="java", weights=(0.25, 0.25, 0.25, 0.25), tokenizer=None)
    print(result)
    print("Codebleu value: " , result['codebleu'])


#buggy_code and patched_code are list[str]
def find_levenshtein(buggy_path, patched_path): 
    buggy_code = []
    with open(buggy_path, 'r') as file:
        for line in file:
            buggy_code.append(line.strip())

    patched_code = []
    with open(patched_path, 'r') as file:
        for line in file:
            patched_code.append(line.strip())
        result = distance(buggy_code, patched_code)
        print("Levenshtein distance: ", result)


def calculateNoOfLinesChanged(lines):
    noOfLinesChanged = 0
    addDelList = ["+", "-"]

    for line in lines:
        if line[0] in addDelList:
            noOfLinesChanged+=1
    return noOfLinesChanged


def calculateNoOfClassesChanged(lines):
    noOfClassesChanged = 0
    pattern = re.compile(r'\b(public|private|protected|final)\s+class\b')
    pattern1 = re.compile(r'\bclass\s+\w+\s+extends\s+\w+\b')
    pattern2 = re.compile(r'^(?!//).*\bclass\b')

    for line in lines:
        match = re.search(pattern, line)
        match1 = re.search(pattern1, line)
        match2 = re.search(pattern2, line)
        if match or match1 or match2:
            noOfClassesChanged+=1
    return noOfClassesChanged


def calculateNoOfMethodsChanged(lines):
    noOfMethodsChanged = 0
    pattern = re.compile(r'\b(private|protected|public)\s+(?!class\b)\w+')

    for line in lines:
        match = re.search(pattern, line)
        if match:
            noOfMethodsChanged+=1

    return noOfMethodsChanged


def get_subdirectories(folder_path):
    entries = os.listdir(folder_path)
    subdirectories = [entry for entry in entries if os.path.isdir(os.path.join(folder_path, entry))]
    return subdirectories


def find_file_by_partial_path(folder_path, partial_file_path):
    for root, dirs, files in os.walk(folder_path):
        for file in files:
            full_path = os.path.join(root, file)
            if fnmatch.fnmatch(full_path, '*' + partial_file_path + '*'):
                return full_path
    return None

def find_full_path(parent_dir, partial_path):
    # Check if the partial path exists in the current directory
    if partial_path in os.listdir(parent_dir):
        return os.path.join(parent_dir, partial_path)

    # Recursively search through subdirectories
    for entry in os.listdir(parent_dir):
        full_entry_path = os.path.join(parent_dir, entry)
        if os.path.isdir(full_entry_path):
            full_path = find_full_path(full_entry_path, partial_path)
            if full_path:
                return full_path

    # If partial path is not found in the parent directory or its subdirectories
    return None



#Actual Code
parent_dir = "/Users/shrushtijagtap/uiuc/Spring2024/CS527/Project/Defects4J_Projects/"
dir_paths = get_subdirectories(parent_dir)
count = 1

for dir in dir_paths:
    path = os.path.join(parent_dir, dir)
    print("For bug ", count,  " : " , path)
    count += 1

    diff = []
    with open(os.path.join(path, "src.patch"), encoding='latin-1') as patchFile:
        for line in patchFile:
            diff.append(line)

    cChange = calculateNoOfClassesChanged(diff)
    mChange = calculateNoOfMethodsChanged(diff)
    lChange = calculateNoOfLinesChanged(diff)

    print("cChange :", cChange)
    print("mChange :", mChange)
    print("lChange :", lChange)

    modified_classes = []
    with open(os.path.join(path, "modified_classes.txt"), encoding='latin-1') as classFile:
        for file in classFile:
            modified_classes.append(file.strip())

    for mc in modified_classes:
        print("For mc: ", mc)

        # Find a file wiht partial path "mc" in the directory path
        # start_path = path+"Buggy-Version"
        # command1 = f"find {start_path} -path {mc}"
        # result1 = subprocess.run(command1, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)

        # start_path = path+"Patched-Version"
        # command2 = f"find {start_path} -path {mc}"
        # result2 = subprocess.run(command1, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)

        #file_loc_buggy = find_file_by_partial_path(path+"Buggy-Version", mc)
        #file_loc_fixed = find_file_by_partial_path(path+"Patched-Version", mc)

        file_loc_buggy = find_full_path(path+"/Buggy-Version", mc)
        file_loc_fixed = find_full_path(path+"/Patched-Version", mc)

        # if result1 == 0 and result2 == 0:
        print(file_loc_buggy, " ", file_loc_fixed)

        if file_loc_buggy and file_loc_fixed:
            levenshteinDistance = find_levenshtein(result1.stdout, result2.stdout)
            codebleu_dis = codebleu(result1.stdout, result2.stdout)

            print("levenshteinDistance :", levenshteinDistance)
            print("codebleu_dis :", codebleu_dis)
        else:
            print("Couldn't fetch modified file")
