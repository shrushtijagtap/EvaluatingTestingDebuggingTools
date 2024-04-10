var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":64390,"methods":[{"el":15,"sc":5,"sl":12},{"el":25,"sc":5,"sl":17}],"name":"Issue1955","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_154":{"methods":[{"sl":17}],"name":"test_for_issue","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":21},{"sl":22},{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [154], [154], [154], [], [154], [154], [], [154], [], []]
