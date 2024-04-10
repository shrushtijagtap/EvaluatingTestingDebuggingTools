var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":18,"id":61307,"methods":[{"el":13,"sc":5,"sl":9}],"name":"Issue1443","sl":8},{"el":17,"id":61310,"methods":[],"name":"Issue1443.Model","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4197":{"methods":[{"sl":9}],"name":"test_for_issue","pass":true,"statements":[{"sl":10},{"sl":11}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [4197], [4197], [4197], [], [], [], [], [], [], []]
