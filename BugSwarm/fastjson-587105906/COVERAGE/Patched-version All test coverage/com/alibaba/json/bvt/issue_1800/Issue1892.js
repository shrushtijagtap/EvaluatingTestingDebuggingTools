var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":24,"id":64231,"methods":[{"el":16,"sc":5,"sl":10},{"el":23,"sc":5,"sl":18}],"name":"Issue1892","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3247":{"methods":[{"sl":10}],"name":"test_for_issue","pass":true,"statements":[{"sl":11}]},"test_3544":{"methods":[{"sl":18}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":19},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [3247], [3247], [], [], [], [], [], [], [3544], [3544], [], [], [3544], [], []]
