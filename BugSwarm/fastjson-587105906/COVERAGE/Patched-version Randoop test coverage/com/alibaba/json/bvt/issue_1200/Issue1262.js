var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":24,"id":60346,"methods":[{"el":15,"sc":5,"sl":13}],"name":"Issue1262","sl":12},{"el":19,"id":60348,"methods":[],"name":"Issue1262.Model","sl":17},{"el":23,"id":60348,"methods":[],"name":"Issue1262.Chatter","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3712":{"methods":[{"sl":13}],"name":"test_for_issue","pass":true,"statements":[{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [3712], [3712], [], [], [], [], [], [], [], [], [], []]
