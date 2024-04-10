var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":27,"id":47627,"methods":[{"el":12,"sc":5,"sl":9}],"name":"TestFlase","sl":7},{"el":26,"id":47630,"methods":[{"el":20,"sc":9,"sl":18},{"el":24,"sc":9,"sl":22}],"name":"TestFlase.VO","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3721":{"methods":[{"sl":9},{"sl":22}],"name":"test_0","pass":false,"statements":[{"sl":10},{"sl":23}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [3721], [3721], [], [], [], [], [], [], [], [], [], [], [], [3721], [3721], [], [], [], []]
