var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":52200,"methods":[{"el":17,"sc":5,"sl":11}],"name":"Bug_for_agapple","sl":9},{"el":31,"id":52205,"methods":[{"el":25,"sc":9,"sl":23},{"el":29,"sc":9,"sl":27}],"name":"Bug_for_agapple.Entity","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4012":{"methods":[{"sl":11},{"sl":23},{"sl":27}],"name":"test_for_agapple","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":16},{"sl":24},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [4012], [4012], [4012], [4012], [], [4012], [], [], [], [], [], [], [4012], [4012], [], [], [4012], [4012], [], [], [], []]
