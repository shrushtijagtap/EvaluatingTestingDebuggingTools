var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":19,"id":62053,"methods":[{"el":18,"sc":5,"sl":11}],"name":"Issue1588","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2990":{"methods":[{"sl":11}],"name":"test_for_issue","pass":false,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [2990], [2990], [2990], [2990], [2990], [2990], [], [], []]
