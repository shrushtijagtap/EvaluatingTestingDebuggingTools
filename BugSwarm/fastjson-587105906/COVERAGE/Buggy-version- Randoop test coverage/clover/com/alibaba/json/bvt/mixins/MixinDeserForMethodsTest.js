var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":65,"id":66900,"methods":[{"el":52,"sc":5,"sl":44},{"el":64,"sc":5,"sl":54}],"name":"MixinDeserForMethodsTest","sl":13},{"el":25,"id":66900,"methods":[{"el":24,"sc":9,"sl":18}],"name":"MixinDeserForMethodsTest.BaseClass","sl":15},{"el":35,"id":66904,"methods":[{"el":34,"sc":9,"sl":30}],"name":"MixinDeserForMethodsTest.BaseClass2","sl":27},{"el":42,"id":66908,"methods":[{"el":41,"sc":9,"sl":38}],"name":"MixinDeserForMethodsTest.MixIn","sl":37}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1773":{"methods":[{"sl":18},{"sl":44}],"name":"test_0","pass":true,"statements":[{"sl":21},{"sl":22},{"sl":23},{"sl":45},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51}]},"test_3963":{"methods":[{"sl":30},{"sl":54}],"name":"test_1","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33},{"sl":55},{"sl":56},{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":63}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1773], [], [], [1773], [1773], [1773], [], [], [], [], [], [], [3963], [3963], [3963], [3963], [], [], [], [], [], [], [], [], [], [], [1773], [1773], [], [1773], [1773], [1773], [1773], [1773], [], [], [3963], [3963], [3963], [], [3963], [3963], [3963], [3963], [3963], [3963], [], []]
