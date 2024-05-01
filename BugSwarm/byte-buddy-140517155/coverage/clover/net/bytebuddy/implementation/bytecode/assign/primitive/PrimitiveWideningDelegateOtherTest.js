var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":24,"id":49823,"methods":[{"el":12,"sc":5,"sl":9},{"el":17,"sc":5,"sl":14},{"el":23,"sc":5,"sl":19}],"name":"PrimitiveWideningDelegateOtherTest","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3279":{"methods":[{"sl":9}],"name":"testIllegalSourceTypeThrowsException","pass":true,"statements":[{"sl":11}]},"test_5292":{"methods":[{"sl":14}],"name":"testIllegalTargetTypeThrowsException","pass":true,"statements":[{"sl":16}]},"test_787":{"methods":[{"sl":19}],"name":"testObjectProperties","pass":true,"statements":[{"sl":21},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [3279], [], [3279], [], [], [5292], [], [5292], [], [], [787], [], [787], [787], [], []]
