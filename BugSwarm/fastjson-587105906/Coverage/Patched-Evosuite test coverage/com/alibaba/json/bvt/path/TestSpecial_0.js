var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":22,"id":80235,"methods":[{"el":20,"sc":5,"sl":14}],"name":"TestSpecial_0","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3235":{"methods":[{"sl":14}],"name":"test_special","pass":true,"statements":[{"sl":15},{"sl":17},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [3235], [3235], [], [3235], [], [3235], [], [], []]
