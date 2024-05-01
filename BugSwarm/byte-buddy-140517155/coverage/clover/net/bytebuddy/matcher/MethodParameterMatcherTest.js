var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":52131,"methods":[{"el":27,"sc":5,"sl":24},{"el":33,"sc":5,"sl":29},{"el":41,"sc":5,"sl":35},{"el":49,"sc":5,"sl":43}],"name":"MethodParameterMatcherTest","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3122":{"methods":[{"sl":35}],"name":"testMatch","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":39},{"sl":40}]},"test_5481":{"methods":[{"sl":43}],"name":"testNoMatch","pass":true,"statements":[{"sl":45},{"sl":46},{"sl":47},{"sl":48}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3122], [], [3122], [3122], [3122], [3122], [], [], [5481], [], [5481], [5481], [5481], [5481], [], []]
