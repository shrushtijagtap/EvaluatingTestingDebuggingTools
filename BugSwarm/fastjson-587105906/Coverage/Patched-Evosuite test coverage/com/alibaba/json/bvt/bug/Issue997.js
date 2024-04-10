var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":22,"id":56694,"methods":[{"el":17,"sc":5,"sl":11}],"name":"Issue997","sl":10},{"el":21,"id":56698,"methods":[],"name":"Issue997.Model","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1018":{"methods":[{"sl":11}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [1018], [], [1018], [1018], [1018], [], [], [], [], [], [], []]
