var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":55490,"methods":[{"el":19,"sc":5,"sl":12}],"name":"Issue184","sl":10},{"el":33,"id":55496,"methods":[{"el":27,"sc":9,"sl":25},{"el":31,"sc":9,"sl":29}],"name":"Issue184.VO","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3014":{"methods":[{"sl":12},{"sl":25},{"sl":29}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":26},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [3014], [3014], [], [3014], [3014], [3014], [3014], [], [], [], [], [], [], [3014], [3014], [], [], [3014], [3014], [], [], [], []]
