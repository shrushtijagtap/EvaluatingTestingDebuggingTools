var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":48,"id":67337,"methods":[{"el":17,"sc":5,"sl":13}],"name":"AsmParserTest1","sl":11},{"el":43,"id":67341,"methods":[{"el":27,"sc":9,"sl":25},{"el":31,"sc":9,"sl":29},{"el":36,"sc":9,"sl":34},{"el":41,"sc":9,"sl":39}],"name":"AsmParserTest1.A","sl":19},{"el":47,"id":67349,"methods":[],"name":"AsmParserTest1.B","sl":45}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2552":{"methods":[{"sl":13},{"sl":25},{"sl":29},{"sl":34}],"name":"test_asm","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":26},{"sl":30},{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [2552], [2552], [2552], [2552], [], [], [], [], [], [], [], [], [2552], [2552], [], [], [2552], [2552], [], [], [], [2552], [2552], [], [], [], [], [], [], [], [], [], [], [], [], []]
