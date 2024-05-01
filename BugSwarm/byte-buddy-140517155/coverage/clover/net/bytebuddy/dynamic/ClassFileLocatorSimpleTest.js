var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":37704,"methods":[{"el":20,"sc":5,"sl":15},{"el":26,"sc":5,"sl":22},{"el":31,"sc":5,"sl":28}],"name":"ClassFileLocatorSimpleTest","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1043":{"methods":[{"sl":22}],"name":"testInSuccessfulLocation","pass":true,"statements":[{"sl":24},{"sl":25}]},"test_348":{"methods":[{"sl":28}],"name":"testObjectProperties","pass":true,"statements":[{"sl":30}]},"test_5693":{"methods":[{"sl":15}],"name":"testSuccessfulLocation","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [5693], [], [5693], [5693], [5693], [], [], [1043], [], [1043], [1043], [], [], [348], [], [348], [], []]
