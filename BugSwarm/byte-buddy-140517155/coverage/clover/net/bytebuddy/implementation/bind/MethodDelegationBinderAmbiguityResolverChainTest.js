var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":47526,"methods":[{"el":24,"sc":5,"sl":19},{"el":33,"sc":5,"sl":26},{"el":44,"sc":5,"sl":35},{"el":49,"sc":5,"sl":46}],"name":"MethodDelegationBinderAmbiguityResolverChainTest","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2077":{"methods":[{"sl":26}],"name":"testFirstResolves","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32}]},"test_23":{"methods":[{"sl":35}],"name":"testSecondResolves","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43}]},"test_4768":{"methods":[{"sl":46}],"name":"testEqualsHashCode","pass":true,"statements":[{"sl":48}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2077], [], [2077], [2077], [2077], [2077], [2077], [], [], [23], [], [23], [23], [23], [23], [23], [23], [23], [], [], [4768], [], [4768], [], []]
