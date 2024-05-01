var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":36,"id":41478,"methods":[{"el":30,"sc":5,"sl":25},{"el":35,"sc":5,"sl":32}],"name":"MethodNameTransformerSuffixingTest","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2200":{"methods":[{"sl":32}],"name":"testObjectProperties","pass":true,"statements":[{"sl":34}]},"test_4427":{"methods":[{"sl":25}],"name":"testTransformation","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4427], [], [4427], [4427], [4427], [], [], [2200], [], [2200], [], []]
