var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":38,"id":45689,"methods":[{"el":31,"sc":5,"sl":26},{"el":36,"sc":5,"sl":33}],"name":"ImmutableTest","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1324":{"methods":[{"sl":33}],"name":"testMethodAnnotationNotRetainedAtRuntime","pass":true,"statements":[{"sl":35}]},"test_2333":{"methods":[{"sl":26}],"name":"testClassAnnotationInClassFile","pass":true,"statements":[{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2333], [], [2333], [], [], [], [], [1324], [], [1324], [], [], []]
