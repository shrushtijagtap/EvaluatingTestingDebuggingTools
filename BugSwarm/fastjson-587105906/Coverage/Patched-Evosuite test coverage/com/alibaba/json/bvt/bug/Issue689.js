var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":22,"id":56012,"methods":[{"el":21,"sc":5,"sl":14}],"name":"Issue689","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_953":{"methods":[{"sl":14}],"name":"test_0","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":19},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [953], [953], [953], [953], [], [953], [953], [], []]
