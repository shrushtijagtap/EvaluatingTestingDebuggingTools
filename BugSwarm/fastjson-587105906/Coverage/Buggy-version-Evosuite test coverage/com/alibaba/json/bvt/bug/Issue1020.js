var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":27,"id":56325,"methods":[{"el":16,"sc":5,"sl":12},{"el":22,"sc":5,"sl":18}],"name":"Issue1020","sl":11},{"el":26,"id":56331,"methods":[],"name":"Issue1020.Vo","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2685":{"methods":[{"sl":18}],"name":"test_empty","pass":true,"statements":[{"sl":19},{"sl":20}]},"test_4455":{"methods":[{"sl":12}],"name":"test_null","pass":true,"statements":[{"sl":13},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [4455], [4455], [4455], [], [], [], [2685], [2685], [2685], [], [], [], [], [], [], []]
