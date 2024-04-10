var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":62344,"methods":[{"el":15,"sc":5,"sl":12},{"el":21,"sc":5,"sl":17}],"name":"Issue1679","sl":11},{"el":25,"id":62351,"methods":[],"name":"Issue1679.User","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_779":{"methods":[{"sl":17}],"name":"test_for_issue","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [779], [779], [779], [779], [], [], [], [], [], []]
