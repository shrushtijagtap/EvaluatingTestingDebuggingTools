var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":44650,"methods":[{"el":11,"sc":5,"sl":8},{"el":16,"sc":5,"sl":13},{"el":21,"sc":5,"sl":18},{"el":26,"sc":5,"sl":23},{"el":31,"sc":5,"sl":28}],"name":"MethodDelegationExceptionTest","sl":6},{"el":38,"id":44660,"methods":[{"el":37,"sc":9,"sl":35}],"name":"MethodDelegationExceptionTest.Foo","sl":33},{"el":42,"id":44661,"methods":[],"name":"MethodDelegationExceptionTest.Bar","sl":40},{"el":49,"id":44661,"methods":[{"el":48,"sc":9,"sl":46}],"name":"MethodDelegationExceptionTest.Qux","sl":44}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1849":{"methods":[{"sl":23}],"name":"testArray","pass":true,"statements":[{"sl":25}]},"test_3000":{"methods":[{"sl":13}],"name":"testNoVisibleMethod","pass":true,"statements":[{"sl":15}]},"test_3272":{"methods":[{"sl":18}],"name":"testNoCompatibleMethod","pass":true,"statements":[{"sl":20}]},"test_4132":{"methods":[{"sl":8}],"name":"testNoMethod","pass":true,"statements":[{"sl":10}]},"test_4549":{"methods":[{"sl":28}],"name":"testPrimitive","pass":true,"statements":[{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [4132], [], [4132], [], [], [3000], [], [3000], [], [], [3272], [], [3272], [], [], [1849], [], [1849], [], [], [4549], [], [4549], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
