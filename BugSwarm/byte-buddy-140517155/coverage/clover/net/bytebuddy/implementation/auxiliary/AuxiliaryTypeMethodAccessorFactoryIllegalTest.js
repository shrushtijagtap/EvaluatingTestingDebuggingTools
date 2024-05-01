var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":46803,"methods":[{"el":26,"sc":5,"sl":23},{"el":31,"sc":5,"sl":28},{"el":36,"sc":5,"sl":33},{"el":41,"sc":5,"sl":38}],"name":"AuxiliaryTypeMethodAccessorFactoryIllegalTest","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1005":{"methods":[{"sl":23}],"name":"testAccessorIsIllegal","pass":true,"statements":[{"sl":25}]},"test_3346":{"methods":[{"sl":38}],"name":"testObjectProperties","pass":true,"statements":[{"sl":40}]},"test_3724":{"methods":[{"sl":28}],"name":"testGetterIsIllegal","pass":true,"statements":[{"sl":30}]},"test_3748":{"methods":[{"sl":33}],"name":"testSetterIsIllegal","pass":true,"statements":[{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1005], [], [1005], [], [], [3724], [], [3724], [], [], [3748], [], [3748], [], [], [3346], [], [3346], [], []]
