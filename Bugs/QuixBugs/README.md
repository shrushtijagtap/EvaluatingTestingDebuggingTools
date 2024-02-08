# Quix Dataset

## Explanation
QuixBugs is a program-repair tool which tries to work and find bugs with multi-lingual support - Python and Java. QuixBugs conatains 40 programs, each program containing only one line bugs. QuixBug also introduces test case which are common to both the languages. The repository itself contains buggy programs, fixed programs and common testcases for Python and Java. 

When Java testcases are run, a report is auto-generated on gradle stating how many test cases exist, how many passed, how many failed: all the distribution statistics. Whereas for Python, running the testcases via pytest directly shows output in the terminal itself with all the distribution statistics. 

Commands to test Java and Python programs:
```sh
gradle --scan test  #Command to run tests on all buggy Java programs

python3 pytest python_testcases   #Command to run tests on all buggy Python programs
```

After running all the tests and storing the information we got, we wrote a shell script to extract buggy files from java_programs and python_programs directory and fixed files from correct_java_programs and correct_python_programs. We also generated patch files and committed all this in the project repository under QuixBugs folder.

Command to generate diff/patch file:
```sh
diff --color -ur correct_java_programs/BREADTH_FIRST_SEARCH.java java_programs/BREADTH_FIRST_SEARCH.java > src.patch
```

## Number of Bugs Collected
Bugs Collected for Java: Total = 260 bugs

| Program | Total | Passed | Failed |
| --- | --- | --- | --- |
| Bitcount | 9 | 0 | 9 |
| breadth_first_search | 5 | 4 | 1 |
| bucketsort | 6 | 0 | 6 |
| depth_first_search | 5 | 4 | 1 |
| detect_cycle | 6 | 5 | 1 |
| find_first_in_sorted | 7 | 4 | 3 |
| find_in_sorted | 7 | 5 | 2 |
| flatten | 7 | 1 | 6 |
| gcd | 5 | 0 | 5 |
| get_factors | 11 | 1 | 10 |
| Hanoi | 7 | 0 | 7 |
| is_valid_parenthesization	| 3 | 2	 |	1 |
| kheapsort	| 4 | 1 | 3 |
| knapsack | 10 | 4 | 6 |
| kth | 7 | 3 | 4 |
| lcs_length | 9 | 1 | 8 |
| levenshtein | 7 | 1 | 5 + 1-skipped |
| lis | 4 | 0 | 4 |
| longest_common_subsequence | 10 | 6 | 4 |
| max_sublist_sum | 6 | 2 | 4 |
| mergesort | 13 | 0 | 13 |
| minimum_spanning_tree | 3 | 1 | 2 |
| next_palindrome | 5 | 4 | 1 |
| next_permutation | 8 | 0 | 8 |
| pascal | 5 | 1 | 4 |
| possible_change | 9 | 0 | 9 |
| powerset | 5 | 1 | 4 |
| quicksort	| 13 | 12 | 1 |
| reverse_linked_list | 3 | 1 | 2 |
| rpn_eval | 6 | 3 | 3 |
| shortest_path_length | 4 | 2 | 2 |
| shortest_path_lengths | 4 | 0	| 4 |
| shortest_paths | 3 | 0 | 3 |
| shunting_yard | 4 | 0 | 4 |
| sieve | 6 | 1 | 5 |
| sqrt | 7 | 1 | 6 |
| subsequences | 12 | 2 | 10 |
| to_base | 7 | 0 | 7 |
| topological_ordering | 3 | 0 | 3 |
| wrap | 5 | 0 | 5 |

Bugs Collected for Python: Total = 277 bugs

| Program | Total | Passed | Failed |
| --- | --- | --- | --- |
| Bitcount | 9 | 0 | 9 |
| breadth_first_search | 5 | 4 | 1 |
| bucketsort | 7 | 1 | 6 |
| depth_first_search | 5 | 4 | 1 |
| detect_cycle | 6 | 5 | 1 |
| find_first_in_sorted | 7 | 4 | 3 |
| find_in_sorted | 7 | 5 | 2 |
| flatten | 7 | 1 | 6 |
| gcd | 6 | 1 | 5 |
| get_factors | 11 | 1 | 10 |
| Hanoi | 8 | 1 | 7 |
| is_valid_parenthesization	| 3 | 2	| 1 |
| kheapsort	| 4 | 1 | 3 |
| knapsack | 10 | 3 | 6 + 1 skipped |
| kth | 7 | 3 | 4 |
| lcs_length | 9 | 1 | 8 |
| levenshtein | 7 | 1 | 5 + 1-skipped |
| lis | 12 | 8 | 4 |
| longest_common_subsequence | 10 | 6 | 4 |
| max_sublist_sum | 6 | 2 | 4 |
| mergesort | 14 | 1 | 13 |
| minimum_spanning_tree | 3 | 0 | 3 |
| next_palindrome | 5 | 4 | 1 |
| next_permutation | 8 | 0 | 8 |
| pascal | 5 | 1 | 4 |
| possible_change | 10 | 1 | 9 |
| powerset | 4 | 1 | 3 |
| quicksort	| 13 | 12 | 1 |
| reverse_linked_list | 3 | 1 | 2 |
| rpn_eval | 6 | 3 | 3 |
| shortest_path_length | 4 | 2 | 2 |
| shortest_path_lengths | 4 | 0	| 4 |
| shortest_paths | 3 | 0 | 3 |
| shunting_yard | 6 | 2 | 4 |
| sieve | 6 | 1 | 5 |
| sqrt | 7 | 1 | 6 |
| subsequences | 12 | 2 | 10 |
| to_base | 10 | 3 | 7 |
| topological_ordering | 3 | 0 | 3 |
| wrap | 5 | 0 | 5 |


## Tests per Bug
Program: GCD 

Tests: 6 Total, 1 Passed, 5 Failed

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/QuixBugs_GCD.png)


Program: Breadth First Search

Tests: 5 Total, 4 Passed, 1 Failed

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/QuixBugs_BFS.png)

Program: Detect Cycle

Tests: 6 Total, 5 Passed, 1 failed

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/QuixBugs_DetectCycle.png)

Program: Get Factors

Tests: 11 Total, 1 Passed, 10 Failed

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/QuixBugs_GetFactors.png)

Program: Hanoi

Tests: 8 Total, 1 Passed, 7 Failed

![alt text](https://github.com/ShreyaChaudhary1211/CS527-Project/blob/main/images/QuixBugs_Hanoi.png)



