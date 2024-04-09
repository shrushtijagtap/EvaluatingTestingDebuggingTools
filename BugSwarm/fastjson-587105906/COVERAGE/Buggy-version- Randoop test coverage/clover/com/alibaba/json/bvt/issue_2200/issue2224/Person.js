var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":22,"id":65104,"methods":[{"el":9,"sc":5,"sl":7},{"el":13,"sc":5,"sl":11},{"el":17,"sc":5,"sl":15},{"el":21,"sc":5,"sl":19}],"name":"Person","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2350":{"methods":[{"sl":7},{"sl":11},{"sl":15},{"sl":19}],"name":"test_for_issue","pass":true,"statements":[{"sl":8},{"sl":12},{"sl":16},{"sl":20}]},"test_3132":{"methods":[{"sl":7},{"sl":11},{"sl":15},{"sl":19}],"name":"test_for_issue_3","pass":true,"statements":[{"sl":8},{"sl":12},{"sl":16},{"sl":20}]},"test_3399":{"methods":[{"sl":7},{"sl":11},{"sl":15},{"sl":19}],"name":"test_for_issue_2","pass":true,"statements":[{"sl":8},{"sl":12},{"sl":16},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [3399, 2350, 3132], [3399, 2350, 3132], [], [], [3399, 2350, 3132], [3399, 2350, 3132], [], [], [3399, 2350, 3132], [3399, 2350, 3132], [], [], [3399, 2350, 3132], [3399, 2350, 3132], [], []]
