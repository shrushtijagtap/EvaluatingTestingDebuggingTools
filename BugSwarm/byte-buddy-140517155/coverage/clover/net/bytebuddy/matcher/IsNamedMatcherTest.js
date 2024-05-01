var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":52072,"methods":[{"el":20,"sc":5,"sl":17},{"el":26,"sc":5,"sl":22},{"el":31,"sc":5,"sl":28}],"name":"IsNamedMatcherTest","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_112":{"methods":[{"sl":28}],"name":"testPositiveToNegative","pass":true,"statements":[{"sl":30}]},"test_4512":{"methods":[{"sl":22}],"name":"testMatch","pass":true,"statements":[{"sl":24},{"sl":25}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4512], [], [4512], [4512], [], [], [112], [], [112], [], []]
