var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":94727,"methods":[{"el":16,"sc":5,"sl":14},{"el":20,"sc":5,"sl":18},{"el":24,"sc":5,"sl":22}],"name":"ErrorObjectSerializer","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2313":{"methods":[{"sl":14}],"name":"test_0","pass":true,"statements":[{"sl":15}]},"test_675":{"methods":[{"sl":14}],"name":"test_error","pass":true,"statements":[{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [2313, 675], [2313, 675], [], [], [], [], [], [], [], [], [], [], []]
