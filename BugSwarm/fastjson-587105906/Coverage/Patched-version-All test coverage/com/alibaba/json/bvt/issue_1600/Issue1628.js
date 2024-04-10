var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":36,"id":63398,"methods":[{"el":19,"sc":5,"sl":13},{"el":27,"sc":5,"sl":21},{"el":35,"sc":5,"sl":29}],"name":"Issue1628","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1242":{"methods":[{"sl":13}],"name":"test_toJSONBytes","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18}]},"test_1257":{"methods":[{"sl":21}],"name":"test_toJSONBytes_1","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26}]},"test_4212":{"methods":[{"sl":29}],"name":"test_toJSONBytes_2","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [1242], [1242], [1242], [1242], [1242], [1242], [], [], [1257], [1257], [1257], [1257], [1257], [1257], [], [], [4212], [4212], [4212], [4212], [4212], [4212], [], []]
