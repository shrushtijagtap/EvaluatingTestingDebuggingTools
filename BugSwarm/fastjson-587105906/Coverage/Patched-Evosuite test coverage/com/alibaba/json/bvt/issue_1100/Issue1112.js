var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":58793,"methods":[{"el":16,"sc":5,"sl":11},{"el":23,"sc":5,"sl":18},{"el":31,"sc":5,"sl":26}],"name":"Issue1112","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3909":{"methods":[{"sl":18}],"name":"test_for_issue_2","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":22}]},"test_4366":{"methods":[{"sl":26}],"name":"test_for_issue_3","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":30}]},"test_4695":{"methods":[{"sl":11}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [4695], [4695], [4695], [], [4695], [], [], [3909], [3909], [3909], [], [3909], [], [], [], [4366], [4366], [4366], [], [4366], [], []]
