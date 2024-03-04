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
        buggy_full_path = os.path.join(path, "Buggy-Version", filename)
        fixed_full_path = os.path.join(path, "Fixed-Version", filename)

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
        buggy_full_path = os.path.join(path, "Buggy-Version", filename)
        fixed_full_path = os.path.join(path, "Fixed-Version", filename)

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
    return 0


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


def process_bug(bug_dir):
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

    buggy_complexity = find_cyclomatic_complexity(os.path.join(bug_dir, "Buggy-Version"), files_changed)
    fixed_complexity = find_cyclomatic_complexity(os.path.join(bug_dir, "Fixed-Version"), files_changed)

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
    return bug_results


if __name__ == "__main__":
    parent_dir = os.path.abspath(os.path.join(os.path.dirname(__file__), 'bears_new'))
    selected_bug_ids = ['Bears-106', 'Bears-108', 'Bears-115', 'Bears-118', 'Bears-123', 'Bears-127', 'Bears-128',
                        'Bears-129', 'Bears-130', 'Bears-137', 'Bears-141', 'Bears-143', 'Bears-197', 'Bears-198',
                        'Bears-21', 'Bears-222', 'Bears-226', 'Bears-245', 'Bears-246', 'Bears-99']

    count = 1
    benchmark_results = {}

    for bud_id in selected_bug_ids:
        if bud_id == "Bears-143":
            print("Skipping ", bud_id)
        path = os.path.join(parent_dir, bud_id)
        print("For bug ", count, " : ", path)
        count += 1

        benchmark_results[bud_id] = process_bug(path)
        print(json.dumps(benchmark_results, indent=4))

    with open(os.path.join(parent_dir, "benchmark_results.json"), "w") as file:
        json.dump(benchmark_results, file)
