var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":27,"id":53589,"methods":[{"el":15,"sc":5,"sl":11}],"name":"Bug_for_issue_414","sl":9},{"el":26,"id":53593,"methods":[{"el":22,"sc":9,"sl":20},{"el":25,"sc":9,"sl":23}],"name":"Bug_for_issue_414.TestEntity","sl":17}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2288":{"methods":[{"sl":11},{"sl":20},{"sl":23}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":21},{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [2288], [2288], [2288], [2288], [], [], [], [], [], [2288], [2288], [], [2288], [2288], [], [], []]
