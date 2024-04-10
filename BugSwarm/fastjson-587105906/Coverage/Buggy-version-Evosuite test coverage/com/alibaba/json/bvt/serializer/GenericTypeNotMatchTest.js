var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":83245,"methods":[{"el":17,"sc":5,"sl":12}],"name":"GenericTypeNotMatchTest","sl":11},{"el":21,"id":83250,"methods":[],"name":"GenericTypeNotMatchTest.Model","sl":20},{"el":25,"id":83250,"methods":[],"name":"GenericTypeNotMatchTest.Base","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3688":{"methods":[{"sl":12}],"name":"test_for_notMatch","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":16}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [3688], [3688], [3688], [3688], [3688], [], [], [], [], [], [], [], [], [], []]
