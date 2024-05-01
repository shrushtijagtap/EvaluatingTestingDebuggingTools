var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":87,"id":45384,"methods":[{"el":45,"sc":5,"sl":40},{"el":55,"sc":5,"sl":50},{"el":64,"sc":5,"sl":60},{"el":76,"sc":5,"sl":69},{"el":85,"sc":5,"sl":81}],"name":"ThresholdCircuitBreakerTest","sl":28}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1825":{"methods":[{"sl":81}],"name":"testGettingThreshold","pass":true,"statements":[{"sl":83},{"sl":84}]},"test_2850":{"methods":[{"sl":69}],"name":"testClosingThresholdCircuitBreaker","pass":true,"statements":[{"sl":71},{"sl":72},{"sl":73},{"sl":75}]},"test_2989":{"methods":[{"sl":60}],"name":"testThresholdEqualsZero","pass":true,"statements":[{"sl":62},{"sl":63}]},"test_3434":{"methods":[{"sl":50}],"name":"testThresholdCircuitBreakingException","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":54}]},"test_3574":{"methods":[{"sl":40}],"name":"testThreshold","pass":true,"statements":[{"sl":42},{"sl":43},{"sl":44}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3574], [], [3574], [3574], [3574], [], [], [], [], [], [3434], [], [3434], [3434], [3434], [], [], [], [], [], [2989], [], [2989], [2989], [], [], [], [], [], [2850], [], [2850], [2850], [2850], [], [2850], [], [], [], [], [], [1825], [], [1825], [1825], [], [], []]
