var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":53330,"methods":[{"el":16,"sc":5,"sl":12},{"el":22,"sc":5,"sl":18},{"el":29,"sc":5,"sl":25}],"name":"Bug_for_issue_296","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1337":{"methods":[{"sl":18}],"name":"test_for_issue_space","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":21}]},"test_4497":{"methods":[{"sl":25}],"name":"test_for_issue_127","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":28}]},"test_4712":{"methods":[{"sl":12}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [4712], [4712], [4712], [4712], [], [], [1337], [1337], [1337], [1337], [], [], [], [4497], [4497], [4497], [4497], [], []]
