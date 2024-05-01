var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":44500,"methods":[{"el":13,"sc":5,"sl":7}],"name":"MethodDelegationCheckedExceptionTest","sl":5},{"el":25,"id":44502,"methods":[{"el":20,"sc":9,"sl":18},{"el":24,"sc":9,"sl":22}],"name":"MethodDelegationCheckedExceptionTest.Foo","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_5021":{"methods":[{"sl":7},{"sl":18}],"name":"testUndeclaredCheckedException","pass":true,"statements":[{"sl":9},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [5021], [], [5021], [], [], [], [], [], [], [], [], [5021], [5021], [], [], [], [], [], [], []]
