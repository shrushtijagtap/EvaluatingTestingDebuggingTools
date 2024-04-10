var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":61025,"methods":[{"el":20,"sc":5,"sl":11}],"name":"Issue1369","sl":10},{"el":26,"id":61034,"methods":[],"name":"Issue1369.Foo","sl":22},{"el":29,"id":61034,"methods":[],"name":"Issue1369.Bar","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_696":{"methods":[{"sl":11}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [696], [696], [696], [696], [696], [696], [696], [696], [696], [], [], [], [], [], [], [], [], [], [], []]
