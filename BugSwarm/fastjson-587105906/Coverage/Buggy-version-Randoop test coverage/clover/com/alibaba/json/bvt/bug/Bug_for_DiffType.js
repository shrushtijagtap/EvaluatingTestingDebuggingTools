var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":51672,"methods":[{"el":17,"sc":5,"sl":10}],"name":"Bug_for_DiffType","sl":9},{"el":29,"id":51678,"methods":[{"el":24,"sc":9,"sl":22},{"el":28,"sc":9,"sl":26}],"name":"Bug_for_DiffType.Model","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4594":{"methods":[{"sl":10},{"sl":22},{"sl":26}],"name":"test_for_diff_type","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":14},{"sl":15},{"sl":16},{"sl":23},{"sl":27}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [4594], [4594], [4594], [], [4594], [4594], [4594], [], [], [], [], [], [4594], [4594], [], [], [4594], [4594], [], [], []]
