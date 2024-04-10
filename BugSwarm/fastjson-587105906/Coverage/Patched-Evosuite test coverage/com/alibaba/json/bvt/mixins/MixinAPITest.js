var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":44,"id":65758,"methods":[{"el":43,"sc":5,"sl":32}],"name":"MixinAPITest","sl":8},{"el":22,"id":65758,"methods":[{"el":16,"sc":9,"sl":14},{"el":21,"sc":9,"sl":18}],"name":"MixinAPITest.BaseClass","sl":10},{"el":29,"id":65762,"methods":[],"name":"MixinAPITest.MixIn1","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4700":{"methods":[{"sl":18},{"sl":32}],"name":"test_mixIn_get_methods","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":33},{"sl":35},{"sl":36},{"sl":37},{"sl":39},{"sl":40},{"sl":42}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4700], [4700], [4700], [], [], [], [], [], [], [], [], [], [], [], [4700], [4700], [], [4700], [4700], [4700], [], [4700], [4700], [], [4700], [], [], []]
