var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":21,"id":56648,"methods":[{"el":20,"sc":5,"sl":10}],"name":"Issue177","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2504":{"methods":[{"sl":10}],"name":"test_for_issue_177","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":14},{"sl":15},{"sl":17},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [2504], [2504], [2504], [], [2504], [2504], [], [2504], [], [2504], [], []]
