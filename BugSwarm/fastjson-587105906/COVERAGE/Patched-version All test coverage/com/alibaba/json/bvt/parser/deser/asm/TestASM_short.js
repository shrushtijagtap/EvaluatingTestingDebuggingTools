var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":76383,"methods":[{"el":15,"sc":5,"sl":10}],"name":"TestASM_short","sl":8},{"el":29,"id":76388,"methods":[{"el":23,"sc":9,"sl":21},{"el":27,"sc":9,"sl":25}],"name":"TestASM_short.V0","sl":17}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1288":{"methods":[{"sl":10},{"sl":21},{"sl":25}],"name":"test_asm","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":22},{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [1288], [1288], [1288], [1288], [1288], [], [], [], [], [], [], [1288], [1288], [], [], [1288], [1288], [], [], [], []]
