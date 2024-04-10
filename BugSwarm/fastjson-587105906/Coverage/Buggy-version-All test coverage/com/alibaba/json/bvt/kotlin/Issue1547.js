var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":66860,"methods":[{"el":18,"sc":5,"sl":12}],"name":"Issue1547","sl":11},{"el":34,"id":66865,"methods":[{"el":33,"sc":9,"sl":22}],"name":"Issue1547.ExtClassLoader","sl":20}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_883":{"methods":[{"sl":12},{"sl":22}],"name":"test_user","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":16},{"sl":17},{"sl":23},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":31}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [883], [883], [883], [], [883], [883], [], [], [], [], [883], [883], [], [], [883], [883], [883], [883], [], [883], [], [], [], []]
