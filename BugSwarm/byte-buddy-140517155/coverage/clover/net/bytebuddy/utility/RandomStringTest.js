var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":31,"id":53668,"methods":[{"el":19,"sc":5,"sl":13},{"el":25,"sc":5,"sl":21},{"el":30,"sc":5,"sl":27}],"name":"RandomStringTest","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4735":{"methods":[{"sl":13}],"name":"testRandomStringLength","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":18}]},"test_49":{"methods":[{"sl":21}],"name":"testRandom","pass":true,"statements":[{"sl":23},{"sl":24}]},"test_543":{"methods":[{"sl":27}],"name":"testNegativeLengthThrowsException","pass":true,"statements":[{"sl":29}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [4735], [], [4735], [4735], [4735], [4735], [], [], [49], [], [49], [49], [], [], [543], [], [543], [], []]
