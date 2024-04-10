var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":57,"id":78880,"methods":[{"el":17,"sc":5,"sl":12},{"el":24,"sc":5,"sl":19},{"el":31,"sc":5,"sl":26},{"el":38,"sc":5,"sl":33}],"name":"JSONReaderScannerTest_enum","sl":10},{"el":52,"id":78900,"methods":[{"el":46,"sc":9,"sl":44},{"el":50,"sc":9,"sl":48}],"name":"JSONReaderScannerTest_enum.VO","sl":40},{"el":56,"id":78904,"methods":[],"name":"JSONReaderScannerTest_enum.Type","sl":54}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3210":{"methods":[{"sl":19},{"sl":44},{"sl":48}],"name":"test_b","pass":true,"statements":[{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":45},{"sl":49}]},"test_43":{"methods":[{"sl":12},{"sl":44},{"sl":48}],"name":"test_a","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":45},{"sl":49}]},"test_4346":{"methods":[{"sl":33},{"sl":44},{"sl":48}],"name":"test_x","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":45},{"sl":49}]},"test_4683":{"methods":[{"sl":26},{"sl":44},{"sl":48}],"name":"test_c","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":45},{"sl":49}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [43], [43], [43], [43], [43], [], [], [3210], [3210], [3210], [3210], [3210], [], [], [4683], [4683], [4683], [4683], [4683], [], [], [4346], [4346], [4346], [4346], [4346], [], [], [], [], [], [], [3210, 4683, 43, 4346], [3210, 4683, 43, 4346], [], [], [3210, 4683, 43, 4346], [3210, 4683, 43, 4346], [], [], [], [], [], [], [], []]
