var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":63127,"methods":[{"el":14,"sc":5,"sl":9}],"name":"Issue1941","sl":7},{"el":18,"id":63132,"methods":[],"name":"Issue1941.Area","sl":17},{"el":25,"id":63132,"methods":[],"name":"Issue1941.FloorV2","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3881":{"methods":[{"sl":9}],"name":"test_for_issue","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12},{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [3881], [3881], [3881], [3881], [3881], [], [], [], [], [], [], [], [], [], [], [], [], []]
