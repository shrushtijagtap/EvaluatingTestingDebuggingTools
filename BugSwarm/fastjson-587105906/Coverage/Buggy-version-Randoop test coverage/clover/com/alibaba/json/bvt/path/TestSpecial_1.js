var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":21,"id":81356,"methods":[{"el":19,"sc":5,"sl":12}],"name":"TestSpecial_1","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4837":{"methods":[{"sl":12}],"name":"test_special","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [4837], [4837], [4837], [4837], [4837], [4837], [4837], [], [], []]
