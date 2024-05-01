var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":52855,"methods":[{"el":15,"sc":5,"sl":12},{"el":20,"sc":5,"sl":17},{"el":25,"sc":5,"sl":22}],"name":"TypePoolEmptyTest","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1219":{"methods":[{"sl":22}],"name":"testClearNoEffect","pass":true,"statements":[{"sl":24}]},"test_1231":{"methods":[{"sl":12}],"name":"testResolutionUnresolved","pass":true,"statements":[{"sl":14}]},"test_2616":{"methods":[{"sl":17}],"name":"testResolutionThrowsException","pass":true,"statements":[{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [1231], [], [1231], [], [], [2616], [], [2616], [], [], [1219], [], [1219], [], []]
