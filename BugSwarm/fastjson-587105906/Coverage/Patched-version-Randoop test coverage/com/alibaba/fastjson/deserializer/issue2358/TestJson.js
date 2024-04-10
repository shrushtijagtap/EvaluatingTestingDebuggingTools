var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":64,"id":40547,"methods":[{"el":17,"sc":5,"sl":15},{"el":21,"sc":5,"sl":19},{"el":25,"sc":5,"sl":23},{"el":29,"sc":5,"sl":27},{"el":63,"sc":5,"sl":52}],"name":"TestJson","sl":10},{"el":50,"id":40555,"methods":[{"el":37,"sc":9,"sl":35},{"el":41,"sc":9,"sl":39},{"el":45,"sc":9,"sl":43},{"el":49,"sc":9,"sl":47}],"name":"TestJson.TestJson2","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
