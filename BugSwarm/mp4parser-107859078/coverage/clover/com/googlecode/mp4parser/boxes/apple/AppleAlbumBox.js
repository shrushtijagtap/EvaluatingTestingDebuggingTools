var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":10,"id":14279,"methods":[{"el":9,"sc":5,"sl":7}],"name":"AppleAlbumBox","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_151":{"methods":[{"sl":7}],"name":"testRoundTrip_TinyExamples_Old","pass":true,"statements":[{"sl":8}]},"test_156":{"methods":[{"sl":7}],"name":"testRoundTrip_1d","pass":true,"statements":[{"sl":8}]},"test_159":{"methods":[{"sl":7}],"name":"testRoundTrip_1e","pass":true,"statements":[{"sl":8}]},"test_25":{"methods":[{"sl":7}],"name":"testRoundTrip_1c","pass":true,"statements":[{"sl":8}]},"test_91":{"methods":[{"sl":7}],"name":"testRooundTrip","pass":true,"statements":[{"sl":8}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [159, 91, 156, 25, 151], [159, 91, 156, 25, 151], [], []]
