var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":13,"id":4630,"methods":[{"el":8,"sc":5,"sl":6},{"el":12,"sc":5,"sl":10}],"name":"JSONPathException","sl":4}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1013":{"methods":[{"sl":6}],"name":"test_path_null","pass":true,"statements":[{"sl":7}]},"test_1421":{"methods":[{"sl":6}],"name":"test_path_empty","pass":true,"statements":[{"sl":7}]},"test_1514":{"methods":[{"sl":6}],"name":"test_for_issue","pass":true,"statements":[{"sl":7}]},"test_2496":{"methods":[{"sl":10}],"name":"test_error","pass":true,"statements":[{"sl":11}]},"test_2784":{"methods":[{"sl":10}],"name":"test_error","pass":true,"statements":[{"sl":11}]},"test_3122":{"methods":[{"sl":6}],"name":"test_path_null_1","pass":true,"statements":[{"sl":7}]},"test_4119":{"methods":[{"sl":6}],"name":"test_put_array_error_0","pass":true,"statements":[{"sl":7}]},"test_694":{"methods":[{"sl":6}],"name":"test_jsonpath","pass":true,"statements":[{"sl":7}]},"test_805":{"methods":[{"sl":10}],"name":"test_error_1","pass":true,"statements":[{"sl":11}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [4119, 694, 3122, 1013, 1514, 1421], [4119, 694, 3122, 1013, 1514, 1421], [], [], [2784, 805, 2496], [2784, 805, 2496], [], []]
