var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":50210,"methods":[{"el":18,"sc":5,"sl":11}],"name":"Bug_101_for_rongganlin_case3","sl":9},{"el":32,"id":50216,"methods":[{"el":26,"sc":9,"sl":24},{"el":30,"sc":9,"sl":28}],"name":"Bug_101_for_rongganlin_case3.Entity","sl":20},{"el":54,"id":50220,"methods":[{"el":40,"sc":9,"sl":38},{"el":44,"sc":9,"sl":42},{"el":48,"sc":9,"sl":46},{"el":52,"sc":9,"sl":50}],"name":"Bug_101_for_rongganlin_case3.Holder","sl":34}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1599":{"methods":[{"sl":11},{"sl":24},{"sl":28},{"sl":38},{"sl":42},{"sl":46},{"sl":50}],"name":"test_for_bug","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":25},{"sl":29},{"sl":43},{"sl":47},{"sl":51}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [1599], [1599], [1599], [], [1599], [1599], [1599], [], [], [], [], [], [], [1599], [1599], [], [], [1599], [1599], [], [], [], [], [], [], [], [], [1599], [], [], [], [1599], [1599], [], [], [1599], [1599], [], [], [1599], [1599], [], [], [], []]
