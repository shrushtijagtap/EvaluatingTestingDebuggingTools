var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":59079,"methods":[{"el":24,"sc":5,"sl":9}],"name":"Issue1227","sl":8},{"el":29,"id":59089,"methods":[],"name":"Issue1227.Test","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3033":{"methods":[{"sl":9}],"name":"test_for_issue","pass":false,"statements":[{"sl":11},{"sl":13},{"sl":14},{"sl":21},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [3033], [], [3033], [], [3033], [3033], [], [], [], [], [], [], [3033], [3033], [], [], [], [], [], [], [], [], [], [], []]
