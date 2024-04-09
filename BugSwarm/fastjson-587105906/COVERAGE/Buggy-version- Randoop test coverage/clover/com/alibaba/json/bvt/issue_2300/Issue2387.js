var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":65519,"methods":[{"el":13,"sc":5,"sl":9}],"name":"Issue2387","sl":7},{"el":49,"id":65523,"methods":[{"el":23,"sc":9,"sl":20},{"el":28,"sc":9,"sl":25},{"el":33,"sc":9,"sl":30},{"el":38,"sc":9,"sl":35},{"el":43,"sc":9,"sl":40},{"el":48,"sc":9,"sl":45}],"name":"Issue2387.TestEntity","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1778":{"methods":[{"sl":9},{"sl":20},{"sl":25},{"sl":30},{"sl":35},{"sl":40},{"sl":45}],"name":"test_for_issue","pass":false,"statements":[{"sl":10},{"sl":11},{"sl":12},{"sl":22},{"sl":27},{"sl":32},{"sl":37},{"sl":42},{"sl":47}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [1778], [1778], [1778], [1778], [], [], [], [], [], [], [], [1778], [], [1778], [], [], [1778], [], [1778], [], [], [1778], [], [1778], [], [], [1778], [], [1778], [], [], [1778], [], [1778], [], [], [1778], [], [1778], [], [], []]
