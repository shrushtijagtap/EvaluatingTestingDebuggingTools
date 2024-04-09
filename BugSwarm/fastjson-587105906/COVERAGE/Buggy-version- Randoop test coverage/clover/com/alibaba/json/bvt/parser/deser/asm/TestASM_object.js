var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":76247,"methods":[{"el":16,"sc":5,"sl":10}],"name":"TestASM_object","sl":8},{"el":30,"id":76252,"methods":[{"el":24,"sc":9,"sl":22},{"el":28,"sc":9,"sl":26}],"name":"TestASM_object.V0","sl":18},{"el":44,"id":76256,"methods":[{"el":38,"sc":9,"sl":36},{"el":42,"sc":9,"sl":40}],"name":"TestASM_object.V1","sl":32}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1568":{"methods":[{"sl":10},{"sl":22},{"sl":26},{"sl":36},{"sl":40}],"name":"test_asm","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":15},{"sl":23},{"sl":27},{"sl":37},{"sl":41}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [1568], [1568], [1568], [1568], [], [1568], [], [], [], [], [], [], [1568], [1568], [], [], [1568], [1568], [], [], [], [], [], [], [], [], [1568], [1568], [], [], [1568], [1568], [], [], [], []]
