var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":71,"id":53419,"methods":[{"el":30,"sc":5,"sl":15}],"name":"Bug_for_issue_383","sl":13},{"el":55,"id":53431,"methods":[{"el":38,"sc":9,"sl":37},{"el":42,"sc":9,"sl":40},{"el":46,"sc":9,"sl":44},{"el":50,"sc":9,"sl":48},{"el":54,"sc":9,"sl":52}],"name":"Bug_for_issue_383.TestClass","sl":32},{"el":70,"id":53440,"methods":[{"el":61,"sc":9,"sl":60},{"el":65,"sc":9,"sl":63},{"el":69,"sc":9,"sl":67}],"name":"Bug_for_issue_383.Member","sl":57}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4180":{"methods":[{"sl":15},{"sl":37},{"sl":40},{"sl":44},{"sl":48},{"sl":52},{"sl":60},{"sl":63},{"sl":67}],"name":"test_for_issue","pass":false,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":24},{"sl":25},{"sl":26},{"sl":41},{"sl":45},{"sl":49},{"sl":53},{"sl":64},{"sl":68}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4180], [4180], [4180], [4180], [4180], [4180], [4180], [], [], [4180], [4180], [4180], [], [], [], [], [], [], [], [], [], [], [4180], [], [], [4180], [4180], [], [], [4180], [4180], [], [], [4180], [4180], [], [], [4180], [4180], [], [], [], [], [], [], [4180], [], [], [4180], [4180], [], [], [4180], [4180], [], [], []]
