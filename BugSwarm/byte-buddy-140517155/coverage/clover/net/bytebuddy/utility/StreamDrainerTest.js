var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":53678,"methods":[{"el":17,"sc":5,"sl":13},{"el":22,"sc":5,"sl":19}],"name":"StreamDrainerTest","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2992":{"methods":[{"sl":19}],"name":"testObjectProperties","pass":true,"statements":[{"sl":21}]},"test_3441":{"methods":[{"sl":13}],"name":"testDrainage","pass":true,"statements":[{"sl":15},{"sl":16}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [3441], [], [3441], [3441], [], [], [2992], [], [2992], [], []]
