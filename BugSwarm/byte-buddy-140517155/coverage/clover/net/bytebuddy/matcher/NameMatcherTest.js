var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":47,"id":52236,"methods":[{"el":25,"sc":5,"sl":22},{"el":30,"sc":5,"sl":27},{"el":38,"sc":5,"sl":32},{"el":46,"sc":5,"sl":40}],"name":"NameMatcherTest","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2980":{"methods":[{"sl":32}],"name":"testMatch","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":36},{"sl":37}]},"test_4719":{"methods":[{"sl":40}],"name":"testNoMatch","pass":true,"statements":[{"sl":42},{"sl":43},{"sl":44},{"sl":45}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2980], [], [2980], [2980], [2980], [2980], [], [], [4719], [], [4719], [4719], [4719], [4719], [], []]
