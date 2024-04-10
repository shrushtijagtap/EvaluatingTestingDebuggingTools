var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":25,"id":83262,"methods":[{"el":14,"sc":5,"sl":11}],"name":"GenericTypeTest2","sl":9},{"el":17,"id":83265,"methods":[],"name":"GenericTypeTest2.MyResultResult","sl":16},{"el":24,"id":83265,"methods":[{"el":23,"sc":9,"sl":21}],"name":"GenericTypeTest2.BaseResult","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1632":{"methods":[{"sl":11},{"sl":21}],"name":"test_gerneric","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [1632], [1632], [1632], [], [], [], [], [], [], [], [1632], [1632], [], [], []]
