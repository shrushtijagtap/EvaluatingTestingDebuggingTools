var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":19,"id":52214,"methods":[{"el":18,"sc":5,"sl":9}],"name":"Bug_for_O_I_See_you","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4725":{"methods":[{"sl":9}],"name":"test_bug","pass":true,"statements":[{"sl":10},{"sl":12},{"sl":14},{"sl":16},{"sl":17}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [4725], [4725], [], [4725], [], [4725], [], [4725], [4725], [], []]
