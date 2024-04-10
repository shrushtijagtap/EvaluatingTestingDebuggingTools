var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":65961,"methods":[{"el":17,"sc":5,"sl":14},{"el":28,"sc":5,"sl":19},{"el":40,"sc":5,"sl":34}],"name":"LocalDateTest","sl":13},{"el":54,"id":65976,"methods":[{"el":48,"sc":9,"sl":46},{"el":52,"sc":9,"sl":50}],"name":"LocalDateTest.VO","sl":42}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1898":{"methods":[{"sl":19},{"sl":46},{"sl":50}],"name":"test_for_issue","pass":true,"statements":[{"sl":20},{"sl":21},{"sl":23},{"sl":25},{"sl":27},{"sl":47},{"sl":51}]},"test_3472":{"methods":[{"sl":34},{"sl":50}],"name":"test_for_long","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":51}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1898], [1898], [1898], [], [1898], [], [1898], [], [1898], [], [], [], [], [], [], [3472], [3472], [3472], [3472], [3472], [3472], [], [], [], [], [], [], [1898], [1898], [], [], [1898, 3472], [1898, 3472], [], [], [], []]
