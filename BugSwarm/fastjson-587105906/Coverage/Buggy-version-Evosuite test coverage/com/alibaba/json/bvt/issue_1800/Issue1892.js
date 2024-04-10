var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":24,"id":64242,"methods":[{"el":16,"sc":5,"sl":10},{"el":23,"sc":5,"sl":18}],"name":"Issue1892","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2099":{"methods":[{"sl":18}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":19},{"sl":22}]},"test_2531":{"methods":[{"sl":10}],"name":"test_for_issue","pass":true,"statements":[{"sl":11}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [2531], [2531], [], [], [], [], [], [], [2099], [2099], [], [], [2099], [], []]
