var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":25,"id":53926,"methods":[{"el":14,"sc":5,"sl":11}],"name":"Bug_for_issue_489","sl":9},{"el":24,"id":53929,"methods":[{"el":23,"sc":9,"sl":20}],"name":"Bug_for_issue_489.Foo","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2836":{"methods":[{"sl":11},{"sl":20}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [2836], [2836], [2836], [], [], [], [], [], [], [2836], [], [2836], [], [], []]
