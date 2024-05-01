var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":59,"id":24005,"methods":[{"el":29,"sc":5,"sl":26},{"el":38,"sc":5,"sl":31},{"el":46,"sc":5,"sl":40},{"el":53,"sc":5,"sl":48},{"el":58,"sc":5,"sl":55}],"name":"FailSafeMatcher","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1431":{"methods":[{"sl":26},{"sl":40},{"sl":48},{"sl":55}],"name":"testObjectProperties","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":50},{"sl":51},{"sl":52},{"sl":57}]},"test_2283":{"methods":[{"sl":26},{"sl":31}],"name":"testMatch","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":33},{"sl":34}]},"test_3362":{"methods":[{"sl":26},{"sl":31}],"name":"testNoMatch","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":33},{"sl":34}]},"test_5006":{"methods":[{"sl":26},{"sl":31}],"name":"testFailSafe","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":33},{"sl":34},{"sl":36}]},"test_5397":{"methods":[{"sl":26},{"sl":31}],"name":"testMatchOnFailure","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":33},{"sl":34},{"sl":36}]},"test_5431":{"methods":[{"sl":26},{"sl":31}],"name":"testNoMatchOnFailure","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":33},{"sl":34},{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [5006, 5431, 5397, 2283, 1431, 3362], [5006, 5431, 5397, 2283, 1431, 3362], [5006, 5431, 5397, 2283, 1431, 3362], [], [], [5006, 5431, 5397, 2283, 3362], [], [5006, 5431, 5397, 2283, 3362], [5006, 5431, 5397, 2283, 3362], [], [5006, 5431, 5397], [], [], [], [1431], [], [1431], [1431], [1431], [1431], [], [], [1431], [], [1431], [1431], [1431], [], [], [1431], [], [1431], [], []]
