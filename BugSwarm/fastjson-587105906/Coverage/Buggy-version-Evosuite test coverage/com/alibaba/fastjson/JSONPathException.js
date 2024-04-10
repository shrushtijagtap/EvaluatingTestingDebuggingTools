var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":13,"id":4630,"methods":[{"el":8,"sc":5,"sl":6},{"el":12,"sc":5,"sl":10}],"name":"JSONPathException","sl":4}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_102":{"methods":[{"sl":10}],"name":"test_error","pass":true,"statements":[{"sl":11}]},"test_118":{"methods":[{"sl":6}],"name":"test_path_null","pass":true,"statements":[{"sl":7}]},"test_2444":{"methods":[{"sl":6}],"name":"test_jsonpath","pass":true,"statements":[{"sl":7}]},"test_30":{"methods":[{"sl":6}],"name":"test_path_null_1","pass":true,"statements":[{"sl":7}]},"test_3617":{"methods":[{"sl":10}],"name":"test_error","pass":true,"statements":[{"sl":11}]},"test_4188":{"methods":[{"sl":10}],"name":"test_error_1","pass":true,"statements":[{"sl":11}]},"test_78":{"methods":[{"sl":6}],"name":"test_put_array_error_0","pass":true,"statements":[{"sl":7}]},"test_867":{"methods":[{"sl":6}],"name":"test_for_issue","pass":true,"statements":[{"sl":7}]},"test_923":{"methods":[{"sl":6}],"name":"test_path_empty","pass":true,"statements":[{"sl":7}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [2444, 78, 923, 118, 30, 867], [2444, 78, 923, 118, 30, 867], [], [], [3617, 102, 4188], [3617, 102, 4188], [], []]
