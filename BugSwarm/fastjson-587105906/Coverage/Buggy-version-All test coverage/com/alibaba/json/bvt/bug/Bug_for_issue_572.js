var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":54030,"methods":[{"el":19,"sc":5,"sl":12}],"name":"Bug_for_issue_572","sl":10},{"el":42,"id":54036,"methods":[{"el":28,"sc":9,"sl":26},{"el":32,"sc":9,"sl":30},{"el":36,"sc":9,"sl":34},{"el":40,"sc":9,"sl":38}],"name":"Bug_for_issue_572.Model","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1989":{"methods":[{"sl":12},{"sl":26},{"sl":34}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":17},{"sl":18},{"sl":27},{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [1989], [1989], [1989], [1989], [], [1989], [1989], [], [], [], [], [], [], [], [1989], [1989], [], [], [], [], [], [], [1989], [1989], [], [], [], [], [], [], [], []]
