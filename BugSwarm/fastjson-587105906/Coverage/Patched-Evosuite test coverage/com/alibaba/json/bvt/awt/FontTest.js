var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":22,"id":49404,"methods":[{"el":21,"sc":5,"sl":12}],"name":"FontTest","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4086":{"methods":[{"sl":12}],"name":"test_color","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":17},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [4086], [4086], [4086], [4086], [], [4086], [], [4086], [], [], []]
