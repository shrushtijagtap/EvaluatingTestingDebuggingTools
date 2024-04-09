var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":18,"id":56617,"methods":[{"el":13,"sc":5,"sl":11}],"name":"Issue190","sl":9},{"el":17,"id":56619,"methods":[],"name":"Issue190.WebSoscketCommand","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_883":{"methods":[{"sl":11}],"name":"test_for_issue","pass":true,"statements":[{"sl":12}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [883], [883], [], [], [], [], [], []]
