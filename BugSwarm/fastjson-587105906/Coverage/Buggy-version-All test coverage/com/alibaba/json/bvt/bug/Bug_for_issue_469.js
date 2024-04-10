var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":33,"id":53869,"methods":[{"el":18,"sc":5,"sl":11}],"name":"Bug_for_issue_469","sl":9},{"el":32,"id":53875,"methods":[{"el":26,"sc":9,"sl":24},{"el":30,"sc":9,"sl":28}],"name":"Bug_for_issue_469.VO","sl":20}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3665":{"methods":[{"sl":11},{"sl":24},{"sl":28}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":25},{"sl":29}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3665], [3665], [3665], [], [3665], [3665], [3665], [], [], [], [], [], [], [3665], [3665], [], [], [3665], [3665], [], [], [], []]
