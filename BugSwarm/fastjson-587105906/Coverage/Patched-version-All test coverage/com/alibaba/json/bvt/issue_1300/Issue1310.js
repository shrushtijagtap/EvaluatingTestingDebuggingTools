var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":25,"id":60739,"methods":[{"el":19,"sc":5,"sl":11}],"name":"Issue1310","sl":10},{"el":24,"id":60745,"methods":[],"name":"Issue1310.Model","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3176":{"methods":[{"sl":11}],"name":"test_trim","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":15},{"sl":17},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3176], [3176], [3176], [], [3176], [], [3176], [3176], [], [], [], [], [], [], []]
