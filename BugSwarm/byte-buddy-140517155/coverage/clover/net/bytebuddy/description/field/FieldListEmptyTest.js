var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":33406,"methods":[{"el":14,"sc":5,"sl":11},{"el":19,"sc":5,"sl":16}],"name":"FieldListEmptyTest","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_5743":{"methods":[{"sl":16}],"name":"testDeclaredList","pass":true,"statements":[{"sl":18}]},"test_745":{"methods":[{"sl":11}],"name":"testTokenListWithFilter","pass":true,"statements":[{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [745], [], [745], [], [], [5743], [], [5743], [], []]
