var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":45990,"methods":[{"el":33,"sc":5,"sl":31}],"name":"AbstractExceptionTest","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1358":{"methods":[{"sl":31}],"name":"testThrowingExceptionWithCause","pass":true,"statements":[{"sl":32}]},"test_1494":{"methods":[{"sl":31}],"name":"testThrowingExceptionWithCause","pass":true,"statements":[{"sl":32}]},"test_2300":{"methods":[{"sl":31}],"name":"testThrowingInformativeException","pass":true,"statements":[{"sl":32}]},"test_2537":{"methods":[{"sl":31}],"name":"testThrowingInformativeException","pass":true,"statements":[{"sl":32}]},"test_3204":{"methods":[{"sl":31}],"name":"testWithCauseAndMessage","pass":true,"statements":[{"sl":32}]},"test_3255":{"methods":[{"sl":31}],"name":"testWithoutMessage","pass":true,"statements":[{"sl":32}]},"test_3558":{"methods":[{"sl":31}],"name":"testWithCauseAndMessage","pass":true,"statements":[{"sl":32}]},"test_389":{"methods":[{"sl":31}],"name":"testWithoutMessage","pass":true,"statements":[{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2537, 3558, 3255, 3204, 1494, 1358, 389, 2300], [2537, 3558, 3255, 3204, 1494, 1358, 389, 2300], [], []]
