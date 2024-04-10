var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":33911,"methods":[{"el":12,"sc":5,"sl":9},{"el":17,"sc":5,"sl":14},{"el":30,"sc":5,"sl":19},{"el":39,"sc":5,"sl":32},{"el":44,"sc":5,"sl":41}],"name":"GenericArrayTypeImpl","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2381":{"methods":[{"sl":9},{"sl":14},{"sl":41}],"name":"test_for_issue_3","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":16},{"sl":43}]},"test_3730":{"methods":[{"sl":9},{"sl":14},{"sl":41}],"name":"test_for_issue_4","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":16},{"sl":43}]},"test_4136":{"methods":[{"sl":9},{"sl":14},{"sl":41}],"name":"test_for_issue_5","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":16},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [3730, 4136, 2381], [3730, 4136, 2381], [3730, 4136, 2381], [], [], [3730, 4136, 2381], [], [3730, 4136, 2381], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3730, 4136, 2381], [], [3730, 4136, 2381], [], []]
