var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":57,"id":66710,"methods":[{"el":23,"sc":5,"sl":14},{"el":31,"sc":5,"sl":25}],"name":"Issue1543","sl":13},{"el":56,"id":66722,"methods":[{"el":55,"sc":9,"sl":35}],"name":"Issue1543.ExtClassLoader","sl":33}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2577":{"methods":[{"sl":25},{"sl":35}],"name":"test_cluster","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":29},{"sl":30},{"sl":36},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":44},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":53}]},"test_4572":{"methods":[{"sl":14},{"sl":35}],"name":"test_user","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":18},{"sl":19},{"sl":20},{"sl":22},{"sl":36},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":44},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [4572], [4572], [4572], [], [4572], [4572], [4572], [], [4572], [], [], [2577], [2577], [2577], [], [2577], [2577], [], [], [], [], [2577, 4572], [2577, 4572], [], [], [2577, 4572], [2577, 4572], [2577, 4572], [2577, 4572], [], [2577, 4572], [], [], [], [2577, 4572], [2577, 4572], [2577, 4572], [2577, 4572], [], [2577, 4572], [], [], [], []]
