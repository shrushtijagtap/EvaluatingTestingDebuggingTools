var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":51436,"methods":[{"el":20,"sc":5,"sl":12}],"name":"Bug_6","sl":10},{"el":34,"id":51441,"methods":[{"el":28,"sc":9,"sl":26},{"el":32,"sc":9,"sl":30}],"name":"Bug_6.Entity","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1113":{"methods":[{"sl":12},{"sl":26}],"name":"test_bug6","pass":true,"statements":[{"sl":13},{"sl":15},{"sl":17},{"sl":19},{"sl":27}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [1113], [1113], [], [1113], [], [1113], [], [1113], [], [], [], [], [], [], [1113], [1113], [], [], [], [], [], [], [], []]
