var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":58190,"methods":[{"el":19,"sc":5,"sl":10}],"name":"Bug_for_weiqiang","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3922":{"methods":[{"sl":10}],"name":"test_for_bug","pass":false,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [3922], [3922], [3922], [3922], [3922], [], [], [], [], [], []]
