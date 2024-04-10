var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":24,"id":60479,"methods":[{"el":15,"sc":5,"sl":13}],"name":"Issue1262","sl":12},{"el":19,"id":60481,"methods":[],"name":"Issue1262.Model","sl":17},{"el":23,"id":60481,"methods":[],"name":"Issue1262.Chatter","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2680":{"methods":[{"sl":13}],"name":"test_for_issue","pass":true,"statements":[{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [2680], [2680], [], [], [], [], [], [], [], [], [], []]
