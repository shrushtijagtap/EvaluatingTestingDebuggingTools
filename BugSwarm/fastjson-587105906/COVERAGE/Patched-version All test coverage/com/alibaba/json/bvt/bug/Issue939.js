var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":57695,"methods":[{"el":18,"sc":5,"sl":10},{"el":28,"sc":5,"sl":20}],"name":"Issue939","sl":9},{"el":33,"id":57703,"methods":[],"name":"Issue939.Model","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4454":{"methods":[{"sl":20}],"name":"test_for_issue_true","pass":false,"statements":[{"sl":21},{"sl":26}]},"test_511":{"methods":[{"sl":10}],"name":"test_for_issue_false","pass":false,"statements":[{"sl":11},{"sl":16}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [511], [511], [], [], [], [], [511], [], [], [], [4454], [4454], [], [], [], [], [4454], [], [], [], [], [], [], [], []]
