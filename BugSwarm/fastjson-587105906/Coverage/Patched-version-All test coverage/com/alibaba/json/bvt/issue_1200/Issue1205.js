var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":60268,"methods":[{"el":21,"sc":5,"sl":14}],"name":"Issue1205","sl":13},{"el":25,"id":60274,"methods":[],"name":"Issue1205.Model","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4646":{"methods":[{"sl":14}],"name":"test_for_issue","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":18},{"sl":19},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [4646], [4646], [4646], [], [4646], [4646], [4646], [], [], [], [], [], []]
