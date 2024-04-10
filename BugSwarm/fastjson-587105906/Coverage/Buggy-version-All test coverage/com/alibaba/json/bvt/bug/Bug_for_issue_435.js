var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":24,"id":53691,"methods":[{"el":11,"sc":5,"sl":9},{"el":15,"sc":5,"sl":13}],"name":"Bug_for_issue_435","sl":7},{"el":19,"id":53695,"methods":[],"name":"Bug_for_issue_435.Model","sl":17},{"el":23,"id":53695,"methods":[],"name":"Bug_for_issue_435.ModelFloat","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2830":{"methods":[{"sl":13}],"name":"test_for_issue_Float","pass":true,"statements":[{"sl":14}]},"test_4481":{"methods":[{"sl":9}],"name":"test_for_issue","pass":true,"statements":[{"sl":10}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [4481], [4481], [], [], [2830], [2830], [], [], [], [], [], [], [], [], [], []]
