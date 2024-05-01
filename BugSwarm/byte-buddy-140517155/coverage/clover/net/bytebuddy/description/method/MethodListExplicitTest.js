var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":33950,"methods":[{"el":10,"sc":5,"sl":7},{"el":15,"sc":5,"sl":12},{"el":20,"sc":5,"sl":17},{"el":25,"sc":5,"sl":22}],"name":"MethodListExplicitTest","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1260":{"methods":[{"sl":7},{"sl":17},{"sl":22}],"name":"testAsDefined","pass":true,"statements":[{"sl":9},{"sl":19},{"sl":24}]},"test_1478":{"methods":[{"sl":7},{"sl":17},{"sl":22}],"name":"testGetOnlySingleList","pass":true,"statements":[{"sl":9},{"sl":19},{"sl":24}]},"test_1958":{"methods":[{"sl":7},{"sl":12},{"sl":17}],"name":"testGetOnlyTwoElementList","pass":true,"statements":[{"sl":9},{"sl":14},{"sl":19}]},"test_2627":{"methods":[{"sl":17}],"name":"testGetOnlyEmptyList","pass":true,"statements":[{"sl":19}]},"test_3926":{"methods":[{"sl":7},{"sl":12},{"sl":17},{"sl":22}],"name":"testSubList","pass":true,"statements":[{"sl":9},{"sl":14},{"sl":19},{"sl":24}]},"test_5385":{"methods":[{"sl":7},{"sl":17},{"sl":22}],"name":"testTokenWithMatcher","pass":true,"statements":[{"sl":9},{"sl":19},{"sl":24}]},"test_887":{"methods":[{"sl":7},{"sl":12},{"sl":17},{"sl":22}],"name":"testFilter","pass":true,"statements":[{"sl":9},{"sl":14},{"sl":19},{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [5385, 1260, 1478, 3926, 887, 1958], [], [5385, 1260, 1478, 3926, 887, 1958], [], [], [3926, 887, 1958], [], [3926, 887, 1958], [], [], [5385, 2627, 1260, 1478, 3926, 887, 1958], [], [5385, 2627, 1260, 1478, 3926, 887, 1958], [], [], [5385, 1260, 1478, 3926, 887], [], [5385, 1260, 1478, 3926, 887], [], []]
