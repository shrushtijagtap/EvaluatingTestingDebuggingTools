var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":80689,"methods":[{"el":15,"sc":5,"sl":11},{"el":20,"sc":5,"sl":17},{"el":25,"sc":5,"sl":22}],"name":"RefTest3","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2377":{"methods":[{"sl":17}],"name":"test_parse","pass":true,"statements":[{"sl":18},{"sl":19}]},"test_3232":{"methods":[{"sl":22}],"name":"test_parse_1","pass":true,"statements":[{"sl":23},{"sl":24}]},"test_3611":{"methods":[{"sl":11}],"name":"test_ref","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3611], [3611], [3611], [3611], [], [], [2377], [2377], [2377], [], [], [3232], [3232], [3232], [], []]
