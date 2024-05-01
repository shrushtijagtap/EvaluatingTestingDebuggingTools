var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":47,"id":24183,"methods":[{"el":25,"sc":5,"sl":23},{"el":30,"sc":5,"sl":27},{"el":36,"sc":5,"sl":32},{"el":41,"sc":5,"sl":38},{"el":46,"sc":5,"sl":43}],"name":"MethodExceptionTypeMatcher","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1552":{"methods":[{"sl":23},{"sl":27}],"name":"testDeclaresGenericException","pass":true,"statements":[{"sl":24},{"sl":29}]},"test_3728":{"methods":[{"sl":23},{"sl":27}],"name":"testDeclaresException","pass":true,"statements":[{"sl":24},{"sl":29}]},"test_3737":{"methods":[{"sl":23},{"sl":27}],"name":"testNoMatch","pass":true,"statements":[{"sl":24},{"sl":29}]},"test_3752":{"methods":[{"sl":23},{"sl":32},{"sl":38},{"sl":43}],"name":"testObjectProperties","pass":true,"statements":[{"sl":24},{"sl":34},{"sl":40},{"sl":45}]},"test_4694":{"methods":[{"sl":23},{"sl":27}],"name":"testCanThrow","pass":true,"statements":[{"sl":24},{"sl":29}]},"test_556":{"methods":[{"sl":23},{"sl":27}],"name":"testMatch","pass":true,"statements":[{"sl":24},{"sl":29}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3752, 4694, 556, 3737, 3728, 1552], [3752, 4694, 556, 3737, 3728, 1552], [], [], [4694, 556, 3737, 3728, 1552], [], [4694, 556, 3737, 3728, 1552], [], [], [3752], [], [3752], [], [], [], [3752], [], [3752], [], [], [3752], [], [3752], [], []]
