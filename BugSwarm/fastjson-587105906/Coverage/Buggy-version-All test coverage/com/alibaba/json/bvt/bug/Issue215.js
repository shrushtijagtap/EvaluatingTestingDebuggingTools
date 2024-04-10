var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":56800,"methods":[{"el":29,"sc":5,"sl":16}],"name":"Issue215","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4581":{"methods":[{"sl":16}],"name":"test_for_issue","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":20},{"sl":21},{"sl":23},{"sl":24},{"sl":26},{"sl":27},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4581], [4581], [4581], [], [4581], [4581], [], [4581], [4581], [], [4581], [4581], [4581], [], []]
