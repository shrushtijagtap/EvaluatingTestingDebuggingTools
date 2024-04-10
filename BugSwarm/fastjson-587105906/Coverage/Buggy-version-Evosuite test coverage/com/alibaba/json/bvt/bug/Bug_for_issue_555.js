var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":53977,"methods":[{"el":14,"sc":5,"sl":12}],"name":"Bug_for_issue_555","sl":10},{"el":19,"id":53979,"methods":[],"name":"Bug_for_issue_555.A","sl":16},{"el":25,"id":53979,"methods":[],"name":"Bug_for_issue_555.B","sl":21},{"el":33,"id":53979,"methods":[{"el":32,"sc":9,"sl":30}],"name":"Bug_for_issue_555.Spec","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4695":{"methods":[{"sl":12}],"name":"test_for_issue","pass":false,"statements":[{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [4695], [4695], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
