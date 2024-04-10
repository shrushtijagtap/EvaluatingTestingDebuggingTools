var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":63335,"methods":[{"el":14,"sc":5,"sl":11},{"el":19,"sc":5,"sl":16}],"name":"Issue1603_map_getter","sl":10},{"el":27,"id":63341,"methods":[{"el":26,"sc":9,"sl":24}],"name":"Issue1603_map_getter.Model_1","sl":21},{"el":35,"id":63343,"methods":[{"el":34,"sc":9,"sl":32}],"name":"Issue1603_map_getter.Model_2","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1825":{"methods":[{"sl":11},{"sl":24}],"name":"test_emptyMap","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":25}]},"test_3226":{"methods":[{"sl":16},{"sl":32}],"name":"test_unmodifiableMap","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [1825], [1825], [1825], [], [], [3226], [3226], [3226], [], [], [], [], [], [1825], [1825], [], [], [], [], [], [], [3226], [3226], [], [], [], []]
