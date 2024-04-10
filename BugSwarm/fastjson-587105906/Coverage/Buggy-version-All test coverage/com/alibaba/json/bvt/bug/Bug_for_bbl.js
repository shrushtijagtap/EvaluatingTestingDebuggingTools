var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":52467,"methods":[{"el":31,"sc":5,"sl":14}],"name":"Bug_for_bbl","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1232":{"methods":[{"sl":14}],"name":"test_bug","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":19},{"sl":21},{"sl":23},{"sl":25},{"sl":26},{"sl":27},{"sl":29},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [1232], [1232], [1232], [], [], [1232], [], [1232], [], [1232], [], [1232], [1232], [1232], [], [1232], [1232], [], []]
