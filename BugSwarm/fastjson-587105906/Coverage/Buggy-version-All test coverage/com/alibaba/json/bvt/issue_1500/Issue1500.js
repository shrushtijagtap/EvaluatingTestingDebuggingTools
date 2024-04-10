var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":63,"id":61836,"methods":[{"el":32,"sc":5,"sl":16}],"name":"Issue1500","sl":13},{"el":48,"id":61848,"methods":[{"el":37,"sc":9,"sl":36},{"el":43,"sc":9,"sl":41},{"el":47,"sc":9,"sl":45}],"name":"Issue1500.Aa","sl":34},{"el":61,"id":61853,"methods":[{"el":55,"sc":9,"sl":53},{"el":59,"sc":9,"sl":57}],"name":"Issue1500.C","sl":49}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_349":{"methods":[{"sl":16},{"sl":36},{"sl":41},{"sl":45},{"sl":53},{"sl":57}],"name":"test_for_issue","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":42},{"sl":46},{"sl":54},{"sl":58}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [349], [], [], [349], [349], [349], [349], [349], [], [], [349], [349], [349], [349], [349], [349], [], [], [], [], [349], [], [], [], [], [349], [349], [], [], [349], [349], [], [], [], [], [], [], [349], [349], [], [], [349], [349], [], [], [], [], []]
