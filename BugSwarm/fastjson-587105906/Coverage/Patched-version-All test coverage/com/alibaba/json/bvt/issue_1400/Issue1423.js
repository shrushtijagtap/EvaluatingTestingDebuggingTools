var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":69,"id":61337,"methods":[{"el":25,"sc":5,"sl":15},{"el":35,"sc":5,"sl":27},{"el":45,"sc":5,"sl":37},{"el":56,"sc":5,"sl":47}],"name":"Issue1423","sl":14},{"el":68,"id":61364,"methods":[{"el":62,"sc":9,"sl":60},{"el":67,"sc":9,"sl":64}],"name":"Issue1423.LongVal","sl":58}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1800":{"methods":[{"sl":15}],"name":"test_for_issue","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":20},{"sl":21},{"sl":23},{"sl":24}]},"test_2627":{"methods":[{"sl":37},{"sl":60}],"name":"test_for_issue_arrayMapping","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40},{"sl":42},{"sl":44},{"sl":61}]},"test_2759":{"methods":[{"sl":47}],"name":"test_for_issue_arrayMapping_reader","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":52},{"sl":54},{"sl":55}]},"test_4695":{"methods":[{"sl":27}],"name":"test_for_issue_reader","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":32},{"sl":34}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1800], [1800], [1800], [1800], [], [1800], [1800], [], [1800], [1800], [], [], [4695], [4695], [4695], [4695], [], [4695], [], [4695], [], [], [2627], [2627], [2627], [2627], [], [2627], [], [2627], [], [], [2759], [2759], [2759], [2759], [], [2759], [], [2759], [2759], [], [], [], [], [2627], [2627], [], [], [], [], [], [], [], []]
