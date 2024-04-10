var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":76202,"methods":[{"el":16,"sc":5,"sl":10}],"name":"TestASM_int","sl":8},{"el":31,"id":76207,"methods":[{"el":24,"sc":9,"sl":22},{"el":29,"sc":9,"sl":26}],"name":"TestASM_int.V0","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2810":{"methods":[{"sl":10},{"sl":22},{"sl":26}],"name":"test_asm","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":15},{"sl":23},{"sl":27},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [2810], [2810], [2810], [2810], [], [2810], [], [], [], [], [], [], [2810], [2810], [], [], [2810], [2810], [2810], [], [], [], []]
