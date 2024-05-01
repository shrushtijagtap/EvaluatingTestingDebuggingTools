var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":51070,"methods":[{"el":19,"sc":5,"sl":16},{"el":26,"sc":5,"sl":21},{"el":31,"sc":5,"sl":28},{"el":36,"sc":5,"sl":33},{"el":41,"sc":5,"sl":38}],"name":"ClassLoaderParentMatcherTest","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1437":{"methods":[{"sl":28}],"name":"testMatch","pass":true,"statements":[{"sl":30}]},"test_2314":{"methods":[{"sl":38}],"name":"testNoMatch","pass":true,"statements":[{"sl":40}]},"test_725":{"methods":[{"sl":33}],"name":"testMatchBootstrap","pass":true,"statements":[{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1437], [], [1437], [], [], [725], [], [725], [], [], [2314], [], [2314], [], []]
