var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":48,"id":32932,"methods":[{"el":14,"sc":5,"sl":11},{"el":19,"sc":5,"sl":16}],"name":"AnnotationDescriptionAbstractPreparedExceptionTest","sl":9},{"el":47,"id":32936,"methods":[{"el":26,"sc":9,"sl":23},{"el":31,"sc":9,"sl":28},{"el":36,"sc":9,"sl":33},{"el":41,"sc":9,"sl":38},{"el":46,"sc":9,"sl":43}],"name":"AnnotationDescriptionAbstractPreparedExceptionTest.PseudoDescription","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2083":{"methods":[{"sl":11},{"sl":23}],"name":"testThrowWithoutClassLoader","pass":true,"statements":[{"sl":13},{"sl":25}]},"test_3084":{"methods":[{"sl":16},{"sl":28}],"name":"testThrowWithClassLoader","pass":true,"statements":[{"sl":18},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [2083], [], [2083], [], [], [3084], [], [3084], [], [], [], [], [2083], [], [2083], [], [], [3084], [], [3084], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
