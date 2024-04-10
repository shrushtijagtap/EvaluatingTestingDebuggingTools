var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":16,"id":47066,"methods":[{"el":15,"sc":5,"sl":10}],"name":"SlashTest","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2233":{"methods":[{"sl":10}],"name":"test_0","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [2233], [2233], [2233], [], [2233], [], []]
