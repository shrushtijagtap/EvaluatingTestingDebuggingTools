var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":67326,"methods":[{"el":13,"sc":5,"sl":10}],"name":"AsmParserTest0","sl":8},{"el":37,"id":67329,"methods":[{"el":23,"sc":9,"sl":21},{"el":27,"sc":9,"sl":25},{"el":31,"sc":9,"sl":29},{"el":35,"sc":9,"sl":33}],"name":"AsmParserTest0.A","sl":15},{"el":41,"id":67337,"methods":[],"name":"AsmParserTest0.B","sl":39}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_162":{"methods":[{"sl":10},{"sl":25},{"sl":29}],"name":"test_asm","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":26},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [162], [162], [162], [], [], [], [], [], [], [], [], [], [], [], [], [162], [162], [], [], [162], [162], [], [], [], [], [], [], [], [], [], [], [], []]
