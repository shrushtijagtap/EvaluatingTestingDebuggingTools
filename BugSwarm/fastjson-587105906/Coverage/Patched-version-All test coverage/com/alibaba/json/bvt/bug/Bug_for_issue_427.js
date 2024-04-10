var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":27,"id":53654,"methods":[{"el":21,"sc":5,"sl":12}],"name":"Bug_for_issue_427","sl":10},{"el":26,"id":53659,"methods":[],"name":"Bug_for_issue_427.Model","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1050":{"methods":[{"sl":12}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":18},{"sl":19},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [1050], [1050], [], [], [], [], [1050], [1050], [1050], [], [], [], [], [], [], []]
