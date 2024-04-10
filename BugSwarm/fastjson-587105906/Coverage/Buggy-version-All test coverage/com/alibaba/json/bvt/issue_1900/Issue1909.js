var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":64318,"methods":[{"el":18,"sc":5,"sl":11}],"name":"Issue1909","sl":10},{"el":45,"id":64325,"methods":[{"el":32,"sc":9,"sl":28},{"el":36,"sc":9,"sl":34},{"el":40,"sc":9,"sl":38},{"el":44,"sc":9,"sl":42}],"name":"Issue1909.ParamRequest","sl":20},{"el":49,"id":64335,"methods":[],"name":"Issue1909.Request","sl":47}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2209":{"methods":[{"sl":11},{"sl":28},{"sl":34},{"sl":38},{"sl":42}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":29},{"sl":30},{"sl":31},{"sl":35},{"sl":39},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [2209], [2209], [2209], [2209], [2209], [2209], [2209], [], [], [], [], [], [], [], [], [], [], [2209], [2209], [2209], [2209], [], [], [2209], [2209], [], [], [2209], [2209], [], [], [2209], [2209], [], [], [], [], [], [], []]
