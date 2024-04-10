var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":59986,"methods":[{"el":16,"sc":5,"sl":12},{"el":22,"sc":5,"sl":18}],"name":"Issue1080","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2039":{"methods":[{"sl":18}],"name":"test_for_issue_2","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":21}]},"test_654":{"methods":[{"sl":12}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [654], [654], [654], [654], [], [], [2039], [2039], [2039], [2039], [], []]
