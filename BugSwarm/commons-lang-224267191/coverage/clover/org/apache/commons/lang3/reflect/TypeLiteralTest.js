var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":56,"id":50593,"methods":[{"el":34,"sc":5,"sl":29},{"el":42,"sc":5,"sl":36},{"el":49,"sc":5,"sl":44},{"el":55,"sc":5,"sl":51}],"name":"TypeLiteralTest","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1687":{"methods":[{"sl":29}],"name":"testBasic","pass":true,"statements":[{"sl":31},{"sl":32}]},"test_2680":{"methods":[{"sl":36}],"name":"testTyped","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40},{"sl":41}]},"test_3135":{"methods":[{"sl":44}],"name":"testEquals","pass":true,"statements":[{"sl":46},{"sl":47},{"sl":48}]},"test_3216":{"methods":[{"sl":51}],"name":"testRaw","pass":true,"statements":[{"sl":54}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1687], [], [1687], [1687], [], [], [], [2680], [], [2680], [2680], [2680], [2680], [], [], [3135], [], [3135], [3135], [3135], [], [], [3216], [], [], [3216], [], []]
