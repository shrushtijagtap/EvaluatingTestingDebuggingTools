var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":51,"id":53638,"methods":[{"el":15,"sc":5,"sl":11},{"el":21,"sc":5,"sl":17},{"el":27,"sc":5,"sl":23},{"el":34,"sc":5,"sl":30}],"name":"Bug_for_issue_426","sl":9},{"el":38,"id":53654,"methods":[],"name":"Bug_for_issue_426.Model","sl":36},{"el":42,"id":53654,"methods":[],"name":"Bug_for_issue_426.ModelFloat","sl":40},{"el":46,"id":53654,"methods":[],"name":"Bug_for_issue_426.ModelInt","sl":44},{"el":50,"id":53654,"methods":[],"name":"Bug_for_issue_426.ModelLong","sl":48}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1977":{"methods":[{"sl":30}],"name":"test_for_issue_long","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33}]},"test_2205":{"methods":[{"sl":17}],"name":"test_for_issue_float","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20}]},"test_2753":{"methods":[{"sl":23}],"name":"test_for_issue_int","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26}]},"test_4289":{"methods":[{"sl":11}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [4289], [4289], [4289], [4289], [], [], [2205], [2205], [2205], [2205], [], [], [2753], [2753], [2753], [2753], [], [], [], [1977], [1977], [1977], [1977], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
