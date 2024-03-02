from codebleu import calc_codebleu
from Levenshtein import distance

buggy_path = "/Users/sejalpekam/MCS/Spring 24/CS 527 Topics in SE/Milestone 2/CS527-Project/Bugs/QuixBugs/KTH/Buggy-Version/KTH.java"
patched_path = "/Users/sejalpekam/MCS/Spring 24/CS 527 Topics in SE/Milestone 2/CS527-Project/Bugs/QuixBugs/KTH/Patched-Version/KTH.java"


def codeblue(buggy_path, patched_path):
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
    #result is a dictionary. codeblue is a key

codeblue(buggy_path, patched_path)


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

find_levenshtein(buggy_path, patched_path)