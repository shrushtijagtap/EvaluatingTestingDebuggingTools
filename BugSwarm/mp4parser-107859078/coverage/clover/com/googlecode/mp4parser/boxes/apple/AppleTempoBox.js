var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":12,"id":14578,"methods":[{"el":11,"sc":5,"sl":8}],"name":"AppleTempoBox","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_25":{"methods":[{"sl":8}],"name":"testRoundTrip_1c","pass":true,"statements":[{"sl":10}]},"test_91":{"methods":[{"sl":8}],"name":"testRooundTrip","pass":true,"statements":[{"sl":10}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [91, 25], [], [91, 25], [], []]
