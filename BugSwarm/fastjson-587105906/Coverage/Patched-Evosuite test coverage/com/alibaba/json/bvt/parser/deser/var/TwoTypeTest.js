var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":77079,"methods":[{"el":11,"sc":5,"sl":9}],"name":"TwoTypeTest","sl":8},{"el":15,"id":77080,"methods":[],"name":"TwoTypeTest.ModelA","sl":13},{"el":19,"id":77080,"methods":[],"name":"TwoTypeTest.ModelB","sl":17}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4414":{"methods":[{"sl":9}],"name":"test_two","pass":true,"statements":[]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [4414], [], [], [], [], [], [], [], [], [], [], []]
