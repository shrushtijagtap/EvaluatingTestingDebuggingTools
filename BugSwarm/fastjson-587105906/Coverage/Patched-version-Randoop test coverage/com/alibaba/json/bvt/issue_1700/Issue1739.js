var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":63755,"methods":[{"el":15,"sc":5,"sl":9},{"el":23,"sc":5,"sl":17}],"name":"Issue1739","sl":8},{"el":36,"id":63765,"methods":[{"el":31,"sc":9,"sl":28},{"el":35,"sc":9,"sl":33}],"name":"Issue1739.M0","sl":25},{"el":49,"id":63769,"methods":[{"el":44,"sc":9,"sl":41},{"el":48,"sc":9,"sl":46}],"name":"Issue1739.M1","sl":38}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1692":{"methods":[{"sl":17}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":21},{"sl":22}]},"test_3017":{"methods":[{"sl":9},{"sl":28}],"name":"test_for_issue","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":13},{"sl":14},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [3017], [3017], [3017], [], [3017], [3017], [], [], [1692], [1692], [1692], [], [1692], [1692], [], [], [], [], [], [3017], [], [3017], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
