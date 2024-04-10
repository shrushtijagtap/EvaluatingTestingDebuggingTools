var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":58235,"methods":[{"el":18,"sc":5,"sl":15},{"el":34,"sc":5,"sl":20},{"el":39,"sc":5,"sl":36}],"name":"DateTest","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1612":{"methods":[{"sl":20}],"name":"test_date","pass":true,"statements":[{"sl":21},{"sl":22},{"sl":24},{"sl":25},{"sl":27},{"sl":29},{"sl":31}]},"test_3265":{"methods":[{"sl":36}],"name":"test_parse","pass":true,"statements":[{"sl":37},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1612], [1612], [1612], [], [1612], [1612], [], [1612], [], [1612], [], [1612], [], [], [], [], [3265], [3265], [3265], [], []]
