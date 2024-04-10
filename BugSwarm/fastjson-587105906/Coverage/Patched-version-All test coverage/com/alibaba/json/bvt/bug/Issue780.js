var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":24,"id":57369,"methods":[{"el":16,"sc":5,"sl":11},{"el":23,"sc":5,"sl":18}],"name":"Issue780","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1045":{"methods":[{"sl":11}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":15}]},"test_1911":{"methods":[{"sl":18}],"name":"test_for_issue_array","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":21},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [1045], [1045], [1045], [1045], [1045], [], [], [1911], [1911], [1911], [1911], [1911], [], []]
