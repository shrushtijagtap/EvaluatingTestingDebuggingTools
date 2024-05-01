var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":11,"id":14534,"methods":[{"el":10,"sc":2,"sl":8}],"name":"AppleNameBox","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_151":{"methods":[{"sl":8}],"name":"testRoundTrip_TinyExamples_Old","pass":true,"statements":[{"sl":9}]},"test_156":{"methods":[{"sl":8}],"name":"testRoundTrip_1d","pass":true,"statements":[{"sl":9}]},"test_159":{"methods":[{"sl":8}],"name":"testRoundTrip_1e","pass":true,"statements":[{"sl":9}]},"test_169":{"methods":[{"sl":8}],"name":"testRoundTrip_TinyExamples_Metaxed","pass":true,"statements":[{"sl":9}]},"test_25":{"methods":[{"sl":8}],"name":"testRoundTrip_1c","pass":true,"statements":[{"sl":9}]},"test_91":{"methods":[{"sl":8}],"name":"testRooundTrip","pass":true,"statements":[{"sl":9}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [159, 169, 91, 156, 25, 151], [159, 169, 91, 156, 25, 151], [], []]
