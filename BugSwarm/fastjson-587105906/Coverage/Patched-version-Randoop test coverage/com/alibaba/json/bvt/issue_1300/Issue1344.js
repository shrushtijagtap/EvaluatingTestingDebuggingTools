var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":60917,"methods":[{"el":18,"sc":5,"sl":11}],"name":"Issue1344","sl":10},{"el":31,"id":60924,"methods":[{"el":25,"sc":9,"sl":22},{"el":29,"sc":9,"sl":27}],"name":"Issue1344.TestException","sl":20}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_88":{"methods":[{"sl":11},{"sl":27}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [88], [88], [88], [88], [88], [88], [88], [], [], [], [], [], [], [], [], [], [88], [88], [], [], [], []]
