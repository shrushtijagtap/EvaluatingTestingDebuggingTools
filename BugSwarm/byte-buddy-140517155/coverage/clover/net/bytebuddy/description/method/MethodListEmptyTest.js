var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":33946,"methods":[{"el":14,"sc":5,"sl":11},{"el":19,"sc":5,"sl":16}],"name":"MethodListEmptyTest","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4591":{"methods":[{"sl":16}],"name":"testDeclaredList","pass":true,"statements":[{"sl":18}]},"test_867":{"methods":[{"sl":11}],"name":"testTokenListWithFilter","pass":true,"statements":[{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [867], [], [867], [], [], [4591], [], [4591], [], []]
