var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":28,"id":60013,"methods":[{"el":14,"sc":5,"sl":10}],"name":"Issue1089","sl":9},{"el":26,"id":60017,"methods":[{"el":21,"sc":9,"sl":19},{"el":25,"sc":9,"sl":23}],"name":"Issue1089.TestBean","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3649":{"methods":[{"sl":10},{"sl":19},{"sl":23}],"name":"test_for_issue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":20},{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [3649], [3649], [3649], [3649], [], [], [], [], [], [3649], [3649], [], [], [3649], [3649], [], [], [], []]
