var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":53171,"methods":[{"el":17,"sc":5,"sl":11},{"el":22,"sc":5,"sl":19}],"name":"Bug_for_issue_278","sl":9},{"el":36,"id":53179,"methods":[{"el":30,"sc":9,"sl":28},{"el":34,"sc":9,"sl":32}],"name":"Bug_for_issue_278.VO","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_194":{"methods":[{"sl":19},{"sl":32}],"name":"test_for_issue_decode","pass":true,"statements":[{"sl":20},{"sl":21},{"sl":33}]},"test_4675":{"methods":[{"sl":11},{"sl":28},{"sl":32}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":29},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [4675], [4675], [4675], [], [4675], [4675], [], [], [194], [194], [194], [], [], [], [], [], [], [4675], [4675], [], [], [194, 4675], [194, 4675], [], [], [], []]
