var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":70,"id":44458,"methods":[{"el":24,"sc":5,"sl":19},{"el":36,"sc":5,"sl":26}],"name":"MethodDelegationArgumentTest","sl":13},{"el":43,"id":44464,"methods":[{"el":42,"sc":9,"sl":40}],"name":"MethodDelegationArgumentTest.Foo","sl":38},{"el":54,"id":44466,"methods":[{"el":49,"sc":9,"sl":47},{"el":53,"sc":9,"sl":51}],"name":"MethodDelegationArgumentTest.Bar","sl":45},{"el":61,"id":44470,"methods":[{"el":60,"sc":9,"sl":58}],"name":"MethodDelegationArgumentTest.Baz","sl":56},{"el":69,"id":44471,"methods":[{"el":68,"sc":9,"sl":65}],"name":"MethodDelegationArgumentTest.Qux","sl":63}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3014":{"methods":[{"sl":19},{"sl":47}],"name":"testArgument","pass":true,"statements":[{"sl":21},{"sl":22},{"sl":23},{"sl":48}]},"test_3569":{"methods":[{"sl":26}],"name":"testHierarchyDelegation","pass":true,"statements":[{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3014], [], [3014], [3014], [3014], [], [], [3569], [], [3569], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3014], [3014], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
