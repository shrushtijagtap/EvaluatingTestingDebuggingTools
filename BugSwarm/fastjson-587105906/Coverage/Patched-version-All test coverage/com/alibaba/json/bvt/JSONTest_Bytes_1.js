var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":24,"id":44424,"methods":[{"el":18,"sc":5,"sl":13},{"el":23,"sc":5,"sl":20}],"name":"JSONTest_Bytes_1","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2424":{"methods":[{"sl":20}],"name":"test_bytes_2","pass":true,"statements":[{"sl":21},{"sl":22}]},"test_3668":{"methods":[{"sl":13}],"name":"test_bytes","pass":true,"statements":[{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [3668], [3668], [3668], [], [], [], [], [2424], [2424], [2424], [], []]
