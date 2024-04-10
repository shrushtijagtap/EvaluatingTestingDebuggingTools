var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":33,"id":59737,"methods":[{"el":19,"sc":5,"sl":11}],"name":"get_set_Test","sl":9},{"el":32,"id":59744,"methods":[{"el":27,"sc":9,"sl":25},{"el":31,"sc":9,"sl":29}],"name":"get_set_Test.VO","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3000":{"methods":[{"sl":11},{"sl":25},{"sl":29}],"name":"test_codec","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":26},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3000], [3000], [3000], [], [3000], [3000], [3000], [3000], [], [], [], [], [], [], [3000], [3000], [], [], [3000], [3000], [], [], []]
