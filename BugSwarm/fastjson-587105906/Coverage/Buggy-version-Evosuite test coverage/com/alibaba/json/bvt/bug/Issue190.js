var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":18,"id":56743,"methods":[{"el":13,"sc":5,"sl":11}],"name":"Issue190","sl":9},{"el":17,"id":56745,"methods":[],"name":"Issue190.WebSoscketCommand","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2350":{"methods":[{"sl":11}],"name":"test_for_issue","pass":true,"statements":[{"sl":12}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [2350], [2350], [], [], [], [], [], []]
