var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":21,"id":42662,"methods":[{"el":16,"sc":5,"sl":11},{"el":20,"sc":5,"sl":18}],"name":"DeprecatedClassTest","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1763":{"methods":[{"sl":11}],"name":"test_0","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15}]},"test_2323":{"methods":[{"sl":18}],"name":"test_1","pass":true,"statements":[{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [1763], [], [1763], [1763], [1763], [], [], [2323], [2323], [], []]
