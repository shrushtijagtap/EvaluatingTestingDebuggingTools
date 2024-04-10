var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":39,"id":63317,"methods":[{"el":12,"sc":5,"sl":9},{"el":17,"sc":5,"sl":14}],"name":"Issue1636","sl":8},{"el":28,"id":63323,"methods":[{"el":27,"sc":9,"sl":23}],"name":"Issue1636.Item1","sl":19},{"el":38,"id":63325,"methods":[{"el":37,"sc":9,"sl":33}],"name":"Issue1636.Item2","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1052":{"methods":[{"sl":9},{"sl":23}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":26}]},"test_3216":{"methods":[{"sl":14},{"sl":33}],"name":"test_for_issue_2","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [1052], [1052], [1052], [], [], [3216], [3216], [3216], [], [], [], [], [], [], [1052], [], [], [1052], [], [], [], [], [], [], [3216], [], [], [3216], [], [], []]
