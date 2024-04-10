var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":17,"id":65010,"methods":[{"el":16,"sc":5,"sl":8}],"name":"Issue2264","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1383":{"methods":[{"sl":8}],"name":"test_for_issue","pass":true,"statements":[{"sl":9},{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [1383], [1383], [], [1383], [1383], [1383], [1383], [1383], [], []]
