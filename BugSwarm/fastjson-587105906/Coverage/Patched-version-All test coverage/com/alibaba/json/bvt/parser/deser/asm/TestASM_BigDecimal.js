var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":80,"id":76170,"methods":[{"el":17,"sc":5,"sl":13},{"el":24,"sc":5,"sl":19},{"el":33,"sc":5,"sl":27},{"el":42,"sc":5,"sl":35}],"name":"TestASM_BigDecimal","sl":11},{"el":56,"id":76190,"methods":[{"el":50,"sc":9,"sl":48},{"el":54,"sc":9,"sl":52}],"name":"TestASM_BigDecimal.V0","sl":44},{"el":79,"id":76194,"methods":[{"el":65,"sc":9,"sl":63},{"el":69,"sc":9,"sl":67},{"el":73,"sc":9,"sl":71},{"el":77,"sc":9,"sl":75}],"name":"TestASM_BigDecimal.V1","sl":58}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2565":{"methods":[{"sl":13},{"sl":48}],"name":"test_decimal","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":49}]},"test_411":{"methods":[{"sl":27},{"sl":63},{"sl":67},{"sl":71}],"name":"test_decimal_2","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":32},{"sl":64},{"sl":68},{"sl":72}]},"test_717":{"methods":[{"sl":35},{"sl":63},{"sl":67},{"sl":71}],"name":"test_decimal_3","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":41},{"sl":64},{"sl":68},{"sl":72}]},"test_973":{"methods":[{"sl":19},{"sl":48},{"sl":52}],"name":"test_decimal_1","pass":true,"statements":[{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":49},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [2565], [2565], [2565], [2565], [], [], [973], [973], [973], [973], [973], [], [], [], [411], [411], [411], [411], [], [411], [], [], [717], [717], [717], [717], [717], [], [717], [], [], [], [], [], [], [2565, 973], [2565, 973], [], [], [973], [973], [], [], [], [], [], [], [], [], [], [411, 717], [411, 717], [], [], [411, 717], [411, 717], [], [], [411, 717], [411, 717], [], [], [], [], [], [], [], []]
