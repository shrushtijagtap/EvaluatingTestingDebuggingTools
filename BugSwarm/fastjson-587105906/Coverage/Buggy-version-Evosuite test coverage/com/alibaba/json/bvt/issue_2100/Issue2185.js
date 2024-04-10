var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":91,"id":64789,"methods":[{"el":26,"sc":5,"sl":13},{"el":46,"sc":5,"sl":33},{"el":66,"sc":5,"sl":53},{"el":86,"sc":5,"sl":73}],"name":"Issue2185","sl":11},{"el":90,"id":64829,"methods":[],"name":"Issue2185.Model","sl":88}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_222":{"methods":[{"sl":53}],"name":"test_for_issue_2","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":61},{"sl":65}]},"test_2700":{"methods":[{"sl":73}],"name":"test_for_issue_3","pass":true,"statements":[{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":81},{"sl":85}]},"test_2833":{"methods":[{"sl":33}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":41},{"sl":45}]},"test_3584":{"methods":[{"sl":13}],"name":"test_for_issue","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":20},{"sl":21},{"sl":25}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [3584], [3584], [3584], [3584], [3584], [3584], [], [3584], [3584], [], [], [], [3584], [], [], [], [], [], [], [], [2833], [2833], [2833], [2833], [2833], [2833], [2833], [], [2833], [], [], [], [2833], [], [], [], [], [], [], [], [222], [222], [222], [222], [222], [222], [222], [], [222], [], [], [], [222], [], [], [], [], [], [], [], [2700], [2700], [2700], [2700], [2700], [2700], [2700], [], [2700], [], [], [], [2700], [], [], [], [], [], []]
