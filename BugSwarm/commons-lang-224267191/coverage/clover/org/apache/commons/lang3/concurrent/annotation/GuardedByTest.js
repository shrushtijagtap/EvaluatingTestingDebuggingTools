var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":65,"id":45663,"methods":[{"el":39,"sc":5,"sl":32},{"el":58,"sc":5,"sl":41},{"el":63,"sc":5,"sl":60}],"name":"GuardedByTest","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1455":{"methods":[{"sl":32},{"sl":41}],"name":"testMethodAnnotationInClassFile","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":57}]},"test_1977":{"methods":[{"sl":60}],"name":"testMethodAnnotationNotRetainedAtRuntime","pass":true,"statements":[{"sl":62}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1455], [1455], [1455], [1455], [], [], [], [], [], [1455], [], [1455], [1455], [1455], [1455], [1455], [1455], [1455], [1455], [1455], [1455], [1455], [1455], [1455], [1455], [1455], [], [], [1977], [], [1977], [], [], []]
