var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":31,"id":24110,"methods":[{"el":15,"sc":5,"sl":12},{"el":20,"sc":5,"sl":17},{"el":25,"sc":5,"sl":22},{"el":30,"sc":5,"sl":27}],"name":"IsNamedMatcher","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_112":{"methods":[{"sl":12}],"name":"testPositiveToNegative","pass":true,"statements":[{"sl":14}]},"test_1667":{"methods":[{"sl":17},{"sl":22},{"sl":27}],"name":"testObjectProperties","pass":true,"statements":[{"sl":19},{"sl":24},{"sl":29}]},"test_1998":{"methods":[{"sl":12}],"name":"testIsNamed","pass":true,"statements":[{"sl":14}]},"test_4512":{"methods":[{"sl":12}],"name":"testMatch","pass":true,"statements":[{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [112, 4512, 1998], [], [112, 4512, 1998], [], [], [1667], [], [1667], [], [], [1667], [], [1667], [], [], [1667], [], [1667], [], []]
