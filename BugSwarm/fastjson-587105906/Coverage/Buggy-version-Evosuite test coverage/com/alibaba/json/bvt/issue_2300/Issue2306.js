var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":16,"id":65281,"methods":[{"el":15,"sc":5,"sl":8}],"name":"Issue2306","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4488":{"methods":[{"sl":8}],"name":"test_for_issue","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":12}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [4488], [4488], [4488], [], [4488], [], [], [], []]
