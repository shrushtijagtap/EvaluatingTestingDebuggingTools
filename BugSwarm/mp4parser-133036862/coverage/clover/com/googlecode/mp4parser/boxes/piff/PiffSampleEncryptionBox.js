var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":85,"id":18412,"methods":[{"el":39,"sc":5,"sl":36},{"el":44,"sc":5,"sl":41},{"el":48,"sc":5,"sl":46},{"el":52,"sc":5,"sl":50},{"el":56,"sc":5,"sl":54},{"el":60,"sc":5,"sl":58},{"el":64,"sc":5,"sl":62},{"el":68,"sc":5,"sl":66},{"el":73,"sc":5,"sl":70},{"el":83,"sc":5,"sl":76}],"name":"PiffSampleEncryptionBox","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_143":{"methods":[{"sl":36},{"sl":41},{"sl":70}],"name":"testRoundTripFlagsZero","pass":true,"statements":[{"sl":37},{"sl":43},{"sl":72}]},"test_174":{"methods":[{"sl":36},{"sl":41},{"sl":70}],"name":"testRoundTripFlagsTwo","pass":true,"statements":[{"sl":37},{"sl":43},{"sl":72}]},"test_190":{"methods":[{"sl":36},{"sl":41},{"sl":50},{"sl":58},{"sl":66},{"sl":70},{"sl":76}],"name":"testRoundTripFlagsOne","pass":true,"statements":[{"sl":37},{"sl":43},{"sl":51},{"sl":59},{"sl":67},{"sl":72},{"sl":78},{"sl":79}]},"test_36":{"methods":[{"sl":36},{"sl":41},{"sl":50},{"sl":58},{"sl":66},{"sl":70},{"sl":76}],"name":"testRoundTripFlagsThree","pass":true,"statements":[{"sl":37},{"sl":43},{"sl":51},{"sl":59},{"sl":67},{"sl":72},{"sl":78},{"sl":79}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [143, 174, 36, 190], [143, 174, 36, 190], [], [], [], [143, 174, 36, 190], [], [143, 174, 36, 190], [], [], [], [], [], [], [36, 190], [36, 190], [], [], [], [], [], [], [36, 190], [36, 190], [], [], [], [], [], [], [36, 190], [36, 190], [], [], [143, 174, 36, 190], [], [143, 174, 36, 190], [], [], [], [36, 190], [], [36, 190], [36, 190], [], [], [], [], [], []]
