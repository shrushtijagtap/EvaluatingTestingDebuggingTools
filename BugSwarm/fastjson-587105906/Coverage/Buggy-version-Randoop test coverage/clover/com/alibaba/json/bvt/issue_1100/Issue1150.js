var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":33,"id":59990,"methods":[{"el":15,"sc":5,"sl":12},{"el":20,"sc":5,"sl":17}],"name":"Issue1150","sl":11},{"el":24,"id":59996,"methods":[],"name":"Issue1150.Model","sl":22},{"el":28,"id":59996,"methods":[],"name":"Issue1150.Model2","sl":26},{"el":32,"id":59996,"methods":[],"name":"Issue1150.Item","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2394":{"methods":[{"sl":17}],"name":"test_for_issue_array","pass":true,"statements":[{"sl":18},{"sl":19}]},"test_967":{"methods":[{"sl":12}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [967], [967], [967], [], [], [2394], [2394], [2394], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
