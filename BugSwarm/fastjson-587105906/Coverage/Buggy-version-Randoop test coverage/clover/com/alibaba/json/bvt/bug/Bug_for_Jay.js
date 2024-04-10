var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":21,"id":51786,"methods":[{"el":11,"sc":5,"sl":9}],"name":"Bug_for_Jay","sl":7},{"el":16,"id":51788,"methods":[],"name":"Bug_for_Jay.A","sl":13},{"el":20,"id":51788,"methods":[],"name":"Bug_for_Jay.B","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1525":{"methods":[{"sl":9}],"name":"test_for_jay","pass":true,"statements":[{"sl":10}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [1525], [1525], [], [], [], [], [], [], [], [], [], [], []]
