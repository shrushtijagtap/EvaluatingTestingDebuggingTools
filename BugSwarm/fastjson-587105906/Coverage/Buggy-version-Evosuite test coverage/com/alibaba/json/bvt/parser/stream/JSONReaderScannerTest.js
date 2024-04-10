var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":78964,"methods":[{"el":17,"sc":2,"sl":12},{"el":24,"sc":2,"sl":19},{"el":31,"sc":2,"sl":26}],"name":"JSONReaderScannerTest","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2516":{"methods":[{"sl":26}],"name":"test_doubleQuote_2","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30}]},"test_2699":{"methods":[{"sl":19}],"name":"test_doubleQuote","pass":true,"statements":[{"sl":20},{"sl":21},{"sl":22},{"sl":23}]},"test_3334":{"methods":[{"sl":12}],"name":"test_singleQuote","pass":false,"statements":[{"sl":13},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [3334], [3334], [3334], [], [], [], [], [2699], [2699], [2699], [2699], [2699], [], [], [2516], [2516], [2516], [2516], [2516], [], []]
