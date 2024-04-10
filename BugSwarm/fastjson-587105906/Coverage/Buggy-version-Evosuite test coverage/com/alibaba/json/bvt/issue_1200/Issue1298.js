var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":60647,"methods":[{"el":19,"sc":5,"sl":16},{"el":29,"sc":5,"sl":21},{"el":41,"sc":5,"sl":31}],"name":"Issue1298","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2748":{"methods":[{"sl":31}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":32},{"sl":34},{"sl":36},{"sl":38},{"sl":40}]},"test_4125":{"methods":[{"sl":21}],"name":"test_for_issue","pass":true,"statements":[{"sl":22},{"sl":24},{"sl":26},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4125], [4125], [], [4125], [], [4125], [], [4125], [], [], [2748], [2748], [], [2748], [], [2748], [], [2748], [], [2748], [], []]
