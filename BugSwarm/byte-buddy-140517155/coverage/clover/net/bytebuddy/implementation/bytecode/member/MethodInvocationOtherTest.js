var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":52,"id":50726,"methods":[{"el":33,"sc":5,"sl":23},{"el":48,"sc":13,"sl":42},{"el":51,"sc":5,"sl":35}],"name":"MethodInvocationOtherTest","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1050":{"methods":[{"sl":23}],"name":"testIllegal","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":28},{"sl":30},{"sl":32}]},"test_5428":{"methods":[{"sl":35},{"sl":42}],"name":"testObjectProperties","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":50}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1050], [], [1050], [1050], [], [1050], [], [1050], [], [1050], [], [], [5428], [], [], [5428], [5428], [5428], [5428], [5428], [], [5428], [5428], [5428], [5428], [], [], [5428], [], []]
