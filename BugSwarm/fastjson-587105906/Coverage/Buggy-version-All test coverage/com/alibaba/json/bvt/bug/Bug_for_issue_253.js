var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":53196,"methods":[{"el":18,"sc":5,"sl":13}],"name":"Bug_for_issue_253","sl":12},{"el":34,"id":53201,"methods":[{"el":26,"sc":9,"sl":24},{"el":31,"sc":9,"sl":29}],"name":"Bug_for_issue_253.VO","sl":20}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1853":{"methods":[{"sl":13},{"sl":24},{"sl":29}],"name":"test_for_issue","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":25},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [1853], [1853], [1853], [1853], [1853], [], [], [], [], [], [], [1853], [1853], [], [], [], [1853], [1853], [], [], [], [], []]
