var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":13,"id":4630,"methods":[{"el":8,"sc":5,"sl":6},{"el":12,"sc":5,"sl":10}],"name":"JSONPathException","sl":4}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1139":{"methods":[{"sl":6}],"name":"test_path_null","pass":true,"statements":[{"sl":7}]},"test_1583":{"methods":[{"sl":6}],"name":"test_for_issue","pass":true,"statements":[{"sl":7}]},"test_1900":{"methods":[{"sl":6}],"name":"test_jsonpath","pass":true,"statements":[{"sl":7}]},"test_2327":{"methods":[{"sl":10}],"name":"test_error","pass":true,"statements":[{"sl":11}]},"test_2825":{"methods":[{"sl":10}],"name":"test_error","pass":true,"statements":[{"sl":11}]},"test_3117":{"methods":[{"sl":10}],"name":"test_error_1","pass":true,"statements":[{"sl":11}]},"test_3426":{"methods":[{"sl":6}],"name":"test_path_null_1","pass":true,"statements":[{"sl":7}]},"test_4319":{"methods":[{"sl":6}],"name":"test_put_array_error_0","pass":true,"statements":[{"sl":7}]},"test_590":{"methods":[{"sl":6}],"name":"test_path_empty","pass":true,"statements":[{"sl":7}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [1900, 590, 1583, 1139, 4319, 3426], [1900, 590, 1583, 1139, 4319, 3426], [], [], [2825, 3117, 2327], [2825, 3117, 2327], [], []]
