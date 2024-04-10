var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":44,"id":61268,"methods":[{"el":25,"sc":5,"sl":15}],"name":"Issue1400","sl":14},{"el":31,"id":61278,"methods":[],"name":"Issue1400.Resource","sl":27},{"el":35,"id":61278,"methods":[],"name":"Issue1400.App","sl":33},{"el":43,"id":61278,"methods":[{"el":42,"sc":9,"sl":40}],"name":"Issue1400.Test","sl":37}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2656":{"methods":[{"sl":15},{"sl":40}],"name":"test_for_issue","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":41}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2656], [2656], [2656], [2656], [2656], [2656], [2656], [2656], [2656], [2656], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2656], [2656], [], [], []]
