var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":25,"id":76914,"methods":[{"el":20,"sc":5,"sl":11}],"name":"DenyTest13","sl":10},{"el":24,"id":76921,"methods":[],"name":"DenyTest13.Model","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3438":{"methods":[{"sl":11}],"name":"test_deny","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":17},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3438], [3438], [3438], [3438], [3438], [], [3438], [], [3438], [], [], [], [], [], []]
