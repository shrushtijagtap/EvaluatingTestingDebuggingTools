var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":63,"id":27733,"methods":[{"el":19,"sc":5,"sl":16},{"el":24,"sc":5,"sl":21},{"el":34,"sc":5,"sl":26},{"el":39,"sc":5,"sl":36},{"el":44,"sc":5,"sl":41},{"el":56,"sc":13,"sl":53},{"el":58,"sc":5,"sl":46}],"name":"ClassFileVersionTest","sl":14},{"el":62,"id":27756,"methods":[],"name":"ClassFileVersionTest.Foo","sl":60}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1914":{"methods":[{"sl":16}],"name":"testExplicitConstructionOfUnknownVersion","pass":true,"statements":[{"sl":18}]},"test_2927":{"methods":[{"sl":36}],"name":"testVersionPropertyAction","pass":true,"statements":[{"sl":38}]},"test_3181":{"methods":[{"sl":21}],"name":"testIllegalVersion","pass":true,"statements":[{"sl":23}]},"test_4121":{"methods":[{"sl":26}],"name":"testComparison","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33}]},"test_4611":{"methods":[{"sl":46},{"sl":53}],"name":"testObjectProperties","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":55}]},"test_4635":{"methods":[{"sl":41}],"name":"testVersionOfClass","pass":true,"statements":[{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1914], [], [1914], [], [], [3181], [], [3181], [], [], [4121], [], [4121], [4121], [4121], [4121], [4121], [4121], [], [], [2927], [], [2927], [], [], [4635], [], [4635], [], [], [4611], [], [4611], [4611], [4611], [4611], [4611], [4611], [], [4611], [], [], [], [], [], [], [], []]
