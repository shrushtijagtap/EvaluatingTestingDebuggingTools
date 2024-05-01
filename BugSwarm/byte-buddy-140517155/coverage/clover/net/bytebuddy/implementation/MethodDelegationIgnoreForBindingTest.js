var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":39,"id":44839,"methods":[{"el":19,"sc":5,"sl":14}],"name":"MethodDelegationIgnoreForBindingTest","sl":10},{"el":26,"id":44843,"methods":[{"el":25,"sc":9,"sl":23}],"name":"MethodDelegationIgnoreForBindingTest.Foo","sl":21},{"el":38,"id":44845,"methods":[{"el":32,"sc":9,"sl":30},{"el":37,"sc":9,"sl":34}],"name":"MethodDelegationIgnoreForBindingTest.Bar","sl":28}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_5113":{"methods":[{"sl":14},{"sl":30}],"name":"testIgnoreForBinding","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":31}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [5113], [], [5113], [5113], [5113], [], [], [], [], [], [], [], [], [], [], [], [5113], [5113], [], [], [], [], [], [], [], []]
