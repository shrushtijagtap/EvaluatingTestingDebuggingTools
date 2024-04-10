var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":61257,"methods":[{"el":15,"sc":5,"sl":10},{"el":25,"sc":5,"sl":17}],"name":"Issue_for_zuojian","sl":9},{"el":29,"id":61268,"methods":[],"name":"Issue_for_zuojian.Model","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1242":{"methods":[{"sl":10}],"name":"test_for_issue","pass":false,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_3877":{"methods":[{"sl":17}],"name":"test_for_issue_1","pass":false,"statements":[{"sl":18},{"sl":20},{"sl":21},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [1242], [1242], [1242], [1242], [], [], [], [3877], [3877], [], [3877], [3877], [3877], [], [], [], [], [], [], [], []]
