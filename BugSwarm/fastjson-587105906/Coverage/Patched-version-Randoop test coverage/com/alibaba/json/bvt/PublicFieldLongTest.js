var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":25,"id":45719,"methods":[{"el":24,"sc":5,"sl":15}],"name":"PublicFieldLongTest","sl":8},{"el":13,"id":45719,"methods":[],"name":"PublicFieldLongTest.VO","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2379":{"methods":[{"sl":15}],"name":"test_codec","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":19},{"sl":21},{"sl":23}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2379], [2379], [2379], [], [2379], [], [2379], [], [2379], [], []]
