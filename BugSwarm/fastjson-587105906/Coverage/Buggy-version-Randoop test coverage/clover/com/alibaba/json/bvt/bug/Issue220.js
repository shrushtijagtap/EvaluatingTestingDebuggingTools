var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":53,"id":56782,"methods":[{"el":20,"sc":5,"sl":11}],"name":"Issue220","sl":9},{"el":52,"id":56789,"methods":[{"el":30,"sc":9,"sl":28},{"el":34,"sc":9,"sl":32},{"el":38,"sc":9,"sl":36},{"el":42,"sc":9,"sl":40},{"el":46,"sc":9,"sl":44},{"el":50,"sc":9,"sl":48}],"name":"Issue220.Attr","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1820":{"methods":[{"sl":11},{"sl":28},{"sl":36},{"sl":44}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":17},{"sl":19},{"sl":29},{"sl":37},{"sl":45}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [1820], [1820], [1820], [1820], [1820], [], [1820], [], [1820], [], [], [], [], [], [], [], [], [1820], [1820], [], [], [], [], [], [], [1820], [1820], [], [], [], [], [], [], [1820], [1820], [], [], [], [], [], [], [], []]
