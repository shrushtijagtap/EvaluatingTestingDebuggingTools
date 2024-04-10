var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":58,"id":77121,"methods":[{"el":13,"sc":5,"sl":10}],"name":"GenericTest","sl":8},{"el":33,"id":77124,"methods":[{"el":20,"sc":9,"sl":18},{"el":26,"sc":9,"sl":24},{"el":32,"sc":9,"sl":30}],"name":"GenericTest.A","sl":15},{"el":43,"id":77129,"methods":[{"el":37,"sc":9,"sl":36},{"el":42,"sc":9,"sl":39}],"name":"GenericTest.B","sl":35},{"el":57,"id":77133,"methods":[{"el":50,"sc":9,"sl":48},{"el":55,"sc":9,"sl":53}],"name":"GenericTest.C","sl":45}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2232":{"methods":[{"sl":10},{"sl":18},{"sl":30},{"sl":36},{"sl":39}],"name":"test_0","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":31},{"sl":40},{"sl":41}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [2232], [2232], [2232], [], [], [], [], [], [2232], [], [], [], [], [], [], [], [], [], [], [], [2232], [2232], [], [], [], [], [2232], [], [], [2232], [2232], [2232], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
