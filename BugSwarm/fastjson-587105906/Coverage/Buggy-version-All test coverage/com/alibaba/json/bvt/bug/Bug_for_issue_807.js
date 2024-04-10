var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":54141,"methods":[{"el":23,"sc":5,"sl":13}],"name":"Bug_for_issue_807","sl":12},{"el":30,"id":54148,"methods":[],"name":"Bug_for_issue_807.Root","sl":25},{"el":42,"id":54148,"methods":[],"name":"Bug_for_issue_807.WechatUserInfo","sl":32}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2111":{"methods":[{"sl":13}],"name":"test_for_issue","pass":false,"statements":[{"sl":14},{"sl":16}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [2111], [2111], [], [2111], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
