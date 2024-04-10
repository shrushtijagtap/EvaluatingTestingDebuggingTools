var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":60972,"methods":[{"el":30,"sc":5,"sl":10}],"name":"Issue1335","sl":9},{"el":41,"id":60983,"methods":[],"name":"Issue1335.Image","sl":32}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1694":{"methods":[{"sl":10}],"name":"test_for_issue","pass":true,"statements":[{"sl":11},{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [1694], [1694], [], [], [], [], [], [], [], [], [], [1694], [1694], [1694], [1694], [1694], [1694], [1694], [1694], [1694], [], [], [], [], [], [], [], [], [], [], [], [], []]
