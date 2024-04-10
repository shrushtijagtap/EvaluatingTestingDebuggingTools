var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":29,"id":84875,"methods":[{"el":14,"sc":5,"sl":10}],"name":"TestInnerClass1","sl":8},{"el":28,"id":84879,"methods":[{"el":22,"sc":9,"sl":20},{"el":26,"sc":9,"sl":24}],"name":"TestInnerClass1.VO","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3890":{"methods":[{"sl":10},{"sl":20}],"name":"test_inner","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":21}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [3890], [3890], [3890], [3890], [], [], [], [], [], [], [3890], [3890], [], [], [], [], [], [], [], []]
