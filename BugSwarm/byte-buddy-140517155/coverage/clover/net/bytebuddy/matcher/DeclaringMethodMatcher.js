var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":48,"id":23573,"methods":[{"el":26,"sc":5,"sl":24},{"el":31,"sc":5,"sl":28},{"el":37,"sc":5,"sl":33},{"el":42,"sc":5,"sl":39},{"el":47,"sc":5,"sl":44}],"name":"DeclaringMethodMatcher","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_5181":{"methods":[{"sl":24},{"sl":28}],"name":"testMatch","pass":true,"statements":[{"sl":25},{"sl":30}]},"test_5414":{"methods":[{"sl":24},{"sl":28}],"name":"testNoMatch","pass":true,"statements":[{"sl":25},{"sl":30}]},"test_5729":{"methods":[{"sl":24},{"sl":33},{"sl":39},{"sl":44}],"name":"testObjectProperties","pass":true,"statements":[{"sl":25},{"sl":35},{"sl":41},{"sl":46}]},"test_584":{"methods":[{"sl":24},{"sl":28}],"name":"testDeclaresField","pass":true,"statements":[{"sl":25},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [5414, 5181, 5729, 584], [5414, 5181, 5729, 584], [], [], [5414, 5181, 584], [], [5414, 5181, 584], [], [], [5729], [], [5729], [], [], [], [5729], [], [5729], [], [], [5729], [], [5729], [], []]
