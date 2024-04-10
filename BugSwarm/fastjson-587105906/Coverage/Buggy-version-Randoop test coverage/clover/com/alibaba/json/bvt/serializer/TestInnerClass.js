var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":28,"id":85984,"methods":[{"el":14,"sc":5,"sl":10}],"name":"TestInnerClass","sl":8},{"el":27,"id":85988,"methods":[{"el":21,"sc":9,"sl":19},{"el":25,"sc":9,"sl":23}],"name":"TestInnerClass.VO","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_642":{"methods":[{"sl":10},{"sl":19}],"name":"test_inner","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [642], [642], [642], [642], [], [], [], [], [], [642], [642], [], [], [], [], [], [], [], []]
