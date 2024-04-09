var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":81912,"methods":[{"el":16,"sc":5,"sl":11},{"el":22,"sc":5,"sl":18}],"name":"RefTest23","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1189":{"methods":[{"sl":11}],"name":"test_ref","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":15}]},"test_187":{"methods":[{"sl":18}],"name":"test_ref_1","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":21}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [1189], [1189], [1189], [1189], [1189], [], [], [187], [187], [187], [187], [], []]
