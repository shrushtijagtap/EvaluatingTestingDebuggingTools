var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":56463,"methods":[{"el":18,"sc":5,"sl":10},{"el":28,"sc":5,"sl":20}],"name":"Issue939","sl":9},{"el":33,"id":56471,"methods":[],"name":"Issue939.Model","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3822":{"methods":[{"sl":10}],"name":"test_for_issue_false","pass":false,"statements":[{"sl":11},{"sl":16}]},"test_4597":{"methods":[{"sl":20}],"name":"test_for_issue_true","pass":false,"statements":[{"sl":21},{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [3822], [3822], [], [], [], [], [3822], [], [], [], [4597], [4597], [], [], [], [], [4597], [], [], [], [], [], [], [], []]
