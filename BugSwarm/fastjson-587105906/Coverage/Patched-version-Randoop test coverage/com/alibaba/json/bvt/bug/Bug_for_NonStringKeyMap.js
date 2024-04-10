var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":52060,"methods":[{"el":15,"sc":5,"sl":13},{"el":25,"sc":5,"sl":17},{"el":36,"sc":5,"sl":27}],"name":"Bug_for_NonStringKeyMap","sl":12},{"el":50,"id":52077,"methods":[{"el":44,"sc":9,"sl":42},{"el":48,"sc":9,"sl":46}],"name":"Bug_for_NonStringKeyMap.VO","sl":38},{"el":54,"id":52081,"methods":[],"name":"Bug_for_NonStringKeyMap.VAL","sl":52}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4344":{"methods":[{"sl":17},{"sl":42},{"sl":46}],"name":"test_bug","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":21},{"sl":22},{"sl":24},{"sl":43},{"sl":47}]},"test_4347":{"methods":[{"sl":27}],"name":"test_1","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4344], [4344], [4344], [], [4344], [4344], [], [4344], [], [], [4347], [4347], [4347], [4347], [4347], [4347], [4347], [4347], [4347], [], [], [], [], [], [], [4344], [4344], [], [], [4344], [4344], [], [], [], [], [], [], [], []]
