var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":50534,"methods":[{"el":33,"sc":5,"sl":11}],"name":"TestType","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1345":{"methods":[{"sl":11}],"name":"test_getType","pass":true,"statements":[{"sl":12},{"sl":14},{"sl":16},{"sl":18},{"sl":20},{"sl":22},{"sl":24},{"sl":26},{"sl":28},{"sl":30},{"sl":31},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [1345], [1345], [], [1345], [], [1345], [], [1345], [], [1345], [], [1345], [], [1345], [], [1345], [], [1345], [], [1345], [1345], [1345], [], [], []]
