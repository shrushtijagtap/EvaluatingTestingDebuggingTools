var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":25,"id":64777,"methods":[{"el":24,"sc":5,"sl":9}],"name":"Issue2182","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4049":{"methods":[{"sl":9}],"name":"test_for_issue","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":17},{"sl":18},{"sl":20},{"sl":22},{"sl":23}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [4049], [4049], [4049], [4049], [4049], [4049], [4049], [], [4049], [4049], [], [4049], [], [4049], [4049], [], []]
