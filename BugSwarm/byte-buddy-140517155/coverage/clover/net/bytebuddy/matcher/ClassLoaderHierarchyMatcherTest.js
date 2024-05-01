var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":47,"id":51052,"methods":[{"el":21,"sc":5,"sl":18},{"el":29,"sc":5,"sl":23},{"el":38,"sc":5,"sl":31},{"el":46,"sc":5,"sl":40}],"name":"ClassLoaderHierarchyMatcherTest","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2600":{"methods":[{"sl":31}],"name":"testMatchesParent","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37}]},"test_3939":{"methods":[{"sl":23}],"name":"testMatchesChild","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":28}]},"test_5543":{"methods":[{"sl":40}],"name":"testNoMatch","pass":true,"statements":[{"sl":42},{"sl":43},{"sl":44},{"sl":45}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3939], [], [3939], [3939], [3939], [3939], [], [], [2600], [], [2600], [2600], [2600], [2600], [2600], [], [], [5543], [], [5543], [5543], [5543], [5543], [], []]
