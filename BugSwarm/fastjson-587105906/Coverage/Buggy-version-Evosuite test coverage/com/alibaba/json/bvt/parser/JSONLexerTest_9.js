var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":69359,"methods":[{"el":11,"sc":5,"sl":9},{"el":15,"sc":5,"sl":13},{"el":19,"sc":5,"sl":17},{"el":23,"sc":5,"sl":21},{"el":27,"sc":5,"sl":25}],"name":"JSONLexerTest_9","sl":7},{"el":45,"id":69369,"methods":[{"el":33,"sc":9,"sl":31},{"el":39,"sc":9,"sl":37},{"el":43,"sc":9,"sl":41}],"name":"JSONLexerTest_9.VO","sl":29},{"el":49,"id":69374,"methods":[],"name":"JSONLexerTest_9.Type","sl":47}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1259":{"methods":[{"sl":13},{"sl":31},{"sl":41}],"name":"test_a","pass":true,"statements":[{"sl":14},{"sl":42}]},"test_1951":{"methods":[{"sl":25},{"sl":31},{"sl":41}],"name":"test_value2","pass":false,"statements":[{"sl":26},{"sl":42}]},"test_2022":{"methods":[{"sl":21},{"sl":31}],"name":"test_value","pass":false,"statements":[{"sl":22}]},"test_3808":{"methods":[{"sl":9}],"name":"test_ident","pass":true,"statements":[{"sl":10}]},"test_3841":{"methods":[{"sl":17},{"sl":31}],"name":"test_b","pass":false,"statements":[{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [3808], [3808], [], [], [1259], [1259], [], [], [3841], [3841], [], [], [2022], [2022], [], [], [1951], [1951], [], [], [], [], [1951, 2022, 3841, 1259], [], [], [], [], [], [], [], [], [], [1951, 1259], [1951, 1259], [], [], [], [], [], [], [], []]
