var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":73550,"methods":[{"el":15,"sc":5,"sl":10}],"name":"DupTest","sl":9},{"el":19,"id":73554,"methods":[],"name":"DupTest.Model","sl":17}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2672":{"methods":[{"sl":10}],"name":"test_dup","pass":false,"statements":[{"sl":11},{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [2672], [2672], [], [2672], [], [], [], [], [], [], []]
