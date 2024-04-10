var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":54,"id":54148,"methods":[{"el":17,"sc":5,"sl":13},{"el":22,"sc":5,"sl":19}],"name":"Bug_for_issue_937","sl":11},{"el":41,"id":54154,"methods":[{"el":29,"sc":9,"sl":27},{"el":33,"sc":9,"sl":31},{"el":36,"sc":9,"sl":35},{"el":40,"sc":9,"sl":38}],"name":"Bug_for_issue_937.Out","sl":24},{"el":53,"id":54161,"methods":[{"el":48,"sc":9,"sl":46},{"el":52,"sc":9,"sl":50}],"name":"Bug_for_issue_937.Info","sl":43}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2789":{"methods":[{"sl":13},{"sl":19},{"sl":27},{"sl":31},{"sl":35},{"sl":46},{"sl":50}],"name":"test_for_issue","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":20},{"sl":28},{"sl":32},{"sl":47},{"sl":51}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [2789], [2789], [2789], [2789], [], [], [2789], [2789], [], [], [], [], [], [], [2789], [2789], [], [], [2789], [2789], [], [], [2789], [], [], [], [], [], [], [], [], [], [], [2789], [2789], [], [], [2789], [2789], [], [], []]
