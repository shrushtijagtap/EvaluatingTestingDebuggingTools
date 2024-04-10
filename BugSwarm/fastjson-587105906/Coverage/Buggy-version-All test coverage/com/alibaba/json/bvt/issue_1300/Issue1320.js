var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":76,"id":60786,"methods":[{"el":14,"sc":5,"sl":11}],"name":"Issue1320","sl":10},{"el":71,"id":60789,"methods":[{"el":38,"sc":9,"sl":36},{"el":42,"sc":9,"sl":40},{"el":46,"sc":9,"sl":44},{"el":50,"sc":9,"sl":48},{"el":54,"sc":9,"sl":52},{"el":62,"sc":9,"sl":59},{"el":66,"sc":9,"sl":64},{"el":70,"sc":9,"sl":68}],"name":"Issue1320.SSOToken","sl":17},{"el":75,"id":60804,"methods":[],"name":"Issue1320.Token","sl":73}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3014":{"methods":[{"sl":11},{"sl":36},{"sl":40},{"sl":48},{"sl":59},{"sl":64}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":41},{"sl":49},{"sl":61},{"sl":65}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3014], [3014], [3014], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3014], [], [], [], [3014], [3014], [], [], [], [], [], [], [3014], [3014], [], [], [], [], [], [], [], [], [], [3014], [], [3014], [], [], [3014], [3014], [], [], [], [], [], [], [], [], [], [], []]
