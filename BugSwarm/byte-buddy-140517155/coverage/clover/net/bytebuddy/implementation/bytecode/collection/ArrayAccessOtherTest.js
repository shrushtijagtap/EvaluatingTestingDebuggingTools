var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":50027,"methods":[{"el":12,"sc":5,"sl":9},{"el":19,"sc":5,"sl":14}],"name":"ArrayAccessOtherTest","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3465":{"methods":[{"sl":14}],"name":"testObjectProperties","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_4062":{"methods":[{"sl":9}],"name":"testVoidThrowsException","pass":true,"statements":[{"sl":11}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [4062], [], [4062], [], [], [3465], [], [3465], [3465], [3465], [], []]
