var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":62,"id":14477,"methods":[{"el":40,"sc":5,"sl":38},{"el":50,"sc":5,"sl":48},{"el":61,"sc":5,"sl":59}],"name":"CloneFailedException","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1358":{"methods":[{"sl":48}],"name":"testThrowingExceptionWithCause","pass":true,"statements":[{"sl":49}]},"test_1490":{"methods":[{"sl":59}],"name":"testPossibleCloneOfUncloneable","pass":true,"statements":[{"sl":60}]},"test_2537":{"methods":[{"sl":59}],"name":"testThrowingInformativeException","pass":true,"statements":[{"sl":60}]},"test_2801":{"methods":[{"sl":38}],"name":"testWithoutCause","pass":true,"statements":[{"sl":39}]},"test_3204":{"methods":[{"sl":59}],"name":"testWithCauseAndMessage","pass":true,"statements":[{"sl":60}]},"test_3255":{"methods":[{"sl":48}],"name":"testWithoutMessage","pass":true,"statements":[{"sl":49}]},"test_3711":{"methods":[{"sl":59}],"name":"testCloneOfUncloneable","pass":true,"statements":[{"sl":60}]},"test_702":{"methods":[{"sl":38}],"name":"testThrowingExceptionWithMessage","pass":true,"statements":[{"sl":39}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2801, 702], [2801, 702], [], [], [], [], [], [], [], [], [3255, 1358], [3255, 1358], [], [], [], [], [], [], [], [], [], [2537, 3711, 1490, 3204], [2537, 3711, 1490, 3204], [], []]
