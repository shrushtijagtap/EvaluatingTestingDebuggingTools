var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":59771,"methods":[{"el":21,"sc":5,"sl":15},{"el":29,"sc":5,"sl":23}],"name":"FeaturesTest6","sl":13},{"el":41,"id":59781,"methods":[{"el":38,"sc":9,"sl":35}],"name":"FeaturesTest6.Entity","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1913":{"methods":[{"sl":15},{"sl":35}],"name":"test_0","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":19},{"sl":20},{"sl":37}]},"test_2380":{"methods":[{"sl":23},{"sl":35}],"name":"test_1","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":27},{"sl":28},{"sl":37}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1913], [1913], [1913], [], [1913], [1913], [], [], [2380], [2380], [2380], [], [2380], [2380], [], [], [], [], [], [], [1913, 2380], [], [1913, 2380], [], [], [], [], []]
