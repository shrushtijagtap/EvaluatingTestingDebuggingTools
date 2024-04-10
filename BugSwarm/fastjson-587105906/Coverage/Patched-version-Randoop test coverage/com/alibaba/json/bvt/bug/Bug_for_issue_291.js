var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":38,"id":53198,"methods":[{"el":13,"sc":5,"sl":11},{"el":20,"sc":5,"sl":15},{"el":27,"sc":5,"sl":22}],"name":"Bug_for_issue_291","sl":10},{"el":32,"id":53208,"methods":[],"name":"Bug_for_issue_291.VO","sl":29},{"el":37,"id":53208,"methods":[],"name":"Bug_for_issue_291.V1","sl":34}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2946":{"methods":[{"sl":22}],"name":"test_for_issue_private","pass":true,"statements":[{"sl":23},{"sl":25},{"sl":26}]},"test_3321":{"methods":[{"sl":15}],"name":"test_for_issue","pass":true,"statements":[{"sl":16},{"sl":18},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3321], [3321], [], [3321], [3321], [], [], [2946], [2946], [], [2946], [2946], [], [], [], [], [], [], [], [], [], [], [], []]
