var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":40510,"methods":[{"el":14,"sc":5,"sl":11},{"el":19,"sc":5,"sl":16},{"el":24,"sc":5,"sl":21},{"el":29,"sc":5,"sl":26}],"name":"MethodGraphNodeUnresolvedTest","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3335":{"methods":[{"sl":21}],"name":"testRepresentativeThrowsException","pass":true,"statements":[{"sl":23}]},"test_3379":{"methods":[{"sl":16}],"name":"testBridgesThrowsException","pass":true,"statements":[{"sl":18}]},"test_3632":{"methods":[{"sl":26}],"name":"testObjectProperties","pass":true,"statements":[{"sl":28}]},"test_5338":{"methods":[{"sl":11}],"name":"testSort","pass":true,"statements":[{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [5338], [], [5338], [], [], [3379], [], [3379], [], [], [3335], [], [3335], [], [], [3632], [], [3632], [], []]
