var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":75,"id":65480,"methods":[{"el":29,"sc":5,"sl":11}],"name":"Issue2358","sl":9},{"el":53,"id":65488,"methods":[{"el":38,"sc":9,"sl":36},{"el":42,"sc":9,"sl":40},{"el":46,"sc":9,"sl":44},{"el":50,"sc":9,"sl":48}],"name":"Issue2358.TestJson","sl":31},{"el":74,"id":65496,"methods":[{"el":61,"sc":9,"sl":59},{"el":65,"sc":9,"sl":63},{"el":69,"sc":9,"sl":67},{"el":73,"sc":9,"sl":71}],"name":"Issue2358.TestJson2","sl":55}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1272":{"methods":[{"sl":11}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":21},{"sl":22},{"sl":23},{"sl":25},{"sl":27},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [1272], [1272], [], [], [], [], [], [], [], [], [1272], [1272], [1272], [], [1272], [], [1272], [1272], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
