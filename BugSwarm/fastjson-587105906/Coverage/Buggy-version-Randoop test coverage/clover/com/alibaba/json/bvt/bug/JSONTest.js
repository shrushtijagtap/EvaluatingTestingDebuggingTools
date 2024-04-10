var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":82,"id":57936,"methods":[{"el":27,"sc":5,"sl":14},{"el":37,"sc":5,"sl":29}],"name":"JSONTest","sl":12},{"el":59,"id":57955,"methods":[{"el":46,"sc":9,"sl":44},{"el":50,"sc":9,"sl":48},{"el":54,"sc":9,"sl":52},{"el":58,"sc":9,"sl":56}],"name":"JSONTest.InnerEntry","sl":39},{"el":81,"id":57963,"methods":[{"el":68,"sc":9,"sl":66},{"el":72,"sc":9,"sl":70},{"el":76,"sc":9,"sl":74},{"el":80,"sc":9,"sl":78}],"name":"JSONTest.OuterEntry","sl":61}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3004":{"methods":[{"sl":14},{"sl":66},{"sl":70},{"sl":74},{"sl":78}],"name":"testParseArray","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":67},{"sl":71},{"sl":75},{"sl":79}]},"test_3109":{"methods":[{"sl":29},{"sl":44},{"sl":48},{"sl":52},{"sl":56}],"name":"testInnerEntry","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":45},{"sl":49},{"sl":53},{"sl":57}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [3004], [], [3004], [3004], [3004], [3004], [3004], [3004], [3004], [3004], [3004], [3004], [3004], [], [], [3109], [], [3109], [3109], [3109], [3109], [3109], [3109], [], [], [], [], [], [], [], [3109], [3109], [], [], [3109], [3109], [], [], [3109], [3109], [], [], [3109], [3109], [], [], [], [], [], [], [], [], [3004], [3004], [], [], [3004], [3004], [], [], [3004], [3004], [], [], [3004], [3004], [], [], []]
