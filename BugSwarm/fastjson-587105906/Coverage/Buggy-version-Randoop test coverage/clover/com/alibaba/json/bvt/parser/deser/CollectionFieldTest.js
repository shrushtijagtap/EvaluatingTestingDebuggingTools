var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":74432,"methods":[{"el":15,"sc":5,"sl":12},{"el":20,"sc":5,"sl":17}],"name":"CollectionFieldTest","sl":10},{"el":33,"id":74438,"methods":[{"el":28,"sc":9,"sl":26},{"el":32,"sc":9,"sl":30}],"name":"CollectionFieldTest.Entity","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2517":{"methods":[{"sl":17},{"sl":26},{"sl":30}],"name":"test_empty","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":27},{"sl":31}]},"test_3283":{"methods":[{"sl":12},{"sl":26},{"sl":30}],"name":"test_null","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":27},{"sl":31}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [3283], [3283], [3283], [], [], [2517], [2517], [2517], [], [], [], [], [], [], [2517, 3283], [2517, 3283], [], [], [2517, 3283], [2517, 3283], [], [], []]
