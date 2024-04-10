var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":24,"id":75693,"methods":[{"el":19,"sc":5,"sl":10}],"name":"DenyTest15","sl":9},{"el":23,"id":75700,"methods":[],"name":"DenyTest15.Model","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3135":{"methods":[{"sl":10}],"name":"test_deny","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":16},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [3135], [3135], [3135], [3135], [3135], [], [3135], [], [3135], [], [], [], [], [], []]
