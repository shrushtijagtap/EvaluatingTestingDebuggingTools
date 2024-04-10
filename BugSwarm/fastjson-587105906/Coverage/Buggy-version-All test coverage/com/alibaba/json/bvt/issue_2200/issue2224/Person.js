var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":22,"id":65230,"methods":[{"el":9,"sc":5,"sl":7},{"el":13,"sc":5,"sl":11},{"el":17,"sc":5,"sl":15},{"el":21,"sc":5,"sl":19}],"name":"Person","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2670":{"methods":[{"sl":7},{"sl":11},{"sl":15},{"sl":19}],"name":"test_for_issue","pass":true,"statements":[{"sl":8},{"sl":12},{"sl":16},{"sl":20}]},"test_3772":{"methods":[{"sl":7},{"sl":11},{"sl":15},{"sl":19}],"name":"test_for_issue_3","pass":true,"statements":[{"sl":8},{"sl":12},{"sl":16},{"sl":20}]},"test_806":{"methods":[{"sl":7},{"sl":11},{"sl":15},{"sl":19}],"name":"test_for_issue_2","pass":true,"statements":[{"sl":8},{"sl":12},{"sl":16},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [2670, 806, 3772], [2670, 806, 3772], [], [], [2670, 806, 3772], [2670, 806, 3772], [], [], [2670, 806, 3772], [2670, 806, 3772], [], [], [2670, 806, 3772], [2670, 806, 3772], [], []]
