var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":44435,"methods":[{"el":34,"sc":13,"sl":31},{"el":36,"sc":5,"sl":28}],"name":"AtomicInitializerTest","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1518":{"methods":[{"sl":28},{"sl":31}],"name":"testGet","pass":true,"statements":[{"sl":30},{"sl":33}]},"test_2603":{"methods":[{"sl":28},{"sl":31}],"name":"testGetMultipleTimes","pass":true,"statements":[{"sl":30},{"sl":33}]},"test_3827":{"methods":[{"sl":28},{"sl":31}],"name":"testGetConcurrent","pass":true,"statements":[{"sl":30},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2603, 1518, 3827], [], [2603, 1518, 3827], [2603, 1518, 3827], [], [2603, 1518, 3827], [], [], [], []]
