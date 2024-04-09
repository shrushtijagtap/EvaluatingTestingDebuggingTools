var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":31,"id":60386,"methods":[{"el":21,"sc":5,"sl":11}],"name":"Issue1272","sl":10},{"el":30,"id":60393,"methods":[{"el":29,"sc":9,"sl":27}],"name":"Issue1272.Point","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3302":{"methods":[{"sl":11},{"sl":27}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":14},{"sl":15},{"sl":17},{"sl":19},{"sl":20},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3302], [3302], [], [3302], [3302], [], [3302], [], [3302], [3302], [], [], [], [], [], [], [3302], [3302], [], [], []]
