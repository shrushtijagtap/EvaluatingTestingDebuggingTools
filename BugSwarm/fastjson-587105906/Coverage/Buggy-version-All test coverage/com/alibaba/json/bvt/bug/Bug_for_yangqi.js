var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":49,"id":55671,"methods":[{"el":14,"sc":5,"sl":12}],"name":"Bug_for_yangqi","sl":10},{"el":40,"id":55673,"methods":[{"el":23,"sc":9,"sl":21},{"el":27,"sc":9,"sl":25},{"el":32,"sc":9,"sl":30},{"el":37,"sc":9,"sl":35}],"name":"Bug_for_yangqi.A","sl":16},{"el":44,"id":55681,"methods":[],"name":"Bug_for_yangqi.B","sl":42},{"el":48,"id":55681,"methods":[],"name":"Bug_for_yangqi.Value","sl":46}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_752":{"methods":[{"sl":12},{"sl":25},{"sl":35}],"name":"test_for_bug","pass":true,"statements":[{"sl":13},{"sl":26},{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [752], [752], [], [], [], [], [], [], [], [], [], [], [], [752], [752], [], [], [], [], [], [], [], [], [752], [752], [], [], [], [], [], [], [], [], [], [], [], [], []]
