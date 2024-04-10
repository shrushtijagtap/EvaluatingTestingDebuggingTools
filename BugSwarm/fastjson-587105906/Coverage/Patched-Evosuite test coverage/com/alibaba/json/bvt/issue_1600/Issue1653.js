var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":27,"id":62287,"methods":[{"el":19,"sc":5,"sl":17},{"el":26,"sc":5,"sl":14}],"name":"Issue1653","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1280":{"methods":[{"sl":14},{"sl":17}],"name":"test_for_issue","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":18},{"sl":21},{"sl":23},{"sl":24},{"sl":25}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [1280], [1280], [1280], [1280], [1280], [], [], [1280], [], [1280], [1280], [1280], [], []]
