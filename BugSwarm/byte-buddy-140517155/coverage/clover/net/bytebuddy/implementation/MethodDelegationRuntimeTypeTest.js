var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":45146,"methods":[{"el":19,"sc":5,"sl":14}],"name":"MethodDelegationRuntimeTypeTest","sl":10},{"el":26,"id":45150,"methods":[{"el":25,"sc":9,"sl":23}],"name":"MethodDelegationRuntimeTypeTest.Foo","sl":21},{"el":34,"id":45152,"methods":[{"el":33,"sc":9,"sl":30}],"name":"MethodDelegationRuntimeTypeTest.Bar","sl":28}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4728":{"methods":[{"sl":14},{"sl":30}],"name":"testRuntimeType","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [4728], [], [4728], [4728], [4728], [], [], [], [], [], [], [], [], [], [], [], [4728], [], [4728], [], [], []]
