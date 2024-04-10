var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":60376,"methods":[{"el":21,"sc":13,"sl":18},{"el":33,"sc":5,"sl":12}],"name":"Issue1271","sl":11},{"el":37,"id":60389,"methods":[],"name":"Issue1271.A","sl":35},{"el":49,"id":60389,"methods":[{"el":44,"sc":9,"sl":42},{"el":48,"sc":9,"sl":46}],"name":"Issue1271.B","sl":39}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_924":{"methods":[{"sl":12}],"name":"test_for_issue","pass":false,"statements":[{"sl":14},{"sl":16},{"sl":17},{"sl":25}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [924], [], [924], [], [924], [924], [], [], [], [], [], [], [], [924], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
