var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":28,"id":60021,"methods":[{"el":14,"sc":5,"sl":10}],"name":"Issue1089_private","sl":9},{"el":26,"id":60025,"methods":[{"el":21,"sc":9,"sl":19},{"el":25,"sc":9,"sl":23}],"name":"Issue1089_private.TestBean","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_707":{"methods":[{"sl":10},{"sl":19},{"sl":23}],"name":"test_for_issue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":20},{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [707], [707], [707], [707], [], [], [], [], [], [707], [707], [], [], [707], [707], [], [], [], []]
