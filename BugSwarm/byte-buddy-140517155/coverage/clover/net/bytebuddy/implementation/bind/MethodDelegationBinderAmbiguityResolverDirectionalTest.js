var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":47545,"methods":[{"el":32,"sc":5,"sl":27},{"el":38,"sc":5,"sl":34},{"el":44,"sc":5,"sl":40},{"el":49,"sc":5,"sl":46}],"name":"MethodDelegationBinderAmbiguityResolverDirectionalTest","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1732":{"methods":[{"sl":40}],"name":"testRight","pass":true,"statements":[{"sl":42}]},"test_2262":{"methods":[{"sl":34}],"name":"testLeft","pass":true,"statements":[{"sl":36}]},"test_916":{"methods":[{"sl":46}],"name":"testObjectProperties","pass":true,"statements":[{"sl":48}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2262], [], [2262], [], [], [], [1732], [], [1732], [], [], [], [916], [], [916], [], []]
