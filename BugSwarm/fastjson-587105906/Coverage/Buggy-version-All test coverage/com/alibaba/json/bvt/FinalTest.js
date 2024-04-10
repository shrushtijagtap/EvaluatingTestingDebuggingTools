var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":43145,"methods":[{"el":16,"sc":5,"sl":10}],"name":"FinalTest","sl":9},{"el":22,"id":43151,"methods":[],"name":"FinalTest.VO","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_485":{"methods":[{"sl":10}],"name":"test_final","pass":false,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [485], [485], [485], [485], [485], [], [], [], [], [], [], [], [], []]
