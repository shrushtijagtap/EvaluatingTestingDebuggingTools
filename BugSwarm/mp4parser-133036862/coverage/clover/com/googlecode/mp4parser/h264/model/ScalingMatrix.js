var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":19459,"methods":[{"el":36,"sc":5,"sl":30}],"name":"ScalingMatrix","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_105":{"methods":[{"sl":30}],"name":"testRoundTrip_TinyExamples_Untouched","pass":true,"statements":[{"sl":32},{"sl":33},{"sl":34}]},"test_139":{"methods":[{"sl":30}],"name":"testRoundTrip_TinyExamples_Old","pass":false,"statements":[{"sl":32},{"sl":33},{"sl":34}]},"test_9":{"methods":[{"sl":30}],"name":"testRoundTrip_TinyExamples_Metaxed","pass":false,"statements":[{"sl":32},{"sl":33},{"sl":34}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [9, 139, 105], [], [9, 139, 105], [9, 139, 105], [9, 139, 105], [], [], []]
