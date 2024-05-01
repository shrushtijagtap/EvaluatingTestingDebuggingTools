var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":22,"id":37689,"methods":[{"el":16,"sc":5,"sl":13},{"el":21,"sc":5,"sl":18}],"name":"ClassFileLocatorNoOpTest","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_5511":{"methods":[{"sl":13}],"name":"testLocation","pass":true,"statements":[{"sl":15}]},"test_5641":{"methods":[{"sl":18}],"name":"testObjectProperties","pass":true,"statements":[{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [5511], [], [5511], [], [], [5641], [], [5641], [], []]
