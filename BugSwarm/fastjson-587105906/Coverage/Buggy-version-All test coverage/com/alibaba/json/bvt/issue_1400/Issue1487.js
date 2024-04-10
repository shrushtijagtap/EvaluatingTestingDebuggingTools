var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":49,"id":61623,"methods":[{"el":17,"sc":5,"sl":8}],"name":"Issue1487","sl":7},{"el":48,"id":61631,"methods":[{"el":30,"sc":9,"sl":23},{"el":35,"sc":9,"sl":32},{"el":43,"sc":9,"sl":37},{"el":47,"sc":9,"sl":45}],"name":"Issue1487.Model","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1361":{"methods":[{"sl":8},{"sl":23},{"sl":32},{"sl":37},{"sl":45}],"name":"test_for_issue","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":11},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":25},{"sl":26},{"sl":34},{"sl":38},{"sl":39},{"sl":46}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [1361], [1361], [1361], [1361], [], [1361], [1361], [1361], [1361], [], [], [], [], [], [], [1361], [], [1361], [1361], [], [], [], [], [], [1361], [], [1361], [], [], [1361], [1361], [1361], [], [], [], [], [], [1361], [1361], [], [], []]
