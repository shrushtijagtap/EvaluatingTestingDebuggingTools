var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":52,"id":23421,"methods":[{"el":23,"sc":5,"sl":21},{"el":35,"sc":5,"sl":25},{"el":41,"sc":5,"sl":37},{"el":46,"sc":5,"sl":43},{"el":51,"sc":5,"sl":48}],"name":"ClassLoaderHierarchyMatcher","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2600":{"methods":[{"sl":21},{"sl":25}],"name":"testMatchesParent","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":28},{"sl":29},{"sl":32},{"sl":34}]},"test_3939":{"methods":[{"sl":21},{"sl":25}],"name":"testMatchesChild","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":28},{"sl":29},{"sl":30}]},"test_5063":{"methods":[{"sl":21},{"sl":25}],"name":"testIsChildOf","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":32},{"sl":34}]},"test_5543":{"methods":[{"sl":21},{"sl":25}],"name":"testNoMatch","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":28},{"sl":29},{"sl":32},{"sl":34}]},"test_937":{"methods":[{"sl":21},{"sl":37},{"sl":43},{"sl":48}],"name":"testObjectProperties","pass":true,"statements":[{"sl":22},{"sl":39},{"sl":45},{"sl":50}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3939, 937, 2600, 5543, 5063], [3939, 937, 2600, 5543, 5063], [], [], [3939, 2600, 5543, 5063], [], [3939, 2600, 5543, 5063], [3939, 2600, 5543, 5063], [3939, 2600, 5543, 5063], [3939, 5063], [], [2600, 5543, 5063], [], [2600, 5543, 5063], [], [], [937], [], [937], [], [], [], [937], [], [937], [], [], [937], [], [937], [], []]
