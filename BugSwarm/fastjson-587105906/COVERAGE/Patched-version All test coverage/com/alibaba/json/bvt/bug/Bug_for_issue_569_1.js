var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":56,"id":54005,"methods":[{"el":29,"sc":5,"sl":16}],"name":"Bug_for_issue_569_1","sl":15},{"el":43,"id":54011,"methods":[{"el":38,"sc":9,"sl":36},{"el":42,"sc":9,"sl":40}],"name":"Bug_for_issue_569_1.A","sl":33},{"el":55,"id":54015,"methods":[{"el":50,"sc":9,"sl":48},{"el":54,"sc":9,"sl":52}],"name":"Bug_for_issue_569_1.B","sl":45}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3912":{"methods":[{"sl":16},{"sl":36},{"sl":40},{"sl":48},{"sl":52}],"name":"test_for_issue","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":25},{"sl":27},{"sl":37},{"sl":41},{"sl":49},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3912], [3912], [3912], [3912], [], [], [], [], [], [3912], [], [3912], [], [], [], [], [], [], [], [], [3912], [3912], [], [], [3912], [3912], [], [], [], [], [], [], [3912], [3912], [], [], [3912], [3912], [], [], []]
