var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":58152,"methods":[{"el":16,"sc":5,"sl":9}],"name":"TestDouble","sl":7},{"el":29,"id":58158,"methods":[{"el":24,"sc":9,"sl":22},{"el":28,"sc":9,"sl":26}],"name":"TestDouble.A","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3540":{"methods":[{"sl":9},{"sl":22},{"sl":26}],"name":"test_doubleArray_2","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12},{"sl":14},{"sl":15},{"sl":23},{"sl":27}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [3540], [3540], [3540], [3540], [], [3540], [3540], [], [], [], [], [], [], [3540], [3540], [], [], [3540], [3540], [], [], []]
