var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":59380,"methods":[{"el":18,"sc":5,"sl":14}],"name":"Issue1281","sl":13},{"el":22,"id":59384,"methods":[],"name":"Issue1281.Result","sl":20}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_707":{"methods":[{"sl":14}],"name":"test_for_issue","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [707], [707], [707], [707], [], [], [], [], [], []]
