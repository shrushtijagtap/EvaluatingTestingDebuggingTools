var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":71,"id":13961,"methods":[{"el":47,"sc":5,"sl":45},{"el":58,"sc":5,"sl":56},{"el":70,"sc":5,"sl":68}],"name":"ConcurrentRuntimeException","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_171":{"methods":[{"sl":45}],"name":"testUninitializedConcurrentRuntimeException","pass":true,"statements":[{"sl":46}]},"test_2099":{"methods":[{"sl":68}],"name":"testHandleCauseUncheckedChecked","pass":true,"statements":[{"sl":69}]},"test_3147":{"methods":[{"sl":56}],"name":"testInitializeUncheckedEx","pass":true,"statements":[{"sl":57}]},"test_3587":{"methods":[{"sl":56}],"name":"testCreateIfAbsentUncheckedException","pass":true,"statements":[{"sl":57}]},"test_731":{"methods":[{"sl":68}],"name":"testExtractCauseUncheckedChecked","pass":true,"statements":[{"sl":69}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [171], [171], [], [], [], [], [], [], [], [], [], [3147, 3587], [3147, 3587], [], [], [], [], [], [], [], [], [], [], [731, 2099], [731, 2099], [], []]
