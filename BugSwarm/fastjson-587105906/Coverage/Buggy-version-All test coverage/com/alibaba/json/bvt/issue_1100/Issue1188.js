var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":60198,"methods":[{"el":17,"sc":5,"sl":13}],"name":"Issue1188","sl":12},{"el":41,"id":60202,"methods":[{"el":27,"sc":9,"sl":25},{"el":31,"sc":9,"sl":29},{"el":35,"sc":9,"sl":33},{"el":39,"sc":9,"sl":37}],"name":"Issue1188.Info","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2715":{"methods":[{"sl":13}],"name":"test_for_issue_1188","pass":false,"statements":[{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [2715], [2715], [2715], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
