var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":31,"id":63409,"methods":[{"el":13,"sc":5,"sl":10},{"el":21,"sc":5,"sl":15}],"name":"Issue1660","sl":9},{"el":30,"id":63417,"methods":[{"el":29,"sc":9,"sl":27}],"name":"Issue1660.Model","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3833":{"methods":[{"sl":15},{"sl":27}],"name":"test_for_issue","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":19},{"sl":20},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3833], [3833], [3833], [], [3833], [3833], [], [], [], [], [], [], [3833], [3833], [], [], []]
