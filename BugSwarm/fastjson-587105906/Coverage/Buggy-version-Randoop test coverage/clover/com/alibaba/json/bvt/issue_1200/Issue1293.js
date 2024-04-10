var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":64,"id":60501,"methods":[{"el":25,"sc":5,"sl":12}],"name":"Issue1293","sl":10},{"el":55,"id":60509,"methods":[{"el":34,"sc":9,"sl":32},{"el":38,"sc":9,"sl":36},{"el":42,"sc":9,"sl":40},{"el":46,"sc":9,"sl":44},{"el":50,"sc":9,"sl":48},{"el":54,"sc":9,"sl":52}],"name":"Issue1293.Test","sl":27},{"el":59,"id":60521,"methods":[],"name":"Issue1293.IdType","sl":57},{"el":62,"id":60521,"methods":[],"name":"Issue1293.UserType","sl":60}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_231":{"methods":[{"sl":12},{"sl":36},{"sl":44},{"sl":52}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":15},{"sl":17},{"sl":18},{"sl":21},{"sl":22},{"sl":23},{"sl":37},{"sl":45},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [231], [231], [], [231], [], [231], [231], [], [], [231], [231], [231], [], [], [], [], [], [], [], [], [], [], [], [], [231], [231], [], [], [], [], [], [], [231], [231], [], [], [], [], [], [], [231], [231], [], [], [], [], [], [], [], [], [], [], []]
