var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":19,"id":20370,"methods":[{"el":12,"sc":5,"sl":5}],"name":"Logger","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_122":{"methods":[{"sl":5}],"name":"freeze","pass":true,"statements":[{"sl":7},{"sl":10}]},"test_139":{"methods":[{"sl":5}],"name":"testRoundTrip_TinyExamples_Old","pass":false,"statements":[{"sl":7},{"sl":10}]},"test_159":{"methods":[{"sl":5}],"name":"test02","pass":true,"statements":[{"sl":7},{"sl":10}]},"test_161":{"methods":[{"sl":5}],"name":"roundtrip","pass":true,"statements":[{"sl":7},{"sl":10}]},"test_32":{"methods":[{"sl":5}],"name":"roundTripFlags0","pass":true,"statements":[{"sl":7},{"sl":10}]},"test_48":{"methods":[{"sl":5}],"name":"testEncryptDecryptFragmentedMp4","pass":true,"statements":[{"sl":7},{"sl":10}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [159, 161, 122, 48, 139, 32], [], [159, 161, 122, 48, 139, 32], [], [], [159, 161, 122, 48, 139, 32], [], [], [], [], [], [], [], [], []]
