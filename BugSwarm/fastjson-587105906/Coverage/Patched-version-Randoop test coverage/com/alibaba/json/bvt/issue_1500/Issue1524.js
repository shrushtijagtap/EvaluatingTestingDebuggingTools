var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":61767,"methods":[{"el":25,"sc":13,"sl":20},{"el":28,"sc":5,"sl":15}],"name":"Issue1524","sl":14},{"el":33,"id":61778,"methods":[],"name":"Issue1524.Model","sl":30},{"el":37,"id":61778,"methods":[],"name":"Issue1524.Value","sl":35},{"el":44,"id":61778,"methods":[{"el":43,"sc":9,"sl":41}],"name":"Issue1524.ValueSerializer","sl":39}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4165":{"methods":[{"sl":15},{"sl":20}],"name":"test_for_issue","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":19},{"sl":21},{"sl":22},{"sl":27}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4165], [4165], [4165], [], [4165], [4165], [4165], [4165], [], [], [], [], [4165], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
