var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":50527,"methods":[{"el":18,"sc":5,"sl":10},{"el":22,"sc":5,"sl":20}],"name":"TestNonASM","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1509":{"methods":[{"sl":10}],"name":"test_no_asm","pass":true,"statements":[{"sl":11},{"sl":13},{"sl":14},{"sl":16},{"sl":17}]},"test_3945":{"methods":[{"sl":20}],"name":"test_error","pass":true,"statements":[]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [1509], [1509], [], [1509], [1509], [], [1509], [1509], [], [], [3945], [], [], []]
