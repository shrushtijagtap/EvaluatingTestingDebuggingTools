var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":48,"id":52078,"methods":[{"el":23,"sc":5,"sl":12}],"name":"Bug_for_issue_285","sl":10},{"el":28,"id":52088,"methods":[],"name":"Bug_for_issue_285.VO","sl":25},{"el":33,"id":52088,"methods":[],"name":"Bug_for_issue_285.V1","sl":30},{"el":38,"id":52088,"methods":[],"name":"Bug_for_issue_285.V2","sl":35},{"el":42,"id":52088,"methods":[],"name":"Bug_for_issue_285.V3","sl":40},{"el":47,"id":52088,"methods":[],"name":"Bug_for_issue_285.V4","sl":45}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_853":{"methods":[{"sl":12}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":19},{"sl":20},{"sl":21},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [853], [853], [853], [853], [853], [853], [], [853], [853], [853], [853], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
