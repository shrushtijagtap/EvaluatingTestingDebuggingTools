var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":70,"id":40428,"methods":[{"el":53,"sc":5,"sl":50},{"el":58,"sc":5,"sl":55},{"el":63,"sc":5,"sl":60},{"el":69,"sc":5,"sl":65}],"name":"DiffTest","sl":27},{"el":48,"id":40428,"methods":[{"el":37,"sc":9,"sl":35},{"el":42,"sc":9,"sl":39},{"el":47,"sc":9,"sl":44}],"name":"DiffTest.BooleanDiff","sl":32}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2206":{"methods":[{"sl":50}],"name":"testCannotModify","pass":true,"statements":[{"sl":52}]},"test_2723":{"methods":[{"sl":60}],"name":"testGetType","pass":true,"statements":[{"sl":62}]},"test_299":{"methods":[{"sl":55}],"name":"testGetFieldName","pass":true,"statements":[{"sl":57}]},"test_569":{"methods":[{"sl":39},{"sl":44},{"sl":65}],"name":"testToString","pass":true,"statements":[{"sl":41},{"sl":46},{"sl":67}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [569], [], [569], [], [], [569], [], [569], [], [], [], [2206], [], [2206], [], [], [299], [], [299], [], [], [2723], [], [2723], [], [], [569], [], [569], [], [], []]
