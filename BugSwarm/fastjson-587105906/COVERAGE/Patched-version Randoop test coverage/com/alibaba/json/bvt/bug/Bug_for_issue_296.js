var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":53208,"methods":[{"el":16,"sc":5,"sl":12},{"el":22,"sc":5,"sl":18},{"el":29,"sc":5,"sl":25}],"name":"Bug_for_issue_296","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1759":{"methods":[{"sl":18}],"name":"test_for_issue_space","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":21}]},"test_4800":{"methods":[{"sl":25}],"name":"test_for_issue_127","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":28}]},"test_904":{"methods":[{"sl":12}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [904], [904], [904], [904], [], [], [1759], [1759], [1759], [1759], [], [], [], [4800], [4800], [4800], [4800], [], []]
