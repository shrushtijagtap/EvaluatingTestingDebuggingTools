var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":33,"id":63033,"methods":[{"el":11,"sc":5,"sl":8},{"el":16,"sc":5,"sl":13}],"name":"Issue_for_float_zero","sl":7},{"el":24,"id":63039,"methods":[{"el":23,"sc":9,"sl":21}],"name":"Issue_for_float_zero.M1","sl":18},{"el":32,"id":63041,"methods":[{"el":31,"sc":9,"sl":29}],"name":"Issue_for_float_zero.M2","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4504":{"methods":[{"sl":8},{"sl":21}],"name":"test_0","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":22}]},"test_792":{"methods":[{"sl":13},{"sl":29}],"name":"test_1","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [4504], [4504], [4504], [], [], [792], [792], [792], [], [], [], [], [], [4504], [4504], [], [], [], [], [], [], [792], [792], [], [], []]
