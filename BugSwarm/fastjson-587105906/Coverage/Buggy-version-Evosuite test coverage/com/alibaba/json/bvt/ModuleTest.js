var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":57,"id":45574,"methods":[{"el":18,"sc":5,"sl":12},{"el":26,"sc":5,"sl":20}],"name":"ModuleTest","sl":11},{"el":30,"id":45584,"methods":[],"name":"ModuleTest.A","sl":28},{"el":43,"id":45584,"methods":[{"el":37,"sc":9,"sl":34},{"el":42,"sc":9,"sl":39}],"name":"ModuleTest.MyModuel","sl":32},{"el":56,"id":45588,"methods":[{"el":50,"sc":9,"sl":47},{"el":55,"sc":9,"sl":52}],"name":"ModuleTest.MyModuel2","sl":45}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3320":{"methods":[{"sl":20},{"sl":39},{"sl":52}],"name":"test_for_module_1","pass":true,"statements":[{"sl":21},{"sl":22},{"sl":23},{"sl":25},{"sl":41},{"sl":54}]},"test_667":{"methods":[{"sl":12},{"sl":34},{"sl":47}],"name":"test_for_module","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":17},{"sl":36},{"sl":49}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [667], [667], [667], [667], [], [667], [], [], [3320], [3320], [3320], [3320], [], [3320], [], [], [], [], [], [], [], [], [667], [], [667], [], [], [3320], [], [3320], [], [], [], [], [], [667], [], [667], [], [], [3320], [], [3320], [], [], []]
