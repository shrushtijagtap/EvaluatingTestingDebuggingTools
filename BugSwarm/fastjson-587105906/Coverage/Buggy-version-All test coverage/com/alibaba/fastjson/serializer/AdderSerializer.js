var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":24,"id":24283,"methods":[{"el":23,"sc":5,"sl":14}],"name":"AdderSerializer","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2683":{"methods":[{"sl":14}],"name":"test_long_add","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":18}]},"test_322":{"methods":[{"sl":14}],"name":"test_long_add","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":19},{"sl":20},{"sl":21}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [2683, 322], [2683, 322], [2683, 322], [2683], [2683], [322], [322], [322], [], [], []]
