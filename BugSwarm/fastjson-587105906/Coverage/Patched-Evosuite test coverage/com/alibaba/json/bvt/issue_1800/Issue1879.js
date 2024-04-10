var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":63,"id":62981,"methods":[{"el":24,"sc":5,"sl":19}],"name":"Issue1879","sl":11},{"el":44,"id":62984,"methods":[{"el":35,"sc":9,"sl":29},{"el":39,"sc":9,"sl":37},{"el":43,"sc":9,"sl":41}],"name":"Issue1879.M1","sl":26},{"el":62,"id":62992,"methods":[{"el":53,"sc":9,"sl":49},{"el":57,"sc":9,"sl":55},{"el":61,"sc":9,"sl":59}],"name":"Issue1879.M2","sl":46}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1472":{"methods":[{"sl":19},{"sl":49}],"name":"test_for_issue_2","pass":true,"statements":[{"sl":20},{"sl":23},{"sl":51},{"sl":52}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1472], [1472], [], [], [1472], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1472], [], [1472], [1472], [], [], [], [], [], [], [], [], [], [], []]
