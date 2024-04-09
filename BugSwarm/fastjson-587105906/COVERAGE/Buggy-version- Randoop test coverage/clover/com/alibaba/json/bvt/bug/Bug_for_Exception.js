var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":15,"id":51722,"methods":[{"el":14,"sc":2,"sl":8}],"name":"Bug_for_Exception","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3097":{"methods":[{"sl":8}],"name":"test_exception","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":11},{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [3097], [3097], [3097], [3097], [], [3097], [], []]
