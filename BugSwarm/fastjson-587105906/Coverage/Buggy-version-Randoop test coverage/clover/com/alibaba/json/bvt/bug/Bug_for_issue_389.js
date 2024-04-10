var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":62,"id":53452,"methods":[{"el":23,"sc":5,"sl":14},{"el":34,"sc":5,"sl":25}],"name":"Bug_for_issue_389","sl":12},{"el":57,"id":53466,"methods":[{"el":43,"sc":9,"sl":41},{"el":47,"sc":9,"sl":45},{"el":51,"sc":9,"sl":49},{"el":55,"sc":9,"sl":53}],"name":"Bug_for_issue_389.User","sl":36},{"el":61,"id":53474,"methods":[],"name":"Bug_for_issue_389.Def","sl":59}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_352":{"methods":[{"sl":25},{"sl":41},{"sl":49}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":28},{"sl":30},{"sl":32},{"sl":33},{"sl":42},{"sl":50}]},"test_4198":{"methods":[{"sl":14},{"sl":41},{"sl":49}],"name":"test_for_issue","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":19},{"sl":21},{"sl":22},{"sl":42},{"sl":50}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [4198], [4198], [4198], [4198], [], [4198], [], [4198], [4198], [], [], [352], [352], [352], [352], [], [352], [], [352], [352], [], [], [], [], [], [], [], [352, 4198], [352, 4198], [], [], [], [], [], [], [352, 4198], [352, 4198], [], [], [], [], [], [], [], [], [], [], [], []]
