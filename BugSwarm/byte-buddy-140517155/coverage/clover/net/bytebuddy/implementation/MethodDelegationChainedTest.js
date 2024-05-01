var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":61,"id":44483,"methods":[{"el":24,"sc":5,"sl":16},{"el":34,"sc":5,"sl":26}],"name":"MethodDelegationChainedTest","sl":12},{"el":41,"id":44493,"methods":[{"el":40,"sc":9,"sl":38}],"name":"MethodDelegationChainedTest.Foo","sl":36},{"el":50,"id":44495,"methods":[{"el":49,"sc":9,"sl":47}],"name":"MethodDelegationChainedTest.VoidInterceptor","sl":43},{"el":60,"id":44497,"methods":[{"el":59,"sc":9,"sl":56}],"name":"MethodDelegationChainedTest.NonVoidInterceptor","sl":52}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1571":{"methods":[{"sl":16},{"sl":47}],"name":"testChainingVoid","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":22},{"sl":23},{"sl":48}]},"test_3267":{"methods":[{"sl":26},{"sl":56}],"name":"testChainingNonVoid","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":32},{"sl":33},{"sl":57},{"sl":58}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1571], [], [1571], [1571], [], [], [1571], [1571], [], [], [3267], [], [3267], [3267], [], [], [3267], [3267], [], [], [], [], [], [], [], [], [], [], [], [], [], [1571], [1571], [], [], [], [], [], [], [], [3267], [3267], [3267], [], [], []]
