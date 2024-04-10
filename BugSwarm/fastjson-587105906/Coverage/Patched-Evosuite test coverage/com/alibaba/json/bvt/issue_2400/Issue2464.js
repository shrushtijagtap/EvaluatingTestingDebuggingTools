var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":36,"id":64453,"methods":[{"el":14,"sc":5,"sl":7},{"el":23,"sc":5,"sl":16},{"el":29,"sc":5,"sl":25},{"el":35,"sc":5,"sl":31}],"name":"Issue2464","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1165":{"methods":[{"sl":25}],"name":"test3","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":28}]},"test_1431":{"methods":[{"sl":7}],"name":"test1","pass":true,"statements":[{"sl":8},{"sl":9},{"sl":10},{"sl":12},{"sl":13}]},"test_1913":{"methods":[{"sl":31}],"name":"test4","pass":true,"statements":[{"sl":32},{"sl":33},{"sl":34}]},"test_4402":{"methods":[{"sl":16}],"name":"test2","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":21},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [1431], [1431], [1431], [1431], [], [1431], [1431], [], [], [4402], [4402], [4402], [4402], [], [4402], [4402], [], [], [1165], [1165], [1165], [1165], [], [], [1913], [1913], [1913], [1913], [], []]
