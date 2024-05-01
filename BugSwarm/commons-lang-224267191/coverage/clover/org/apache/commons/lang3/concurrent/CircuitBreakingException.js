var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":67,"id":13947,"methods":[{"el":37,"sc":5,"sl":35},{"el":47,"sc":5,"sl":45},{"el":56,"sc":5,"sl":54},{"el":65,"sc":5,"sl":63}],"name":"CircuitBreakingException","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1494":{"methods":[{"sl":63}],"name":"testThrowingExceptionWithCause","pass":true,"statements":[{"sl":64}]},"test_1715":{"methods":[{"sl":54}],"name":"testWithoutCause","pass":true,"statements":[{"sl":55}]},"test_2300":{"methods":[{"sl":45}],"name":"testThrowingInformativeException","pass":true,"statements":[{"sl":46}]},"test_2576":{"methods":[{"sl":35}],"name":"testThrowingEmptyException","pass":true,"statements":[{"sl":36}]},"test_3280":{"methods":[{"sl":54}],"name":"testThrowingExceptionWithMessage","pass":true,"statements":[{"sl":55}]},"test_3558":{"methods":[{"sl":45}],"name":"testWithCauseAndMessage","pass":true,"statements":[{"sl":46}]},"test_389":{"methods":[{"sl":63}],"name":"testWithoutMessage","pass":true,"statements":[{"sl":64}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2576], [2576], [], [], [], [], [], [], [], [], [3558, 2300], [3558, 2300], [], [], [], [], [], [], [], [3280, 1715], [3280, 1715], [], [], [], [], [], [], [], [1494, 389], [1494, 389], [], [], []]
