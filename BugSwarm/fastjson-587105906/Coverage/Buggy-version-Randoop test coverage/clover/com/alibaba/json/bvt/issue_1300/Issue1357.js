var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":60934,"methods":[{"el":17,"sc":5,"sl":12}],"name":"Issue1357","sl":11},{"el":22,"id":60938,"methods":[],"name":"Issue1357.Test2Bean","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1268":{"methods":[{"sl":12}],"name":"test_for_issue","pass":false,"statements":[{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [1268], [], [1268], [1268], [], [], [], [], [], [], [], []]
