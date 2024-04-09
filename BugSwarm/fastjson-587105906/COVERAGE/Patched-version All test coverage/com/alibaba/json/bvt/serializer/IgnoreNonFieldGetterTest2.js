var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":83273,"methods":[{"el":19,"sc":5,"sl":12}],"name":"IgnoreNonFieldGetterTest2","sl":10},{"el":36,"id":83278,"methods":[{"el":27,"sc":9,"sl":25},{"el":31,"sc":9,"sl":29},{"el":35,"sc":9,"sl":33}],"name":"IgnoreNonFieldGetterTest2.VO","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_444":{"methods":[{"sl":12},{"sl":25},{"sl":29}],"name":"test_int","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":16},{"sl":17},{"sl":26},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [444], [444], [444], [], [444], [444], [], [], [], [], [], [], [], [444], [444], [], [], [444], [444], [], [], [], [], [], [], []]
