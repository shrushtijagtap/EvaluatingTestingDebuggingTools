var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":36,"id":53353,"methods":[{"el":20,"sc":5,"sl":15},{"el":25,"sc":5,"sl":22}],"name":"Bug_for_issue_297","sl":13},{"el":31,"id":53361,"methods":[],"name":"Bug_for_issue_297.Response","sl":27},{"el":35,"id":53361,"methods":[],"name":"Bug_for_issue_297.User","sl":33}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2777":{"methods":[{"sl":15},{"sl":22}],"name":"test_for_issue","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":23},{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2777], [2777], [2777], [2777], [2777], [], [], [2777], [2777], [2777], [], [], [], [], [], [], [], [], [], [], [], []]
