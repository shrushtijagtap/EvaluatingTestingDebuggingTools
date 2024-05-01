var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":25535,"methods":[{"el":21,"sc":5,"sl":18},{"el":29,"sc":5,"sl":23},{"el":36,"sc":5,"sl":31},{"el":44,"sc":5,"sl":38}],"name":"PathTest","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_122":{"methods":[{"sl":38}],"name":"testComponentMatcher","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":42},{"sl":43}]},"test_124":{"methods":[{"sl":23}],"name":"testRoundTrip","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":28}]},"test_210":{"methods":[{"sl":31}],"name":"testGetParent","pass":true,"statements":[{"sl":33},{"sl":34}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [124], [], [124], [124], [124], [124], [], [], [210], [], [210], [210], [], [], [], [122], [], [122], [122], [122], [122], [], []]
