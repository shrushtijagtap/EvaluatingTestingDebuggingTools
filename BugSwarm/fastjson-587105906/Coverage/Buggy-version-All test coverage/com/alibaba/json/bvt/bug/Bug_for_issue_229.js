var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":29,"id":53124,"methods":[{"el":14,"sc":5,"sl":11}],"name":"Bug_for_issue_229","sl":9},{"el":28,"id":53127,"methods":[{"el":22,"sc":9,"sl":20},{"el":26,"sc":9,"sl":24}],"name":"Bug_for_issue_229.VO","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_249":{"methods":[{"sl":11},{"sl":24}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":25}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [249], [249], [249], [], [], [], [], [], [], [], [], [], [], [249], [249], [], [], [], []]
