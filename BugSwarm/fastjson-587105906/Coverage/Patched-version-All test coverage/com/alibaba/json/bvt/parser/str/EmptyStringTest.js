var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":22,"id":78876,"methods":[{"el":13,"sc":5,"sl":10}],"name":"EmptyStringTest","sl":9},{"el":17,"id":78879,"methods":[],"name":"EmptyStringTest.SolutionIdentifier","sl":15},{"el":21,"id":78879,"methods":[],"name":"EmptyStringTest.Id","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1467":{"methods":[{"sl":10}],"name":"test_for_emptyString","pass":true,"statements":[{"sl":11},{"sl":12}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [1467], [1467], [1467], [], [], [], [], [], [], [], [], [], []]
