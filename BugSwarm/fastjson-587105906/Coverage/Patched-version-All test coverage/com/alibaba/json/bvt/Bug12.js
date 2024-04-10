var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":24,"id":42275,"methods":[{"el":23,"sc":5,"sl":15}],"name":"Bug12","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2258":{"methods":[{"sl":15}],"name":"test_0","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":21},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2258], [2258], [2258], [2258], [2258], [], [2258], [2258], [], []]
