var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":22,"id":64818,"methods":[{"el":13,"sc":5,"sl":7},{"el":21,"sc":5,"sl":15}],"name":"Issue2189","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1056":{"methods":[{"sl":7}],"name":"test_for_issue","pass":true,"statements":[{"sl":8},{"sl":9}]},"test_3456":{"methods":[{"sl":15}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":16},{"sl":17}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [1056], [1056], [1056], [], [], [], [], [], [3456], [3456], [3456], [], [], [], [], []]
