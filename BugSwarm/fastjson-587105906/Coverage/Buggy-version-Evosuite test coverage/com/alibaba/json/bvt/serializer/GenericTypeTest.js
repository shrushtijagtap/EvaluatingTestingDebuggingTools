var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":22,"id":83259,"methods":[{"el":14,"sc":5,"sl":11}],"name":"GenericTypeTest","sl":9},{"el":17,"id":83262,"methods":[],"name":"GenericTypeTest.MyResultResult","sl":16},{"el":21,"id":83262,"methods":[],"name":"GenericTypeTest.BaseResult","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_850":{"methods":[{"sl":11}],"name":"test_gerneric","pass":true,"statements":[{"sl":12},{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [850], [850], [850], [], [], [], [], [], [], [], [], []]
