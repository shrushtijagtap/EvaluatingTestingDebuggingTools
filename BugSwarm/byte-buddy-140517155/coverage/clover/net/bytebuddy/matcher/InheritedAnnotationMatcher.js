var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":47,"id":24100,"methods":[{"el":25,"sc":5,"sl":23},{"el":30,"sc":5,"sl":27},{"el":36,"sc":5,"sl":32},{"el":41,"sc":5,"sl":38},{"el":46,"sc":5,"sl":43}],"name":"InheritedAnnotationMatcher","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1980":{"methods":[{"sl":23},{"sl":27}],"name":"testIsAnnotatedInheritedWith","pass":true,"statements":[{"sl":24},{"sl":29}]},"test_3054":{"methods":[{"sl":23},{"sl":32},{"sl":38},{"sl":43}],"name":"testObjectProperties","pass":true,"statements":[{"sl":24},{"sl":34},{"sl":40},{"sl":45}]},"test_3120":{"methods":[{"sl":23},{"sl":27}],"name":"testMatch","pass":true,"statements":[{"sl":24},{"sl":29}]},"test_5117":{"methods":[{"sl":23},{"sl":27}],"name":"testNoMatch","pass":true,"statements":[{"sl":24},{"sl":29}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3120, 3054, 1980, 5117], [3120, 3054, 1980, 5117], [], [], [3120, 1980, 5117], [], [3120, 1980, 5117], [], [], [3054], [], [3054], [], [], [], [3054], [], [3054], [], [], [3054], [], [3054], [], []]
