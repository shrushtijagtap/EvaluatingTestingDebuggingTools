var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":53856,"methods":[{"el":14,"sc":5,"sl":12}],"name":"Bug_for_issue_555_setter2","sl":10},{"el":19,"id":53858,"methods":[],"name":"Bug_for_issue_555_setter2.A","sl":16},{"el":35,"id":53858,"methods":[{"el":28,"sc":9,"sl":25},{"el":33,"sc":9,"sl":30}],"name":"Bug_for_issue_555_setter2.B","sl":21},{"el":44,"id":53862,"methods":[{"el":43,"sc":9,"sl":41}],"name":"Bug_for_issue_555_setter2.Spec","sl":37}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1707":{"methods":[{"sl":12}],"name":"test_for_issue","pass":false,"statements":[{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [1707], [1707], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
