var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":51,"id":23440,"methods":[{"el":22,"sc":5,"sl":20},{"el":34,"sc":5,"sl":24},{"el":40,"sc":5,"sl":36},{"el":45,"sc":5,"sl":42},{"el":50,"sc":5,"sl":47}],"name":"ClassLoaderParentMatcher","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1437":{"methods":[{"sl":20},{"sl":24}],"name":"testMatch","pass":true,"statements":[{"sl":21},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":31}]},"test_2314":{"methods":[{"sl":20},{"sl":24}],"name":"testNoMatch","pass":true,"statements":[{"sl":21},{"sl":26},{"sl":27},{"sl":28},{"sl":31},{"sl":33}]},"test_2658":{"methods":[{"sl":20},{"sl":36},{"sl":42},{"sl":47}],"name":"testObjectProperties","pass":true,"statements":[{"sl":21},{"sl":38},{"sl":44},{"sl":49}]},"test_4608":{"methods":[{"sl":20},{"sl":24}],"name":"testIsParentOf","pass":true,"statements":[{"sl":21},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":31},{"sl":33}]},"test_725":{"methods":[{"sl":20},{"sl":24}],"name":"testMatchBootstrap","pass":true,"statements":[{"sl":21},{"sl":26},{"sl":27},{"sl":28},{"sl":31},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2314, 2658, 1437, 4608, 725], [2314, 2658, 1437, 4608, 725], [], [], [2314, 1437, 4608, 725], [], [2314, 1437, 4608, 725], [2314, 1437, 4608, 725], [2314, 1437, 4608, 725], [1437, 4608], [], [2314, 1437, 4608, 725], [], [2314, 4608, 725], [], [], [2658], [], [2658], [], [], [], [2658], [], [2658], [], [], [2658], [], [2658], [], []]
