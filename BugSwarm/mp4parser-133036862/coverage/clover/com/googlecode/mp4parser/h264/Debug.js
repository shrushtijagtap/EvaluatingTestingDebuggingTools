var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":88,"id":18971,"methods":[{"el":35,"sc":5,"sl":26},{"el":46,"sc":5,"sl":37},{"el":55,"sc":5,"sl":48},{"el":66,"sc":5,"sl":57},{"el":70,"sc":5,"sl":68},{"el":77,"sc":5,"sl":74},{"el":82,"sc":5,"sl":79},{"el":87,"sc":5,"sl":84}],"name":"Debug","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_105":{"methods":[{"sl":84}],"name":"testRoundTrip_TinyExamples_Untouched","pass":true,"statements":[{"sl":85}]},"test_139":{"methods":[{"sl":84}],"name":"testRoundTrip_TinyExamples_Old","pass":false,"statements":[{"sl":85}]},"test_17":{"methods":[{"sl":84}],"name":"freeze","pass":true,"statements":[{"sl":85}]},"test_9":{"methods":[{"sl":84}],"name":"testRoundTrip_TinyExamples_Metaxed","pass":false,"statements":[{"sl":85}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [9, 139, 17, 105], [9, 139, 17, 105], [], [], []]
