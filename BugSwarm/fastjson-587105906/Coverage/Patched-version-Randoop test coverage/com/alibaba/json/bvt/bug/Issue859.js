var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":57314,"methods":[{"el":22,"sc":5,"sl":20},{"el":36,"sc":5,"sl":24}],"name":"Issue859","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4213":{"methods":[{"sl":24}],"name":"test_for_issue","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":34},{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4213], [4213], [4213], [4213], [4213], [4213], [4213], [], [], [], [4213], [4213], [], []]
