var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":38,"id":41471,"methods":[{"el":32,"sc":5,"sl":26},{"el":37,"sc":5,"sl":34}],"name":"MethodNameTransformerPrefixingTest","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1129":{"methods":[{"sl":26}],"name":"testTransformation","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":31}]},"test_1445":{"methods":[{"sl":34}],"name":"testObjectProperties","pass":true,"statements":[{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1129], [], [1129], [1129], [1129], [1129], [], [], [1445], [], [1445], [], []]
