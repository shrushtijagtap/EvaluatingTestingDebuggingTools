var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":59404,"methods":[{"el":19,"sc":5,"sl":16},{"el":29,"sc":5,"sl":21},{"el":41,"sc":5,"sl":31}],"name":"Issue1298","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1674":{"methods":[{"sl":31}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":32},{"sl":34},{"sl":36},{"sl":38},{"sl":40}]},"test_3567":{"methods":[{"sl":21}],"name":"test_for_issue","pass":true,"statements":[{"sl":22},{"sl":24},{"sl":26},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3567], [3567], [], [3567], [], [3567], [], [3567], [], [], [1674], [1674], [], [1674], [], [1674], [], [1674], [], [1674], [], []]
