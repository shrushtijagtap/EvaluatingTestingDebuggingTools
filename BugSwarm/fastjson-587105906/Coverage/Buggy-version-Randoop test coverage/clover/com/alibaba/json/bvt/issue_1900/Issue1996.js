var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":64306,"methods":[{"el":31,"sc":5,"sl":7}],"name":"Issue1996","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3849":{"methods":[{"sl":7}],"name":"test_for_issue","pass":true,"statements":[{"sl":8},{"sl":10},{"sl":11},{"sl":13},{"sl":14},{"sl":15},{"sl":18},{"sl":21},{"sl":22},{"sl":24},{"sl":25},{"sl":27},{"sl":28},{"sl":29}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [3849], [3849], [], [3849], [3849], [], [3849], [3849], [3849], [], [], [3849], [], [], [3849], [3849], [], [3849], [3849], [], [3849], [3849], [3849], [], [], []]
