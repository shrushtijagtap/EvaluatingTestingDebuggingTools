var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":71,"id":51998,"methods":[{"el":27,"sc":5,"sl":19},{"el":35,"sc":5,"sl":29}],"name":"Bug_for_issue_265","sl":17},{"el":59,"id":52008,"methods":[{"el":43,"sc":9,"sl":41},{"el":47,"sc":9,"sl":45},{"el":53,"sc":9,"sl":49},{"el":58,"sc":9,"sl":55}],"name":"Bug_for_issue_265.Model","sl":37},{"el":70,"id":52016,"methods":[{"el":65,"sc":9,"sl":63},{"el":69,"sc":9,"sl":67}],"name":"Bug_for_issue_265.User","sl":61}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2882":{"methods":[{"sl":19},{"sl":49},{"sl":67}],"name":"test_for_issue","pass":true,"statements":[{"sl":20},{"sl":21},{"sl":23},{"sl":25},{"sl":52},{"sl":68}]},"test_3291":{"methods":[{"sl":29},{"sl":67}],"name":"test_for_issue_decode","pass":false,"statements":[{"sl":30},{"sl":32},{"sl":68}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2882], [2882], [2882], [], [2882], [], [2882], [], [], [], [3291], [3291], [], [3291], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2882], [], [], [2882], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3291, 2882], [3291, 2882], [], [], []]
