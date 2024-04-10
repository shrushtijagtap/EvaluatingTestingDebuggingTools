var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":33,"id":56256,"methods":[{"el":21,"sc":5,"sl":13}],"name":"Issue1017","sl":12},{"el":32,"id":56263,"methods":[{"el":27,"sc":9,"sl":25},{"el":31,"sc":9,"sl":28}],"name":"Issue1017.User","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3484":{"methods":[{"sl":13},{"sl":28}],"name":"test_for_issue","pass":true,"statements":[{"sl":14},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":29},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [3484], [3484], [], [3484], [3484], [3484], [3484], [3484], [], [], [], [], [], [], [], [3484], [3484], [3484], [], [], []]
