var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":53979,"methods":[{"el":14,"sc":5,"sl":10}],"name":"Bug_for_issue_694","sl":9},{"el":39,"id":53983,"methods":[],"name":"Bug_for_issue_694.Root","sl":16},{"el":38,"id":53983,"methods":[{"el":25,"sc":13,"sl":23},{"el":29,"sc":13,"sl":27},{"el":33,"sc":13,"sl":31},{"el":37,"sc":13,"sl":35}],"name":"Bug_for_issue_694.Root.GSMapItemBIZEntity","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4663":{"methods":[{"sl":10},{"sl":27},{"sl":35}],"name":"test_for_issue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":28},{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [4663], [4663], [4663], [4663], [], [], [], [], [], [], [], [], [], [], [], [], [], [4663], [4663], [], [], [], [], [], [], [4663], [4663], [], [], [], []]
