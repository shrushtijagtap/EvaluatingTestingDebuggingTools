var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":21,"id":65089,"methods":[{"el":16,"sc":5,"sl":7}],"name":"Issue2254","sl":6},{"el":20,"id":65096,"methods":[],"name":"Issue2254.TestClass","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2167":{"methods":[{"sl":7}],"name":"test_for_issue","pass":true,"statements":[{"sl":8},{"sl":9},{"sl":10},{"sl":11},{"sl":13},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [2167], [2167], [2167], [2167], [2167], [], [2167], [], [2167], [], [], [], [], [], []]
