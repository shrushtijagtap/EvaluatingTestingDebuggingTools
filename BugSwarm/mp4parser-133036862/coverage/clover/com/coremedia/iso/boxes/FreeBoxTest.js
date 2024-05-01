var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":23211,"methods":[{"el":30,"sc":5,"sl":18},{"el":54,"sc":5,"sl":32}],"name":"FreeBoxTest","sl":17}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_183":{"methods":[{"sl":18}],"name":"testInOutNoChange","pass":true,"statements":[{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29}]},"test_80":{"methods":[{"sl":32}],"name":"tesAddAndReplace","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [183], [], [183], [183], [183], [183], [183], [183], [183], [183], [183], [183], [], [], [80], [], [], [80], [80], [80], [80], [80], [80], [80], [80], [80], [80], [80], [80], [80], [], [80], [80], [80], [80], [80], [], []]
