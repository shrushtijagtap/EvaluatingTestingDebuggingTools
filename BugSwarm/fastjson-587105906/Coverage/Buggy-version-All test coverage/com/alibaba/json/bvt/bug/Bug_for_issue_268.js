var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":65,"id":53263,"methods":[{"el":24,"sc":5,"sl":14},{"el":36,"sc":5,"sl":26}],"name":"Bug_for_issue_268","sl":12},{"el":50,"id":53279,"methods":[{"el":44,"sc":9,"sl":42},{"el":48,"sc":9,"sl":46}],"name":"Bug_for_issue_268.VO","sl":38},{"el":64,"id":53283,"methods":[{"el":58,"sc":9,"sl":56},{"el":62,"sc":9,"sl":60}],"name":"Bug_for_issue_268.V1","sl":52}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3180":{"methods":[{"sl":26},{"sl":42},{"sl":46}],"name":"test_for_issue_private","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":30},{"sl":31},{"sl":33},{"sl":34},{"sl":35},{"sl":43},{"sl":47}]},"test_707":{"methods":[{"sl":14},{"sl":56},{"sl":60}],"name":"test_for_issue","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":18},{"sl":19},{"sl":21},{"sl":22},{"sl":23},{"sl":57},{"sl":61}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [707], [707], [707], [], [707], [707], [], [707], [707], [707], [], [], [3180], [3180], [3180], [], [3180], [3180], [], [3180], [3180], [3180], [], [], [], [], [], [], [3180], [3180], [], [], [3180], [3180], [], [], [], [], [], [], [], [], [707], [707], [], [], [707], [707], [], [], [], []]
