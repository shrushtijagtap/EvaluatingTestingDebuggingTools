var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":41,"id":44473,"methods":[{"el":21,"sc":5,"sl":16}],"name":"MethodDelegationBindingPriorityTest","sl":10},{"el":28,"id":44477,"methods":[{"el":27,"sc":9,"sl":25}],"name":"MethodDelegationBindingPriorityTest.Foo","sl":23},{"el":40,"id":44479,"methods":[{"el":35,"sc":9,"sl":32},{"el":39,"sc":9,"sl":37}],"name":"MethodDelegationBindingPriorityTest.Bar","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_624":{"methods":[{"sl":16},{"sl":32}],"name":"testBindingPriority","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20},{"sl":34}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [624], [], [624], [624], [624], [], [], [], [], [], [], [], [], [], [], [], [624], [], [624], [], [], [], [], [], [], []]
