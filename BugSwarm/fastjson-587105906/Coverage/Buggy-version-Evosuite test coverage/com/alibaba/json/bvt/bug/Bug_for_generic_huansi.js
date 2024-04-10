var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":53006,"methods":[{"el":21,"sc":5,"sl":10}],"name":"Bug_for_generic_huansi","sl":9},{"el":35,"id":53013,"methods":[{"el":29,"sc":9,"sl":27},{"el":33,"sc":9,"sl":31}],"name":"Bug_for_generic_huansi.BaseGenericType","sl":23},{"el":38,"id":53017,"methods":[],"name":"Bug_for_generic_huansi.ExtendGenericType","sl":37},{"el":41,"id":53017,"methods":[],"name":"Bug_for_generic_huansi.SimpleGenericObject","sl":40}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3762":{"methods":[{"sl":10},{"sl":27},{"sl":31}],"name":"test_for_issue","pass":true,"statements":[{"sl":11},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":28},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [3762], [3762], [], [3762], [], [3762], [3762], [3762], [], [], [], [], [], [], [], [], [], [3762], [3762], [], [], [3762], [3762], [], [], [], [], [], [], [], [], [], [], []]
