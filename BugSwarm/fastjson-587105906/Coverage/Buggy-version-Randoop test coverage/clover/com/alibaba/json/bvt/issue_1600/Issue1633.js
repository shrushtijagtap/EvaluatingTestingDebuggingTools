var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":63301,"methods":[{"el":13,"sc":5,"sl":9},{"el":19,"sc":5,"sl":15}],"name":"Issue1633","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2525":{"methods":[{"sl":9}],"name":"test_for_issue_int","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12}]},"test_3224":{"methods":[{"sl":15}],"name":"test_for_issue_bool","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [2525], [2525], [2525], [2525], [], [], [3224], [3224], [3224], [3224], [], []]
