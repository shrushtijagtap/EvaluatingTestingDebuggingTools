var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":17,"id":64361,"methods":[{"el":10,"sc":5,"sl":7}],"name":"Issue2086","sl":6},{"el":16,"id":64364,"methods":[{"el":15,"sc":9,"sl":13}],"name":"Issue2086.Model","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1617":{"methods":[{"sl":7}],"name":"test_for_issue","pass":false,"statements":[{"sl":8}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [1617], [1617], [], [], [], [], [], [], [], [], []]
