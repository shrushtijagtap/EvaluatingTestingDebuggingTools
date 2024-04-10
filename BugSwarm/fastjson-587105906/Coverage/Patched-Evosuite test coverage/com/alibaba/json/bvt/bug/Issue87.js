var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":39,"id":56315,"methods":[{"el":21,"sc":5,"sl":13}],"name":"Issue87","sl":12},{"el":38,"id":56323,"methods":[{"el":29,"sc":9,"sl":27},{"el":33,"sc":9,"sl":31},{"el":37,"sc":9,"sl":35}],"name":"Issue87.TestObject","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1395":{"methods":[{"sl":13},{"sl":27},{"sl":31},{"sl":35}],"name":"test_for_issue","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":28},{"sl":32},{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [1395], [1395], [1395], [1395], [1395], [1395], [1395], [1395], [], [], [], [], [], [], [1395], [1395], [], [], [1395], [1395], [], [], [1395], [1395], [], [], []]
