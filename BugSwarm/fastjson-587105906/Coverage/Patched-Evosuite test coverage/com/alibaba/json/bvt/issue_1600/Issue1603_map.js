var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":27,"id":62086,"methods":[{"el":12,"sc":5,"sl":9},{"el":17,"sc":5,"sl":14}],"name":"Issue1603_map","sl":8},{"el":21,"id":62092,"methods":[],"name":"Issue1603_map.Model_1","sl":19},{"el":25,"id":62092,"methods":[],"name":"Issue1603_map.Model_2","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1105":{"methods":[{"sl":9}],"name":"test_emptyMap","pass":true,"statements":[{"sl":10},{"sl":11}]},"test_434":{"methods":[{"sl":14}],"name":"test_unmodifiableMap","pass":true,"statements":[{"sl":15},{"sl":16}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [1105], [1105], [1105], [], [], [434], [434], [434], [], [], [], [], [], [], [], [], [], [], []]
