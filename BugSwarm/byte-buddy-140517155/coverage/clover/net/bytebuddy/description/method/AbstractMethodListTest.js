var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":33,"id":33842,"methods":[{"el":20,"sc":5,"sl":15},{"el":25,"sc":5,"sl":22}],"name":"AbstractMethodListTest","sl":13},{"el":32,"id":33846,"methods":[],"name":"AbstractMethodListTest.Foo","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1260":{"methods":[{"sl":22}],"name":"testAsDefined","pass":true,"statements":[{"sl":24}]},"test_1755":{"methods":[{"sl":15}],"name":"testTokenWithMatcher","pass":true,"statements":[{"sl":18}]},"test_4285":{"methods":[{"sl":15}],"name":"testTokenWithMatcher","pass":true,"statements":[{"sl":18}]},"test_490":{"methods":[{"sl":22}],"name":"testAsDefined","pass":true,"statements":[{"sl":24}]},"test_5385":{"methods":[{"sl":15}],"name":"testTokenWithMatcher","pass":true,"statements":[{"sl":18}]},"test_5628":{"methods":[{"sl":22}],"name":"testAsDefined","pass":true,"statements":[{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [5385, 1755, 4285], [], [], [5385, 1755, 4285], [], [], [], [1260, 5628, 490], [], [1260, 5628, 490], [], [], [], [], [], [], [], [], []]
