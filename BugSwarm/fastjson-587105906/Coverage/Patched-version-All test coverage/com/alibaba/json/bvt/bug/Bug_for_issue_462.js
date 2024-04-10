var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":53796,"methods":[{"el":17,"sc":5,"sl":13},{"el":23,"sc":5,"sl":19},{"el":29,"sc":5,"sl":25}],"name":"Bug_for_issue_462","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1664":{"methods":[{"sl":19}],"name":"test_long","pass":true,"statements":[{"sl":20},{"sl":21},{"sl":22}]},"test_4353":{"methods":[{"sl":13}],"name":"test_int","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16}]},"test_4408":{"methods":[{"sl":25}],"name":"test_bigint","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [4353], [4353], [4353], [4353], [], [], [1664], [1664], [1664], [1664], [], [], [4408], [4408], [4408], [4408], [], []]
