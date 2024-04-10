var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":65299,"methods":[{"el":23,"sc":5,"sl":9}],"name":"Issue2343","sl":8},{"el":34,"id":65311,"methods":[],"name":"Issue2343.A","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1987":{"methods":[{"sl":9}],"name":"test_for_issue","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [1987], [1987], [1987], [1987], [1987], [], [1987], [1987], [], [1987], [1987], [1987], [1987], [1987], [], [], [], [], [], [], [], [], [], [], [], [], []]
