var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":74,"id":61589,"methods":[{"el":19,"sc":5,"sl":11}],"name":"Issue1486","sl":10},{"el":43,"id":61594,"methods":[{"el":30,"sc":9,"sl":28},{"el":34,"sc":9,"sl":32},{"el":38,"sc":9,"sl":36},{"el":42,"sc":9,"sl":40}],"name":"Issue1486.Value","sl":21},{"el":73,"id":61602,"methods":[{"el":52,"sc":9,"sl":50},{"el":56,"sc":9,"sl":54},{"el":60,"sc":9,"sl":58},{"el":64,"sc":9,"sl":62},{"el":72,"sc":9,"sl":66}],"name":"Issue1486.Value2","sl":45}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2460":{"methods":[{"sl":11},{"sl":32},{"sl":40},{"sl":54},{"sl":62},{"sl":66}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":16},{"sl":17},{"sl":33},{"sl":41},{"sl":55},{"sl":63},{"sl":68}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [2460], [], [2460], [2460], [], [2460], [2460], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2460], [2460], [], [], [], [], [], [], [2460], [2460], [], [], [], [], [], [], [], [], [], [], [], [], [2460], [2460], [], [], [], [], [], [], [2460], [2460], [], [], [2460], [], [2460], [], [], [], [], [], []]
