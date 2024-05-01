var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":83,"id":44737,"methods":[{"el":35,"sc":5,"sl":32},{"el":40,"sc":5,"sl":37},{"el":45,"sc":5,"sl":42},{"el":50,"sc":5,"sl":47},{"el":61,"sc":5,"sl":52},{"el":71,"sc":5,"sl":63},{"el":82,"sc":5,"sl":73}],"name":"CircuitBreakingExceptionTest","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1494":{"methods":[{"sl":42}],"name":"testThrowingExceptionWithCause","pass":true,"statements":[{"sl":44}]},"test_1715":{"methods":[{"sl":63}],"name":"testWithoutCause","pass":true,"statements":[{"sl":65},{"sl":66},{"sl":67},{"sl":69},{"sl":70}]},"test_2300":{"methods":[{"sl":32}],"name":"testThrowingInformativeException","pass":true,"statements":[{"sl":34}]},"test_2576":{"methods":[{"sl":47}],"name":"testThrowingEmptyException","pass":true,"statements":[{"sl":49}]},"test_3280":{"methods":[{"sl":37}],"name":"testThrowingExceptionWithMessage","pass":true,"statements":[{"sl":39}]},"test_3558":{"methods":[{"sl":52}],"name":"testWithCauseAndMessage","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":56},{"sl":58},{"sl":59},{"sl":60}]},"test_389":{"methods":[{"sl":73}],"name":"testWithoutMessage","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":77},{"sl":79},{"sl":80},{"sl":81}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2300], [], [2300], [], [], [3280], [], [3280], [], [], [1494], [], [1494], [], [], [2576], [], [2576], [], [], [3558], [], [3558], [3558], [3558], [], [3558], [3558], [3558], [], [], [1715], [], [1715], [1715], [1715], [], [1715], [1715], [], [], [389], [], [389], [389], [389], [], [389], [389], [389], [], []]
