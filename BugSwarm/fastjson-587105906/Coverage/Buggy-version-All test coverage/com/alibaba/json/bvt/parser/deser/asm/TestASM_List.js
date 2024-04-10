var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":69,"id":76243,"methods":[{"el":22,"sc":5,"sl":14}],"name":"TestASM_List","sl":12},{"el":36,"id":76249,"methods":[{"el":30,"sc":9,"sl":28},{"el":34,"sc":9,"sl":32}],"name":"TestASM_List.V0","sl":24},{"el":68,"id":76253,"methods":[{"el":46,"sc":9,"sl":44},{"el":50,"sc":9,"sl":48},{"el":54,"sc":9,"sl":52},{"el":58,"sc":9,"sl":56},{"el":62,"sc":9,"sl":60},{"el":66,"sc":9,"sl":64}],"name":"TestASM_List.V1","sl":38}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4801":{"methods":[{"sl":14},{"sl":28},{"sl":44},{"sl":52},{"sl":60}],"name":"test_decimal_3","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":29},{"sl":45},{"sl":53},{"sl":61}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [4801], [4801], [4801], [4801], [4801], [4801], [], [], [], [], [], [], [], [], [4801], [4801], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4801], [4801], [], [], [], [], [], [], [4801], [4801], [], [], [], [], [], [], [4801], [4801], [], [], [], [], [], [], [], []]
