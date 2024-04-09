var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":82822,"methods":[{"el":17,"sc":5,"sl":11}],"name":"DoubleFormatTest","sl":10},{"el":22,"id":82827,"methods":[],"name":"DoubleFormatTest.Model","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4399":{"methods":[{"sl":11}],"name":"test_format","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":15},{"sl":16}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [4399], [4399], [4399], [], [4399], [4399], [], [], [], [], [], [], []]
