var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":53681,"methods":[{"el":17,"sc":5,"sl":13},{"el":23,"sc":5,"sl":19},{"el":29,"sc":5,"sl":25}],"name":"Bug_for_issue_462","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2299":{"methods":[{"sl":13}],"name":"test_int","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16}]},"test_239":{"methods":[{"sl":19}],"name":"test_long","pass":true,"statements":[{"sl":20},{"sl":21},{"sl":22}]},"test_2598":{"methods":[{"sl":25}],"name":"test_bigint","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [2299], [2299], [2299], [2299], [], [], [239], [239], [239], [239], [], [], [2598], [2598], [2598], [2598], [], []]
