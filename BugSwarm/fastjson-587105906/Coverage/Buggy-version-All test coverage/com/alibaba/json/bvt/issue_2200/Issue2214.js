var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":64842,"methods":[{"el":23,"sc":5,"sl":12}],"name":"Issue2214","sl":11},{"el":29,"id":64853,"methods":[{"el":28,"sc":9,"sl":26}],"name":"Issue2214.User","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1965":{"methods":[{"sl":12},{"sl":26}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":27}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [1965], [1965], [1965], [1965], [1965], [1965], [1965], [1965], [1965], [1965], [1965], [], [], [], [1965], [1965], [], [], []]
