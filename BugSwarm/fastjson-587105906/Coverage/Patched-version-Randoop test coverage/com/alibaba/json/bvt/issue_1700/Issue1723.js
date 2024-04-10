var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":38,"id":63696,"methods":[{"el":11,"sc":5,"sl":8},{"el":16,"sc":5,"sl":13},{"el":21,"sc":5,"sl":18}],"name":"Issue1723","sl":7},{"el":37,"id":63705,"methods":[{"el":27,"sc":9,"sl":25},{"el":30,"sc":9,"sl":28},{"el":36,"sc":9,"sl":31}],"name":"Issue1723.User","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3114":{"methods":[{"sl":13},{"sl":28}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":29}]},"test_4146":{"methods":[{"sl":8},{"sl":28}],"name":"test_for_issue","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":29}]},"test_613":{"methods":[{"sl":18},{"sl":28}],"name":"test_for_issue_2","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":29}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [4146], [4146], [4146], [], [], [3114], [3114], [3114], [], [], [613], [613], [613], [], [], [], [], [], [], [], [613, 4146, 3114], [613, 4146, 3114], [], [], [], [], [], [], [], [], []]
