var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":36,"id":47429,"methods":[{"el":19,"sc":5,"sl":16},{"el":23,"sc":5,"sl":21},{"el":29,"sc":5,"sl":25},{"el":35,"sc":5,"sl":31}],"name":"MethodBindingAmbiguityResolutionTest","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_5320":{"methods":[{"sl":21},{"sl":25}],"name":"testSelfMerge","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":28}]},"test_5471":{"methods":[{"sl":16},{"sl":31}],"name":"testConflictMerge","pass":true,"statements":[{"sl":18},{"sl":33},{"sl":34}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [5471], [], [5471], [], [], [5320], [5320], [], [], [5320], [], [5320], [5320], [], [], [5471], [], [5471], [5471], [], []]
