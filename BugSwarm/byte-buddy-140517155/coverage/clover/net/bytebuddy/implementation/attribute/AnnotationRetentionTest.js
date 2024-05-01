var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":45876,"methods":[{"el":22,"sc":5,"sl":16},{"el":31,"sc":5,"sl":28},{"el":36,"sc":5,"sl":33},{"el":41,"sc":5,"sl":38}],"name":"AnnotationRetentionTest","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1626":{"methods":[{"sl":38}],"name":"testRetention","pass":true,"statements":[{"sl":40}]},"test_3613":{"methods":[{"sl":38}],"name":"testRetention","pass":true,"statements":[{"sl":40}]},"test_3659":{"methods":[{"sl":33}],"name":"testEnabled","pass":true,"statements":[{"sl":35}]},"test_4321":{"methods":[{"sl":33}],"name":"testEnabled","pass":true,"statements":[{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4321, 3659], [], [4321, 3659], [], [], [3613, 1626], [], [3613, 1626], [], []]
