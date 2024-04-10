var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":63253,"methods":[{"el":16,"sc":5,"sl":9},{"el":22,"sc":5,"sl":18}],"name":"Issue1582","sl":8},{"el":26,"id":63263,"methods":[],"name":"Issue1582.Model","sl":24},{"el":36,"id":63263,"methods":[],"name":"Issue1582.Size","sl":28}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3132":{"methods":[{"sl":9}],"name":"test_for_issue","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12},{"sl":13},{"sl":15}]},"test_853":{"methods":[{"sl":18}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":21}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [3132], [3132], [3132], [3132], [3132], [], [3132], [], [], [853], [853], [853], [853], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
