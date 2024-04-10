var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":13,"id":65119,"methods":[{"el":12,"sc":5,"sl":6}],"name":"MAPersonGroupedCollection","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2587":{"methods":[{"sl":6}],"name":"test_for_issue_4","pass":true,"statements":[{"sl":8},{"sl":10},{"sl":11}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [2587], [], [2587], [], [2587], [2587], [], []]
