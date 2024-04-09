var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":72,"id":52695,"methods":[{"el":25,"sc":2,"sl":15},{"el":44,"sc":2,"sl":27}],"name":"Bug_for_fushou","sl":13},{"el":56,"id":52712,"methods":[{"el":51,"sc":3,"sl":49},{"el":55,"sc":3,"sl":53}],"name":"Bug_for_fushou.L1","sl":46},{"el":64,"id":52716,"methods":[{"el":63,"sc":3,"sl":61}],"name":"Bug_for_fushou.L2","sl":58},{"el":71,"id":52717,"methods":[{"el":70,"sc":3,"sl":68}],"name":"Bug_for_fushou.L3","sl":66}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2998":{"methods":[{"sl":27},{"sl":49},{"sl":53},{"sl":61},{"sl":68}],"name":"test_case2","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":31},{"sl":33},{"sl":35},{"sl":37},{"sl":39},{"sl":41},{"sl":43},{"sl":50},{"sl":54}]},"test_3540":{"methods":[{"sl":15},{"sl":49},{"sl":53},{"sl":61}],"name":"test_case1","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":19},{"sl":21},{"sl":23},{"sl":24},{"sl":50},{"sl":54}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3540], [3540], [3540], [], [3540], [], [3540], [], [3540], [3540], [], [], [2998], [2998], [2998], [], [2998], [], [2998], [], [2998], [], [2998], [], [2998], [], [2998], [], [2998], [], [], [], [], [], [3540, 2998], [3540, 2998], [], [], [3540, 2998], [3540, 2998], [], [], [], [], [], [], [3540, 2998], [], [], [], [], [], [], [2998], [], [], [], []]
