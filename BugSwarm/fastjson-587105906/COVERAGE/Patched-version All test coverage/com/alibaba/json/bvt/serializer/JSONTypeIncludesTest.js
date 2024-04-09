var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":84106,"methods":[{"el":16,"sc":5,"sl":9}],"name":"JSONTypeIncludesTest","sl":8},{"el":22,"id":84112,"methods":[],"name":"JSONTypeIncludesTest.Model","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1120":{"methods":[{"sl":9}],"name":"test_includes","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12},{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [1120], [1120], [1120], [1120], [], [1120], [1120], [], [], [], [], [], [], [], []]
