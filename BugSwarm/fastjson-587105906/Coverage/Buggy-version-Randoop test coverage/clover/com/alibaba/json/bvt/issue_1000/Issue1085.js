var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":28,"id":59879,"methods":[{"el":15,"sc":5,"sl":12}],"name":"Issue1085","sl":11},{"el":24,"id":59882,"methods":[{"el":23,"sc":9,"sl":20}],"name":"Issue1085.AbstractModel","sl":17},{"el":27,"id":59884,"methods":[],"name":"Issue1085.Model","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2319":{"methods":[{"sl":12},{"sl":20}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [2319], [2319], [2319], [], [], [], [], [], [2319], [], [2319], [], [], [], [], [], []]
