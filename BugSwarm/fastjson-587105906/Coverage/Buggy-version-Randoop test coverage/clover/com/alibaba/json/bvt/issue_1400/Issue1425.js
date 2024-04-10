var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":61289,"methods":[{"el":20,"sc":5,"sl":8}],"name":"Issue1425","sl":7},{"el":42,"id":61295,"methods":[{"el":29,"sc":9,"sl":27},{"el":33,"sc":9,"sl":31},{"el":37,"sc":9,"sl":35},{"el":41,"sc":9,"sl":39}],"name":"Issue1425.DicDomain","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3769":{"methods":[{"sl":8},{"sl":27},{"sl":31},{"sl":35},{"sl":39}],"name":"test_for_issue","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":11},{"sl":13},{"sl":19},{"sl":28},{"sl":32},{"sl":36},{"sl":40}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [3769], [3769], [3769], [3769], [], [3769], [], [], [], [], [], [3769], [], [], [], [], [], [], [], [3769], [3769], [], [], [3769], [3769], [], [], [3769], [3769], [], [], [3769], [3769], [], [], [], [], []]
