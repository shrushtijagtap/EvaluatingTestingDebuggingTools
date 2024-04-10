var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":24,"id":75689,"methods":[{"el":15,"sc":5,"sl":11}],"name":"DenyTest14","sl":10},{"el":19,"id":75693,"methods":[],"name":"DenyTest14.Model","sl":17},{"el":23,"id":75693,"methods":[],"name":"DenyTest14.MyException","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_320":{"methods":[{"sl":11}],"name":"test_deny","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [320], [320], [320], [320], [], [], [], [], [], [], [], [], [], []]
