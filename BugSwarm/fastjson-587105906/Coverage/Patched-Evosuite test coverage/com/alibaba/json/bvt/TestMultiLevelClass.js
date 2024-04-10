var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":61,"id":46543,"methods":[{"el":60,"sc":5,"sl":50}],"name":"TestMultiLevelClass","sl":7},{"el":48,"id":46543,"methods":[{"el":15,"sc":9,"sl":13},{"el":19,"sc":9,"sl":17}],"name":"TestMultiLevelClass.A","sl":9},{"el":47,"id":46547,"methods":[{"el":27,"sc":13,"sl":25},{"el":31,"sc":13,"sl":29}],"name":"TestMultiLevelClass.A.B","sl":21},{"el":46,"id":46551,"methods":[{"el":40,"sc":17,"sl":38},{"el":45,"sc":17,"sl":43}],"name":"TestMultiLevelClass.A.B.C","sl":33}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3851":{"methods":[{"sl":13},{"sl":17},{"sl":25},{"sl":29},{"sl":38},{"sl":43},{"sl":50}],"name":"test_codec","pass":true,"statements":[{"sl":14},{"sl":18},{"sl":26},{"sl":30},{"sl":39},{"sl":44},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":56},{"sl":57},{"sl":59}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [3851], [3851], [], [], [3851], [3851], [], [], [], [], [], [], [3851], [3851], [], [], [3851], [3851], [], [], [], [], [], [], [], [3851], [3851], [], [], [], [3851], [3851], [], [], [], [], [], [3851], [3851], [3851], [3851], [3851], [], [3851], [3851], [], [3851], [], []]
