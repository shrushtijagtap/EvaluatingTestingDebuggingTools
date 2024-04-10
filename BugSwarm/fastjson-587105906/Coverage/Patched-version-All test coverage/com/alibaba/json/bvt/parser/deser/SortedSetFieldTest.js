var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":75600,"methods":[{"el":16,"sc":5,"sl":13},{"el":21,"sc":5,"sl":18}],"name":"SortedSetFieldTest","sl":11},{"el":34,"id":75606,"methods":[{"el":29,"sc":9,"sl":27},{"el":33,"sc":9,"sl":31}],"name":"SortedSetFieldTest.Entity","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1000":{"methods":[{"sl":18},{"sl":27},{"sl":31}],"name":"test_empty","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":28},{"sl":32}]},"test_998":{"methods":[{"sl":13},{"sl":27},{"sl":31}],"name":"test_null","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":28},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [998], [998], [998], [], [], [1000], [1000], [1000], [], [], [], [], [], [], [1000, 998], [1000, 998], [], [], [1000, 998], [1000, 998], [], [], []]
