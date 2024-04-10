var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":91754,"methods":[{"el":14,"sc":5,"sl":11},{"el":19,"sc":5,"sl":16}],"name":"GenericFieldInfoTest","sl":10},{"el":23,"id":91760,"methods":[],"name":"GenericFieldInfoTest.A","sl":21},{"el":27,"id":91760,"methods":[],"name":"GenericFieldInfoTest.A1","sl":25},{"el":31,"id":91760,"methods":[],"name":"GenericFieldInfoTest.A2","sl":29},{"el":35,"id":91760,"methods":[],"name":"GenericFieldInfoTest.A3","sl":33},{"el":39,"id":91760,"methods":[],"name":"GenericFieldInfoTest.A4","sl":37}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1221":{"methods":[{"sl":16}],"name":"test_generic_1","pass":true,"statements":[{"sl":17},{"sl":18}]},"test_2881":{"methods":[{"sl":11}],"name":"test_generic","pass":true,"statements":[{"sl":12},{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [2881], [2881], [2881], [], [], [1221], [1221], [1221], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
