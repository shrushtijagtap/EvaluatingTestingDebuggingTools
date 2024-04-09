var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":47,"id":65456,"methods":[{"el":27,"sc":5,"sl":13}],"name":"Issue2351","sl":12},{"el":34,"id":65462,"methods":[],"name":"Issue2351.Bean1","sl":29},{"el":46,"id":65462,"methods":[{"el":41,"sc":9,"sl":39},{"el":45,"sc":9,"sl":43}],"name":"Issue2351.Bean2","sl":36}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1936":{"methods":[{"sl":13}],"name":"test_for_issue","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":21},{"sl":22},{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [1936], [], [], [1936], [1936], [], [], [], [1936], [1936], [], [], [], [1936], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
