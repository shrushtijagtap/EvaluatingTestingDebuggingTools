var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":29,"id":64947,"methods":[{"el":12,"sc":5,"sl":9},{"el":17,"sc":5,"sl":14}],"name":"Issue2229","sl":8},{"el":22,"id":64953,"methods":[],"name":"Issue2229.Jon","sl":19},{"el":28,"id":64953,"methods":[],"name":"Issue2229.User","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3469":{"methods":[{"sl":9}],"name":"test_for_issue","pass":true,"statements":[{"sl":10},{"sl":11}]},"test_4412":{"methods":[{"sl":14}],"name":"test_for_issue1","pass":true,"statements":[{"sl":15},{"sl":16}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [3469], [3469], [3469], [], [], [4412], [4412], [4412], [], [], [], [], [], [], [], [], [], [], [], [], []]
