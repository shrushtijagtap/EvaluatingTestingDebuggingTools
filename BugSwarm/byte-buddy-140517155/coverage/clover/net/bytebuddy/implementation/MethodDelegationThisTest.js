var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":36,"id":45428,"methods":[{"el":17,"sc":5,"sl":12}],"name":"MethodDelegationThisTest","sl":10},{"el":24,"id":45432,"methods":[{"el":23,"sc":9,"sl":21}],"name":"MethodDelegationThisTest.Foo","sl":19},{"el":35,"id":45434,"methods":[{"el":30,"sc":9,"sl":28},{"el":34,"sc":9,"sl":32}],"name":"MethodDelegationThisTest.Bar","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1518":{"methods":[{"sl":12},{"sl":28}],"name":"testThis","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":29}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [1518], [], [1518], [1518], [1518], [], [], [], [], [], [], [], [], [], [], [], [1518], [1518], [], [], [], [], [], [], []]
