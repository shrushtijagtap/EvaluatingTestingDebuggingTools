var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":22,"id":64410,"methods":[{"el":14,"sc":5,"sl":11},{"el":21,"sc":5,"sl":16}],"name":"Issue1977","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1184":{"methods":[{"sl":16}],"name":"test_for_issue","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1184], [1184], [1184], [1184], [], [], []]
