var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":47,"id":64208,"methods":[{"el":22,"sc":5,"sl":13}],"name":"Issue1871","sl":12},{"el":46,"id":64216,"methods":[{"el":33,"sc":9,"sl":31},{"el":37,"sc":9,"sl":35},{"el":41,"sc":9,"sl":39},{"el":45,"sc":9,"sl":43}],"name":"Issue1871.UnwrapClass","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3955":{"methods":[{"sl":13},{"sl":31},{"sl":39}],"name":"test_for_issue","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":20},{"sl":21},{"sl":32},{"sl":40}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [3955], [3955], [3955], [3955], [3955], [3955], [], [3955], [3955], [], [], [], [], [], [], [], [], [], [3955], [3955], [], [], [], [], [], [], [3955], [3955], [], [], [], [], [], [], []]
