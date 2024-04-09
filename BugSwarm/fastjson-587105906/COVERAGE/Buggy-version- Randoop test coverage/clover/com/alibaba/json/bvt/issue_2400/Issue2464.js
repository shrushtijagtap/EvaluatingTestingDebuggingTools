var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":36,"id":65570,"methods":[{"el":14,"sc":5,"sl":7},{"el":23,"sc":5,"sl":16},{"el":29,"sc":5,"sl":25},{"el":35,"sc":5,"sl":31}],"name":"Issue2464","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1661":{"methods":[{"sl":25}],"name":"test3","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":28}]},"test_2661":{"methods":[{"sl":7}],"name":"test1","pass":true,"statements":[{"sl":8},{"sl":9},{"sl":10},{"sl":12},{"sl":13}]},"test_3466":{"methods":[{"sl":31}],"name":"test4","pass":true,"statements":[{"sl":32},{"sl":33},{"sl":34}]},"test_4018":{"methods":[{"sl":16}],"name":"test2","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":21},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [2661], [2661], [2661], [2661], [], [2661], [2661], [], [], [4018], [4018], [4018], [4018], [], [4018], [4018], [], [], [1661], [1661], [1661], [1661], [], [], [3466], [3466], [3466], [3466], [], []]
