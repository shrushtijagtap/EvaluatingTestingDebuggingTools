var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":76,"id":61253,"methods":[{"el":50,"sc":5,"sl":37},{"el":63,"sc":5,"sl":52},{"el":75,"sc":5,"sl":65}],"name":"Issue1424","sl":9},{"el":22,"id":61253,"methods":[{"el":16,"sc":9,"sl":14},{"el":21,"sc":9,"sl":18}],"name":"Issue1424.IntegerVal","sl":11},{"el":35,"id":61257,"methods":[{"el":29,"sc":9,"sl":27},{"el":34,"sc":9,"sl":31}],"name":"Issue1424.FloatVal","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_183":{"methods":[{"sl":27},{"sl":65}],"name":"test_for_issue_float_infinity","pass":true,"statements":[{"sl":28},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":71},{"sl":72},{"sl":73},{"sl":74}]},"test_2523":{"methods":[{"sl":37}],"name":"test_for_issue_int","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":43},{"sl":44},{"sl":45},{"sl":47},{"sl":49}]},"test_4288":{"methods":[{"sl":27},{"sl":52}],"name":"test_for_issue_float","pass":true,"statements":[{"sl":28},{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":58},{"sl":59},{"sl":60},{"sl":62}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [183, 4288], [183, 4288], [], [], [], [], [], [], [], [], [2523], [2523], [2523], [2523], [2523], [], [2523], [2523], [2523], [], [2523], [], [2523], [], [], [4288], [4288], [4288], [4288], [4288], [], [4288], [4288], [4288], [], [4288], [], [], [183], [183], [183], [183], [183], [], [183], [183], [183], [183], [], []]
