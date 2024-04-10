var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":54,"id":64016,"methods":[{"el":28,"sc":2,"sl":20}],"name":"Issue1780_Module","sl":18},{"el":53,"id":64023,"methods":[{"el":36,"sc":3,"sl":32},{"el":49,"sc":5,"sl":43},{"el":51,"sc":3,"sl":38}],"name":"Issue1780_Module.myModule","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3541":{"methods":[{"sl":20},{"sl":38},{"sl":43}],"name":"test_for_issue","pass":true,"statements":[{"sl":21},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":41},{"sl":46},{"sl":47},{"sl":48}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3541], [3541], [], [3541], [3541], [3541], [3541], [3541], [], [], [], [], [], [], [], [], [], [], [3541], [], [], [3541], [], [3541], [], [], [3541], [3541], [3541], [], [], [], [], [], []]
