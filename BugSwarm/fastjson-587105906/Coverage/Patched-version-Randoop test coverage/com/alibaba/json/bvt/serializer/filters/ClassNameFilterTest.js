var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":87034,"methods":[{"el":19,"sc":13,"sl":16},{"el":26,"sc":5,"sl":13}],"name":"ClassNameFilterTest","sl":11},{"el":30,"id":87041,"methods":[],"name":"ClassNameFilterTest.A","sl":28},{"el":35,"id":87041,"methods":[],"name":"ClassNameFilterTest.B","sl":32}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1203":{"methods":[{"sl":13},{"sl":16}],"name":"test_filter","pass":true,"statements":[{"sl":14},{"sl":18},{"sl":21},{"sl":24},{"sl":25}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [1203], [1203], [], [1203], [], [1203], [], [], [1203], [], [], [1203], [1203], [], [], [], [], [], [], [], [], [], [], [], []]
