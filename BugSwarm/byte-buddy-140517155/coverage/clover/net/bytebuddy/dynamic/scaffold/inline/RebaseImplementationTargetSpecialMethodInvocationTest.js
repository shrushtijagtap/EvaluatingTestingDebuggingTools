var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":41747,"methods":[{"el":19,"sc":5,"sl":16},{"el":27,"sc":13,"sl":24},{"el":29,"sc":5,"sl":21}],"name":"RebaseImplementationTargetSpecialMethodInvocationTest","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1203":{"methods":[{"sl":21},{"sl":24}],"name":"testObjectProperties","pass":true,"statements":[{"sl":23},{"sl":26}]},"test_1691":{"methods":[{"sl":16}],"name":"testValidity","pass":true,"statements":[{"sl":18}]},"test_2513":{"methods":[{"sl":16}],"name":"testEquality","pass":true,"statements":[{"sl":18}]},"test_3436":{"methods":[{"sl":16}],"name":"testTypeInequality","pass":true,"statements":[{"sl":18}]},"test_4953":{"methods":[{"sl":16}],"name":"testTokenInequality","pass":true,"statements":[{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1691, 3436, 4953, 2513], [], [1691, 3436, 4953, 2513], [], [], [1203], [], [1203], [1203], [], [1203], [], [], [], []]
