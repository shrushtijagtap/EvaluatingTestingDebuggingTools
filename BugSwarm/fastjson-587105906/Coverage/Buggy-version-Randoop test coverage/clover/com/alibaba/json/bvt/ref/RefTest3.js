var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":81806,"methods":[{"el":15,"sc":5,"sl":11},{"el":20,"sc":5,"sl":17},{"el":25,"sc":5,"sl":22}],"name":"RefTest3","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2496":{"methods":[{"sl":22}],"name":"test_parse_1","pass":true,"statements":[{"sl":23},{"sl":24}]},"test_3797":{"methods":[{"sl":11}],"name":"test_ref","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14}]},"test_811":{"methods":[{"sl":17}],"name":"test_parse","pass":true,"statements":[{"sl":18},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3797], [3797], [3797], [3797], [], [], [811], [811], [811], [], [], [2496], [2496], [2496], [], []]
