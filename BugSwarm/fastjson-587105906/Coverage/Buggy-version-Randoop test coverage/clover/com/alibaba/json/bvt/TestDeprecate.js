var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":47462,"methods":[{"el":14,"sc":5,"sl":9}],"name":"TestDeprecate","sl":7},{"el":40,"id":47466,"methods":[{"el":22,"sc":9,"sl":20},{"el":26,"sc":9,"sl":24},{"el":34,"sc":9,"sl":32},{"el":39,"sc":9,"sl":36}],"name":"TestDeprecate.VO","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2095":{"methods":[{"sl":9},{"sl":20},{"sl":24},{"sl":32},{"sl":36}],"name":"test_0","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":13},{"sl":21},{"sl":25},{"sl":33},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [2095], [2095], [2095], [], [2095], [], [], [], [], [], [], [2095], [2095], [], [], [2095], [2095], [], [], [], [], [], [], [2095], [2095], [], [], [2095], [], [2095], [], [], [], []]
