var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":48,"id":60327,"methods":[{"el":30,"sc":5,"sl":15}],"name":"Issue1254","sl":14},{"el":34,"id":60338,"methods":[],"name":"Issue1254.A","sl":32},{"el":47,"id":60338,"methods":[{"el":42,"sc":9,"sl":40},{"el":46,"sc":9,"sl":44}],"name":"Issue1254.B","sl":36}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2311":{"methods":[{"sl":15},{"sl":40},{"sl":44}],"name":"test_for_issue","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":22},{"sl":23},{"sl":26},{"sl":27},{"sl":28},{"sl":41},{"sl":45}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2311], [2311], [2311], [2311], [2311], [2311], [], [2311], [2311], [], [], [2311], [2311], [2311], [], [], [], [], [], [], [], [], [], [], [], [2311], [2311], [], [], [2311], [2311], [], [], []]
