var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":57,"id":60803,"methods":[{"el":17,"sc":5,"sl":11}],"name":"Issue1558","sl":10},{"el":56,"id":60808,"methods":[{"el":28,"sc":9,"sl":26},{"el":31,"sc":9,"sl":29},{"el":34,"sc":9,"sl":32},{"el":37,"sc":9,"sl":35},{"el":40,"sc":9,"sl":38},{"el":43,"sc":9,"sl":41},{"el":46,"sc":9,"sl":44},{"el":49,"sc":9,"sl":47},{"el":52,"sc":9,"sl":50},{"el":55,"sc":9,"sl":53}],"name":"Issue1558.Request","sl":20}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1031":{"methods":[{"sl":11},{"sl":29},{"sl":35},{"sl":41},{"sl":47},{"sl":53}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":16},{"sl":30},{"sl":36},{"sl":42},{"sl":48},{"sl":54}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [1031], [1031], [1031], [1031], [], [1031], [], [], [], [], [], [], [], [], [], [], [], [], [1031], [1031], [], [], [], [], [1031], [1031], [], [], [], [], [1031], [1031], [], [], [], [], [1031], [1031], [], [], [], [], [1031], [1031], [], [], []]
