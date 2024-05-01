var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":19,"id":20275,"methods":[{"el":12,"sc":5,"sl":5}],"name":"Logger","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_151":{"methods":[{"sl":5}],"name":"testRoundTrip_TinyExamples_Old","pass":true,"statements":[{"sl":7},{"sl":10}]},"test_39":{"methods":[{"sl":5}],"name":"roundtrip","pass":true,"statements":[{"sl":7},{"sl":10}]},"test_49":{"methods":[{"sl":5}],"name":"testEncryptDecryptFragmentedMp4","pass":true,"statements":[{"sl":7},{"sl":10}]},"test_76":{"methods":[{"sl":5}],"name":"roundTripFlags0","pass":true,"statements":[{"sl":7},{"sl":10}]},"test_83":{"methods":[{"sl":5}],"name":"freeze","pass":false,"statements":[{"sl":7},{"sl":10}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [76, 151, 49, 83, 39], [], [76, 151, 49, 83, 39], [], [], [76, 151, 49, 83, 39], [], [], [], [], [], [], [], [], []]
