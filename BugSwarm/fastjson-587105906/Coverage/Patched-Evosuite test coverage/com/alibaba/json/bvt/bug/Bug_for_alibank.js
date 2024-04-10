var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":15,"id":51112,"methods":[{"el":14,"sc":5,"sl":9}],"name":"Bug_for_alibank","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4396":{"methods":[{"sl":9}],"name":"test_bug","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12},{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [4396], [4396], [4396], [4396], [4396], [], []]
