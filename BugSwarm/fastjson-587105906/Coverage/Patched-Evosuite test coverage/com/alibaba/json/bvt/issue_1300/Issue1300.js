var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":59436,"methods":[{"el":23,"sc":5,"sl":14},{"el":29,"sc":5,"sl":25}],"name":"Issue1300","sl":13},{"el":45,"id":59449,"methods":[{"el":44,"sc":9,"sl":37}],"name":"Issue1300.City","sl":32},{"el":49,"id":59453,"methods":[],"name":"Issue1300.Parcelable","sl":47}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2086":{"methods":[{"sl":25},{"sl":37}],"name":"testEmptyJSON","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":28},{"sl":41},{"sl":42},{"sl":43}]},"test_4382":{"methods":[{"sl":14},{"sl":37}],"name":"testFullJSON","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":41},{"sl":42},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [4382], [4382], [4382], [4382], [4382], [4382], [4382], [4382], [4382], [], [], [2086], [2086], [2086], [2086], [], [], [], [], [], [], [], [], [4382, 2086], [], [], [], [4382, 2086], [4382, 2086], [4382, 2086], [], [], [], [], [], [], []]
