var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":91513,"methods":[{"el":21,"sc":5,"sl":13}],"name":"TypeReferenceTest5","sl":11},{"el":35,"id":91518,"methods":[{"el":29,"sc":9,"sl":27},{"el":33,"sc":9,"sl":31}],"name":"TypeReferenceTest5.A","sl":23},{"el":41,"id":91522,"methods":[],"name":"TypeReferenceTest5.B","sl":37}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3842":{"methods":[{"sl":13},{"sl":27},{"sl":31}],"name":"test_typeRef","pass":true,"statements":[{"sl":14},{"sl":17},{"sl":19},{"sl":20},{"sl":28},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [3842], [3842], [], [], [3842], [], [3842], [3842], [], [], [], [], [], [], [3842], [3842], [], [], [3842], [3842], [], [], [], [], [], [], [], [], [], []]
