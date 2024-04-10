var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":65532,"methods":[{"el":18,"sc":5,"sl":11}],"name":"Issue1420","sl":10},{"el":34,"id":65538,"methods":[{"el":33,"sc":9,"sl":22}],"name":"Issue1420.ExtClassLoader","sl":20}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3436":{"methods":[{"sl":11},{"sl":22}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":23},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":31}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3436], [3436], [3436], [], [3436], [3436], [3436], [], [], [], [], [3436], [3436], [], [], [3436], [3436], [3436], [3436], [], [3436], [], [], [], []]
