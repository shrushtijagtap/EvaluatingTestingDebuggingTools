var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":28,"id":63907,"methods":[{"el":19,"sc":5,"sl":9}],"name":"Issue2289","sl":8},{"el":23,"id":63914,"methods":[],"name":"Issue2289.A","sl":21},{"el":27,"id":63914,"methods":[],"name":"Issue2289.B","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4102":{"methods":[{"sl":9}],"name":"test_for_issue","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":13},{"sl":15},{"sl":17},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [4102], [4102], [4102], [], [4102], [], [4102], [], [4102], [4102], [], [], [], [], [], [], [], [], [], []]
