var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":16,"id":61587,"methods":[{"el":11,"sc":5,"sl":9}],"name":"Issue1482","sl":8},{"el":15,"id":61589,"methods":[],"name":"Issue1482.Model","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3170":{"methods":[{"sl":9}],"name":"test_for_issue","pass":true,"statements":[{"sl":10}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [3170], [3170], [], [], [], [], [], []]
