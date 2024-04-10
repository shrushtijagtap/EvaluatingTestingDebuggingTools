var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":49,"id":63314,"methods":[{"el":14,"sc":5,"sl":11},{"el":19,"sc":5,"sl":16},{"el":24,"sc":5,"sl":21}],"name":"Issue1603_getter","sl":10},{"el":32,"id":63323,"methods":[{"el":31,"sc":9,"sl":29}],"name":"Issue1603_getter.Model_1","sl":26},{"el":40,"id":63325,"methods":[{"el":39,"sc":9,"sl":37}],"name":"Issue1603_getter.Model_2","sl":34},{"el":48,"id":63327,"methods":[{"el":47,"sc":9,"sl":45}],"name":"Issue1603_getter.Model_3","sl":42}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1275":{"methods":[{"sl":21},{"sl":45}],"name":"test_unmodifier","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":46}]},"test_229":{"methods":[{"sl":16},{"sl":37}],"name":"test_emptyList","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":38}]},"test_267":{"methods":[{"sl":11},{"sl":29}],"name":"test_emptySet","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [267], [267], [267], [], [], [229], [229], [229], [], [], [1275], [1275], [1275], [], [], [], [], [], [267], [267], [], [], [], [], [], [], [229], [229], [], [], [], [], [], [], [1275], [1275], [], [], []]
