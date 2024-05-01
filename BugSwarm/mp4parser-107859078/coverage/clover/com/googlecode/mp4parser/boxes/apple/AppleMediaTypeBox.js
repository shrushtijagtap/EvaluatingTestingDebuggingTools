var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":10,"id":14532,"methods":[{"el":9,"sc":5,"sl":7}],"name":"AppleMediaTypeBox","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_156":{"methods":[{"sl":7}],"name":"testRoundTrip_1d","pass":true,"statements":[{"sl":8}]},"test_169":{"methods":[{"sl":7}],"name":"testRoundTrip_TinyExamples_Metaxed","pass":true,"statements":[{"sl":8}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [169, 156], [169, 156], [], []]
