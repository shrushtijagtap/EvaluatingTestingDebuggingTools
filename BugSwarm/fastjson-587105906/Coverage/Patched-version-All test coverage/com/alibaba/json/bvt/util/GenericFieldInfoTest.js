var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":91743,"methods":[{"el":14,"sc":5,"sl":11},{"el":19,"sc":5,"sl":16}],"name":"GenericFieldInfoTest","sl":10},{"el":23,"id":91749,"methods":[],"name":"GenericFieldInfoTest.A","sl":21},{"el":27,"id":91749,"methods":[],"name":"GenericFieldInfoTest.A1","sl":25},{"el":31,"id":91749,"methods":[],"name":"GenericFieldInfoTest.A2","sl":29},{"el":35,"id":91749,"methods":[],"name":"GenericFieldInfoTest.A3","sl":33},{"el":39,"id":91749,"methods":[],"name":"GenericFieldInfoTest.A4","sl":37}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3020":{"methods":[{"sl":11}],"name":"test_generic","pass":true,"statements":[{"sl":12},{"sl":13}]},"test_4179":{"methods":[{"sl":16}],"name":"test_generic_1","pass":true,"statements":[{"sl":17},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3020], [3020], [3020], [], [], [4179], [4179], [4179], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
