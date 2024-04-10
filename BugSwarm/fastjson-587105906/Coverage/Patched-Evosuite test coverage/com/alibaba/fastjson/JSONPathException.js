var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":13,"id":4630,"methods":[{"el":8,"sc":5,"sl":6},{"el":12,"sc":5,"sl":10}],"name":"JSONPathException","sl":4}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2345":{"methods":[{"sl":6}],"name":"test_path_null_1","pass":true,"statements":[{"sl":7}]},"test_3082":{"methods":[{"sl":6}],"name":"test_jsonpath","pass":true,"statements":[{"sl":7}]},"test_3360":{"methods":[{"sl":6}],"name":"test_path_null","pass":true,"statements":[{"sl":7}]},"test_3423":{"methods":[{"sl":6}],"name":"test_path_empty","pass":true,"statements":[{"sl":7}]},"test_3504":{"methods":[{"sl":10}],"name":"test_error","pass":true,"statements":[{"sl":11}]},"test_3547":{"methods":[{"sl":10}],"name":"test_error","pass":true,"statements":[{"sl":11}]},"test_3589":{"methods":[{"sl":6}],"name":"test_for_issue","pass":true,"statements":[{"sl":7}]},"test_4305":{"methods":[{"sl":10}],"name":"test_error_1","pass":true,"statements":[{"sl":11}]},"test_94":{"methods":[{"sl":6}],"name":"test_put_array_error_0","pass":true,"statements":[{"sl":7}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [3360, 94, 3423, 3589, 2345, 3082], [3360, 94, 3423, 3589, 2345, 3082], [], [], [4305, 3504, 3547], [4305, 3504, 3547], [], []]
