var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":27,"id":55187,"methods":[{"el":18,"sc":5,"sl":11},{"el":26,"sc":5,"sl":20}],"name":"Issue119","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1118":{"methods":[{"sl":20}],"name":"test_for_issue_b","pass":true,"statements":[{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":25}]},"test_2207":{"methods":[{"sl":11}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [2207], [2207], [2207], [2207], [2207], [2207], [2207], [], [], [1118], [1118], [1118], [1118], [1118], [1118], [], []]
