var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":33,"id":61710,"methods":[{"el":15,"sc":5,"sl":11}],"name":"Issue1494","sl":10},{"el":23,"id":61714,"methods":[{"el":22,"sc":9,"sl":20}],"name":"Issue1494.A","sl":17},{"el":32,"id":61716,"methods":[{"el":31,"sc":9,"sl":29}],"name":"Issue1494.B","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2506":{"methods":[{"sl":11},{"sl":20},{"sl":29}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":21},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [2506], [2506], [2506], [2506], [], [], [], [], [], [2506], [2506], [], [], [], [], [], [], [], [2506], [2506], [], [], []]
