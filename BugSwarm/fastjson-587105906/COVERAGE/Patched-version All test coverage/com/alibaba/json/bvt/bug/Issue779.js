var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":39,"id":57355,"methods":[{"el":21,"sc":5,"sl":11},{"el":33,"sc":5,"sl":23}],"name":"Issue779","sl":10},{"el":38,"id":57369,"methods":[],"name":"Issue779.Model","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4047":{"methods":[{"sl":11}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":17},{"sl":20}]},"test_4205":{"methods":[{"sl":23}],"name":"test_for_issue_deser","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":29},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [4047], [4047], [4047], [4047], [4047], [], [4047], [], [], [4047], [], [], [4205], [4205], [4205], [4205], [4205], [], [4205], [], [], [4205], [], [], [], [], [], [], []]
