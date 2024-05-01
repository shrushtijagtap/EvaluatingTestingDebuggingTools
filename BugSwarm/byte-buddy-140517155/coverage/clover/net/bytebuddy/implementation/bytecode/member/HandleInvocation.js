var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":67,"id":23042,"methods":[{"el":36,"sc":5,"sl":34},{"el":41,"sc":5,"sl":38},{"el":48,"sc":5,"sl":43},{"el":54,"sc":5,"sl":50},{"el":59,"sc":5,"sl":56},{"el":66,"sc":5,"sl":61}],"name":"HandleInvocation","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2057":{"methods":[{"sl":34},{"sl":50},{"sl":56},{"sl":61}],"name":"testObjectProperties","pass":true,"statements":[{"sl":35},{"sl":52},{"sl":58},{"sl":63}]},"test_2140":{"methods":[{"sl":34},{"sl":38},{"sl":43}],"name":"testInvocationDecreasingStack","pass":true,"statements":[{"sl":35},{"sl":40},{"sl":45},{"sl":46},{"sl":47}]},"test_2912":{"methods":[{"sl":34},{"sl":38},{"sl":43}],"name":"testInvocationIncreasingStack","pass":true,"statements":[{"sl":35},{"sl":40},{"sl":45},{"sl":46},{"sl":47}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2912, 2057, 2140], [2912, 2057, 2140], [], [], [2912, 2140], [], [2912, 2140], [], [], [2912, 2140], [], [2912, 2140], [2912, 2140], [2912, 2140], [], [], [2057], [], [2057], [], [], [], [2057], [], [2057], [], [], [2057], [], [2057], [], [], [], []]
