var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":90265,"methods":[{"el":19,"sc":5,"sl":13}],"name":"TestOracleDATE","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1409":{"methods":[{"sl":13}],"name":"test_0","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":17},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [1409], [1409], [1409], [], [1409], [1409], [], []]
