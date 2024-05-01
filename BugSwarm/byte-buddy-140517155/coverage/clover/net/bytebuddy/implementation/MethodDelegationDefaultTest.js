var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":88,"id":44632,"methods":[{"el":39,"sc":5,"sl":29},{"el":51,"sc":5,"sl":41},{"el":63,"sc":5,"sl":53},{"el":75,"sc":5,"sl":65}],"name":"MethodDelegationDefaultTest","sl":14},{"el":80,"id":44648,"methods":[],"name":"MethodDelegationDefaultTest.DelegationNoDefaultInterface","sl":77},{"el":87,"id":44648,"methods":[{"el":86,"sc":9,"sl":84}],"name":"MethodDelegationDefaultTest.DelegationNoDefaultInterfaceInterceptor","sl":82}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1073":{"methods":[{"sl":29}],"name":"testDefaultInterface","pass":true,"statements":[{"sl":32},{"sl":37},{"sl":38}]},"test_437":{"methods":[{"sl":41},{"sl":84}],"name":"testNoDefaultInterface","pass":true,"statements":[{"sl":44},{"sl":49},{"sl":50},{"sl":85}]},"test_4388":{"methods":[{"sl":65}],"name":"testDefaultInterfaceExplicitProxyType","pass":true,"statements":[{"sl":68},{"sl":73},{"sl":74}]},"test_5191":{"methods":[{"sl":53}],"name":"testDefaultInterfaceSerializableProxy","pass":true,"statements":[{"sl":56},{"sl":61},{"sl":62}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1073], [], [], [1073], [], [], [], [], [1073], [1073], [], [], [437], [], [], [437], [], [], [], [], [437], [437], [], [], [5191], [], [], [5191], [], [], [], [], [5191], [5191], [], [], [4388], [], [], [4388], [], [], [], [], [4388], [4388], [], [], [], [], [], [], [], [], [], [437], [437], [], [], []]
