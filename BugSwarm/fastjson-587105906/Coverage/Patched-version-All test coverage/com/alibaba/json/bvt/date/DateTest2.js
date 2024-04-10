var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":59490,"methods":[{"el":15,"sc":5,"sl":13},{"el":19,"sc":5,"sl":17},{"el":29,"sc":5,"sl":21}],"name":"DateTest2","sl":11},{"el":41,"id":59501,"methods":[{"el":36,"sc":9,"sl":34},{"el":40,"sc":9,"sl":38}],"name":"DateTest2.TestBean","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2518":{"methods":[{"sl":21},{"sl":34},{"sl":38}],"name":"test_date","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":27},{"sl":28},{"sl":35},{"sl":39}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2518], [2518], [2518], [2518], [2518], [], [2518], [2518], [], [], [], [], [], [2518], [2518], [], [], [2518], [2518], [], [], []]
