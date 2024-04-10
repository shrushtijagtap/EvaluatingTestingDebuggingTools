var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":90,"id":60354,"methods":[{"el":36,"sc":13,"sl":19},{"el":40,"sc":13,"sl":38},{"el":48,"sc":5,"sl":17}],"name":"Issue1233","sl":16},{"el":56,"id":60383,"methods":[],"name":"Issue1233.Area","sl":50},{"el":68,"id":60383,"methods":[{"el":67,"sc":9,"sl":65}],"name":"Issue1233.Section","sl":58},{"el":77,"id":60385,"methods":[{"el":76,"sc":9,"sl":74}],"name":"Issue1233.FloorV1","sl":70},{"el":89,"id":60387,"methods":[{"el":88,"sc":9,"sl":86}],"name":"Issue1233.FloorV2","sl":79}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2804":{"methods":[{"sl":17},{"sl":19}],"name":"test_for_issue","pass":true,"statements":[{"sl":18},{"sl":20},{"sl":21},{"sl":23},{"sl":24},{"sl":28},{"sl":30},{"sl":32},{"sl":33},{"sl":43},{"sl":45},{"sl":46},{"sl":47}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2804], [2804], [2804], [2804], [2804], [], [2804], [2804], [], [], [], [2804], [], [2804], [], [2804], [2804], [], [], [], [], [], [], [], [], [], [2804], [], [2804], [2804], [2804], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
