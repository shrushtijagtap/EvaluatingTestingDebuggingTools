var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":61443,"methods":[{"el":19,"sc":5,"sl":9}],"name":"Issue1445","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2413":{"methods":[{"sl":9}],"name":"test_for_issue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":17},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [2413], [], [2413], [2413], [2413], [2413], [2413], [], [2413], [2413], [], []]
