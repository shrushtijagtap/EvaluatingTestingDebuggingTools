import json

from codebleu import calc_codebleu
from Levenshtein import distance
import re
import os
import lizard


## NEW VERSION

def codebleu(path, bug_file_list):
    # Dictionary of codebleu scores
    codebleu_scores = {}

    for filename in bug_file_list:
        # Get the buggy and fixed versions
        buggy_full_path = os.path.join(path, "Buggy-Version", "java_programs", filename)
        fixed_full_path = os.path.join(path, "Patched-Version", "correct_java_programs", filename)

        # Read the files
        with open(buggy_full_path, 'r') as file:
            buggy_code = file.read()

        with open(fixed_full_path, 'r') as file:
            fixed_code = file.read()

        result = calc_codebleu([buggy_code], [fixed_code], lang="java", weights=(0.25, 0.25, 0.25, 0.25),
                               tokenizer=None)
        codebleu_scores[filename] = result["codebleu"]

    return codebleu_scores


def get_levenshtein_distance(path, bug_file_list):
    levenshtein_distances = {}

    for filename in bug_file_list:
        # Get the buggy and fixed versions
        buggy_full_path = os.path.join(path, "Buggy-Version", "java_programs", filename)
        fixed_full_path = os.path.join(path, "Patched-Version", "correct_java_programs", filename)

        print(bug_file_list)

        # Read the files
        with open(buggy_full_path, 'r') as file:
            buggy_code = file.read()

        with open(fixed_full_path, 'r') as file:
            fixed_code = file.read()

        # Check distance
        levenshtein_distances[filename] = distance(buggy_code, fixed_code)
    return levenshtein_distances


def find_cyclomatic_complexity(path, bug_file_list):
    result = 0
    for filename in bug_file_list:
        full_path = os.path.join(path, filename)
        analysis_result = lizard.analyze_file(full_path)
        file_complexity = sum(function.cyclomatic_complexity for function in analysis_result.function_list)
        result += file_complexity

    return result


def get_subdirectories(folder_path):
    entries = os.listdir(folder_path)
    subdirectories = [entry for entry in entries if os.path.isdir(os.path.join(folder_path, entry))]
    return subdirectories


def get_class_change_count(diff):
    class_pattern = re.compile(r'^(?!\s*//).*\s+\bclass\b\s+')
    class_names = set()

    for line in diff:
        match = re.match(class_pattern, line)
        if match:
            print(line)
            # TODO: the public/protected word might not be used in all class definitions
            name_pattern = re.compile(r'\b(?:public|protected)?\s*class\s+(\w+)')
            class_name = name_pattern.search(line)
            class_names.add(class_name.group(1))

    return len(class_names)


def get_method_change_count(diff):
    noOfMethodsChanged = 0
    pattern = re.compile(r'\b(private|protected|public)\s+(?!class\b)\w+')

    for line in diff:
        match = re.search(pattern, line)
        if match:
            noOfMethodsChanged+=1

    if noOfMethodsChanged <= 0:
        return 1

    return noOfMethodsChanged



def get_line_change_count(diff):
    line_change_pattern = re.compile(r'^(?![+\-]{3})[+\-]')
    line_change_count = 0
    for line in diff:
        if re.match(line_change_pattern, line):
            line_change_count += 1

    return line_change_count


def get_files_changed(diff):
    files_changed = []
    for line in diff:
        if line.startswith('+++') and line.strip().endswith('.java'):
            split_line = line.strip().split('/')
            parsed_line = '/'.join(split_line[4:])
            files_changed.append(parsed_line)

    return files_changed


def process_bug(bug_dir, option=None):
    # Get the diff file
    diff = []
    with open(os.path.join(bug_dir, "Diff")) as diff_file:
        for line in diff_file:
            diff.append(line)

    # Get the number of classes changed
    classes_change_count = get_class_change_count(diff)

    # Get the number of methods changed
    method_change_count = get_method_change_count(diff)

    # Get the number of lines changed
    lines_change_count = get_line_change_count(diff)

    # print("CChange :", classes_change_count)
    # print("MChange :", method_change_count)
    # print("LChange :", lines_change_count)

    files_changed = get_files_changed(diff)
    print("Files changed: ", files_changed)

    levenshtein_distances = get_levenshtein_distance(bug_dir, files_changed)
    # print("LD: ", levenshtein_distances)

    buggy_complexity = find_cyclomatic_complexity(os.path.join(bug_dir, "Buggy-Version", "java_programs"), files_changed)
    fixed_complexity = find_cyclomatic_complexity(os.path.join(bug_dir, "Patched-Version", "correct_java_programs"), files_changed)

    # print("CB: ", buggy_complexity)
    # print("CP: ", fixed_complexity)
    # print("CC: ", abs(buggy_complexity - fixed_complexity))

    codebleu_scores = codebleu(bug_dir, files_changed)
    # print("CodeBLEU: ", codebleu_scores)

    # Dict entry with all the data
    bug_results = {
        "CChange": classes_change_count,
        "MChange": method_change_count,
        "LChange": lines_change_count,
        "LD": levenshtein_distances,
        "CB": buggy_complexity,
        "CP": fixed_complexity,
        "CC": abs(buggy_complexity - fixed_complexity),
        "CodeBLEU": codebleu_scores
    }
    if option != None:
        return bug_results[option]
    return bug_results


if __name__ == "__main__":
    # parent_dir = "/Users/sejalpekam/MCS/Spring 24/CS 527 Topics in SE/Milestone 2/CS527-Project/Bugs/QuixBugs"
    # dir_paths = get_subdirectories(parent_dir)
    # print(dir_paths)
    parent_dir = os.path.abspath(os.path.join(os.path.dirname(__file__)))
    selected_bug_ids = ['GCD', 'BUCKETSORT', 'KNAPSACK', 'LEVENSHTEIN', 'QUICKSORT', 'FIND_IN_SORTED', 'LIS', 'BREADTH_FIRST_SEARCH', 'POSSIBLE_CHANGE', 'LCS_LENGTH', 'SHORTEST_PATH_LENGTH', 'DEPTH_FIRST_SEARCH', 'FLATTEN', 'TO_BASE', 'SIEVE', 'NEXT_PALINDROME', 'IS_VALID_PARENTHESIZATION', 'SHORTEST_PATHS', 'SHUNTING_YARD', 'NEXT_PERMUTATION', 'KTH', 'REVERSE_LINKED_LIST', 'GET_FACTORS', 'SUBSEQUENCES', 'MERGESORT']
    count = 1
    benchmark_results = {}

    for bug_id in selected_bug_ids:
        path = os.path.join(parent_dir, bug_id)
        print("For bug ", count, " : ", path)
        count += 1

        benchmark_results[bug_id] = process_bug(path)
        print(json.dumps(benchmark_results, indent=4))

    with open(os.path.join(parent_dir, "results/benchmark_results.json"), "w") as file:
        json.dump(benchmark_results, file)
