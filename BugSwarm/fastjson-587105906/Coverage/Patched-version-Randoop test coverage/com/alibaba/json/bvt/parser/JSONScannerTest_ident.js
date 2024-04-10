var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":70381,"methods":[{"el":15,"sc":5,"sl":11},{"el":21,"sc":5,"sl":17},{"el":27,"sc":5,"sl":23},{"el":33,"sc":5,"sl":29},{"el":41,"sc":5,"sl":35}],"name":"JSONScannerTest_ident","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1411":{"methods":[{"sl":23}],"name":"test_null","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26}]},"test_3011":{"methods":[{"sl":29}],"name":"test_new","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32}]},"test_3164":{"methods":[{"sl":35}],"name":"test_Date","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40}]},"test_4304":{"methods":[{"sl":11}],"name":"test_true","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14}]},"test_4484":{"methods":[{"sl":17}],"name":"test_false","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [4304], [4304], [4304], [4304], [], [], [4484], [4484], [4484], [4484], [], [], [1411], [1411], [1411], [1411], [], [], [3011], [3011], [3011], [3011], [], [], [3164], [3164], [3164], [3164], [3164], [3164], [], []]
