var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":53276,"methods":[{"el":17,"sc":5,"sl":13}],"name":"Bug_for_issue_269","sl":11},{"el":31,"id":53280,"methods":[{"el":25,"sc":9,"sl":23},{"el":29,"sc":9,"sl":27}],"name":"Bug_for_issue_269.VO","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3627":{"methods":[{"sl":13},{"sl":27}],"name":"test_for_issue","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [3627], [3627], [3627], [3627], [], [], [], [], [], [], [], [], [], [], [3627], [3627], [], [], [], []]
