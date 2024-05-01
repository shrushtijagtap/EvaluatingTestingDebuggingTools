var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":47,"id":49453,"methods":[{"el":36,"sc":5,"sl":28},{"el":41,"sc":5,"sl":38},{"el":46,"sc":5,"sl":43}],"name":"ThrowTest","sl":17}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1066":{"methods":[{"sl":38}],"name":"testValidity","pass":true,"statements":[{"sl":40}]},"test_172":{"methods":[{"sl":28}],"name":"testApplication","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35}]},"test_3011":{"methods":[{"sl":43}],"name":"testObjectProperties","pass":true,"statements":[{"sl":45}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [172], [], [172], [172], [172], [172], [172], [172], [], [], [1066], [], [1066], [], [], [3011], [], [3011], [], []]
