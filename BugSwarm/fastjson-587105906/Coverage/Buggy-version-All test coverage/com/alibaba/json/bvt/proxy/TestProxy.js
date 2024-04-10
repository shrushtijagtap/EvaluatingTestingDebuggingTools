var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":53,"id":81605,"methods":[{"el":19,"sc":5,"sl":13}],"name":"TestProxy","sl":11},{"el":23,"id":81609,"methods":[],"name":"TestProxy.I","sl":21},{"el":51,"id":81609,"methods":[{"el":33,"sc":9,"sl":31},{"el":37,"sc":9,"sl":35},{"el":41,"sc":9,"sl":39},{"el":45,"sc":9,"sl":43},{"el":49,"sc":9,"sl":47}],"name":"TestProxy.VO","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2532":{"methods":[{"sl":13}],"name":"test_0","pass":true,"statements":[{"sl":14},{"sl":16},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [2532], [2532], [], [2532], [], [2532], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
