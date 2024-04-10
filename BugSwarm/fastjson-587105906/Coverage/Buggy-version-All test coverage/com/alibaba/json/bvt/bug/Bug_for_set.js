var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":16,"id":55022,"methods":[{"el":11,"sc":5,"sl":9},{"el":15,"sc":5,"sl":13}],"name":"Bug_for_set","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2900":{"methods":[{"sl":13}],"name":"test_treeset","pass":true,"statements":[{"sl":14}]},"test_2920":{"methods":[{"sl":9}],"name":"test_set","pass":true,"statements":[{"sl":10}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [2920], [2920], [], [], [2900], [2900], [], []]
