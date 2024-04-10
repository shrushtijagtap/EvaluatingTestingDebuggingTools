var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":21,"id":51402,"methods":[{"el":13,"sc":5,"sl":9},{"el":19,"sc":5,"sl":15}],"name":"Bug_10","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1456":{"methods":[{"sl":15}],"name":"test_1","pass":false,"statements":[{"sl":16},{"sl":18}]},"test_3097":{"methods":[{"sl":9}],"name":"test_0","pass":false,"statements":[{"sl":10},{"sl":12}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [3097], [3097], [], [3097], [], [], [1456], [1456], [], [1456], [], [], []]
