var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":64351,"methods":[{"el":13,"sc":5,"sl":11}],"name":"Issue2066","sl":8},{"el":25,"id":64353,"methods":[{"el":20,"sc":9,"sl":18},{"el":24,"sc":9,"sl":22}],"name":"Issue2066.Model","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_866":{"methods":[{"sl":11},{"sl":22}],"name":"test_issue","pass":true,"statements":[{"sl":12},{"sl":23}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [866], [866], [], [], [], [], [], [], [], [], [], [866], [866], [], [], []]
