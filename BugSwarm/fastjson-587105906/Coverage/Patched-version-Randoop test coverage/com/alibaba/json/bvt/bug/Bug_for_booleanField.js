var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":52345,"methods":[{"el":15,"sc":5,"sl":12}],"name":"Bug_for_booleanField","sl":10},{"el":29,"id":52348,"methods":[{"el":24,"sc":9,"sl":22},{"el":28,"sc":9,"sl":26}],"name":"Bug_for_booleanField.BooleanJson","sl":17}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2617":{"methods":[{"sl":12},{"sl":22},{"sl":26}],"name":"test_boolean","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":23},{"sl":27}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [2617], [2617], [2617], [], [], [], [], [], [], [], [2617], [2617], [], [], [2617], [2617], [], [], []]
