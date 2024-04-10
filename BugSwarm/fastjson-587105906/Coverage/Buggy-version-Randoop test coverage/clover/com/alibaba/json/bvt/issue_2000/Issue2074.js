var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":15,"id":64364,"methods":[{"el":14,"sc":5,"sl":8}],"name":"Issue2074","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2440":{"methods":[{"sl":8}],"name":"test_for_issue","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":12}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [2440], [2440], [2440], [], [2440], [], [], []]
