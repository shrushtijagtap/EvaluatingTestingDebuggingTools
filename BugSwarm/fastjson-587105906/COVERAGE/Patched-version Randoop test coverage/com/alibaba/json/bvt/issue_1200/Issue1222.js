var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":60152,"methods":[{"el":17,"sc":5,"sl":12}],"name":"Issue1222","sl":11},{"el":21,"id":60157,"methods":[],"name":"Issue1222.Model","sl":19},{"el":29,"id":60157,"methods":[{"el":28,"sc":9,"sl":26}],"name":"Issue1222.Type","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4427":{"methods":[{"sl":12},{"sl":26}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":27}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [4427], [4427], [4427], [4427], [4427], [], [], [], [], [], [], [], [], [], [4427], [4427], [], [], []]
