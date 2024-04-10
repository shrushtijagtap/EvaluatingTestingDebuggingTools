var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":56646,"methods":[{"el":17,"sc":5,"sl":11}],"name":"Issue204","sl":9},{"el":31,"id":56651,"methods":[{"el":25,"sc":9,"sl":23},{"el":29,"sc":9,"sl":27}],"name":"Issue204.VO","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_321":{"methods":[{"sl":11},{"sl":23}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":14},{"sl":15},{"sl":16},{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [321], [321], [], [321], [321], [321], [], [], [], [], [], [], [321], [321], [], [], [], [], [], [], [], []]
