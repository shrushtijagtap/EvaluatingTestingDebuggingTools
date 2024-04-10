var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":76,"id":67865,"methods":[{"el":19,"sc":5,"sl":11},{"el":23,"sc":5,"sl":21},{"el":33,"sc":5,"sl":25},{"el":43,"sc":5,"sl":35}],"name":"JSONLexerTest_12","sl":9},{"el":57,"id":67885,"methods":[{"el":51,"sc":9,"sl":49},{"el":55,"sc":9,"sl":53}],"name":"JSONLexerTest_12.A","sl":45},{"el":75,"id":67889,"methods":[{"el":63,"sc":9,"sl":61},{"el":69,"sc":9,"sl":67},{"el":73,"sc":9,"sl":71}],"name":"JSONLexerTest_12.VO","sl":59}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1689":{"methods":[{"sl":21},{"sl":49},{"sl":53},{"sl":61},{"sl":67},{"sl":71}],"name":"test_a","pass":true,"statements":[{"sl":22},{"sl":50},{"sl":54},{"sl":68},{"sl":72}]},"test_2101":{"methods":[{"sl":35},{"sl":61},{"sl":71}],"name":"test_error_3","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":38},{"sl":40},{"sl":42},{"sl":72}]},"test_310":{"methods":[{"sl":25},{"sl":53},{"sl":61},{"sl":71}],"name":"test_error_2","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":28},{"sl":30},{"sl":32},{"sl":54},{"sl":72}]},"test_4192":{"methods":[{"sl":11},{"sl":61}],"name":"test_error","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":16},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [4192], [4192], [4192], [4192], [], [4192], [], [4192], [], [], [1689], [1689], [], [], [310], [310], [310], [310], [], [310], [], [310], [], [], [2101], [2101], [2101], [2101], [], [2101], [], [2101], [], [], [], [], [], [], [1689], [1689], [], [], [1689, 310], [1689, 310], [], [], [], [], [], [], [4192, 1689, 2101, 310], [], [], [], [], [], [1689], [1689], [], [], [1689, 2101, 310], [1689, 2101, 310], [], [], [], []]
