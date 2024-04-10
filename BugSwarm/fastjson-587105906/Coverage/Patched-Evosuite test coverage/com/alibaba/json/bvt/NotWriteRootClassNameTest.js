var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":24,"id":45588,"methods":[{"el":15,"sc":5,"sl":11}],"name":"NotWriteRootClassNameTest","sl":10},{"el":19,"id":45592,"methods":[],"name":"NotWriteRootClassNameTest.VO","sl":17},{"el":23,"id":45592,"methods":[],"name":"NotWriteRootClassNameTest.V1","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_499":{"methods":[{"sl":11}],"name":"test_NotWriteRootClassName","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [499], [499], [499], [499], [], [], [], [], [], [], [], [], [], []]
