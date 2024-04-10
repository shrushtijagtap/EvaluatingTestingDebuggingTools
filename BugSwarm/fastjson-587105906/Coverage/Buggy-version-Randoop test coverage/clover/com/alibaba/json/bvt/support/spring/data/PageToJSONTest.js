var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":90572,"methods":[{"el":27,"sc":5,"sl":16}],"name":"PageToJSONTest","sl":15},{"el":39,"id":90579,"methods":[{"el":34,"sc":9,"sl":32},{"el":38,"sc":9,"sl":36}],"name":"PageToJSONTest.Post","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3240":{"methods":[{"sl":16},{"sl":36}],"name":"test_page","pass":true,"statements":[{"sl":17},{"sl":19},{"sl":22},{"sl":24},{"sl":25},{"sl":26},{"sl":37}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3240], [3240], [], [3240], [], [], [3240], [], [3240], [3240], [3240], [], [], [], [], [], [], [], [], [], [3240], [3240], [], [], []]
