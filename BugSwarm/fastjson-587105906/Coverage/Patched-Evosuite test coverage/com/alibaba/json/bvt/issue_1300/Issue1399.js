var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":33,"id":60000,"methods":[{"el":20,"sc":5,"sl":10},{"el":32,"sc":5,"sl":22}],"name":"Issue1399","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_299":{"methods":[{"sl":22}],"name":"test_for_issue_true","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":30},{"sl":31}]},"test_4456":{"methods":[{"sl":10}],"name":"test_for_issue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":18},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [4456], [4456], [4456], [4456], [4456], [], [], [], [4456], [4456], [], [], [299], [299], [299], [299], [299], [], [], [], [299], [299], [], []]
