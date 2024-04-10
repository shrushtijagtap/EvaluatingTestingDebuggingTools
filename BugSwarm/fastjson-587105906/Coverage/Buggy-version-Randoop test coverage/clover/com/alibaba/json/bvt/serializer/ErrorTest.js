var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":78,"id":82992,"methods":[{"el":24,"sc":13,"sl":21},{"el":49,"sc":5,"sl":17}],"name":"ErrorTest","sl":15},{"el":63,"id":83010,"methods":[{"el":57,"sc":9,"sl":55},{"el":61,"sc":9,"sl":59}],"name":"ErrorTest.A","sl":51},{"el":77,"id":83014,"methods":[{"el":71,"sc":9,"sl":69},{"el":75,"sc":9,"sl":73}],"name":"ErrorTest.B","sl":65}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_73":{"methods":[{"sl":17},{"sl":21},{"sl":69},{"sl":73}],"name":"test_error","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":23},{"sl":26},{"sl":29},{"sl":30},{"sl":31},{"sl":33},{"sl":35},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":45},{"sl":47},{"sl":70},{"sl":74}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [73], [73], [73], [], [73], [], [73], [], [], [73], [], [], [73], [73], [73], [], [73], [], [73], [], [], [], [73], [73], [73], [73], [73], [], [73], [], [73], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [73], [73], [], [], [73], [73], [], [], [], []]
