var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":13,"id":64581,"methods":[{"el":12,"sc":5,"sl":7}],"name":"Issue2150","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3969":{"methods":[{"sl":7}],"name":"test_for_issue","pass":true,"statements":[{"sl":8},{"sl":9},{"sl":10},{"sl":11}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [3969], [3969], [3969], [3969], [3969], [], []]
