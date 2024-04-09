var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":14,"id":65229,"methods":[{"el":13,"sc":5,"sl":8}],"name":"PersonGroupedCollection","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4307":{"methods":[{"sl":8}],"name":"test_for_issue_2","pass":true,"statements":[{"sl":10},{"sl":12}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [4307], [], [4307], [], [4307], [], []]
