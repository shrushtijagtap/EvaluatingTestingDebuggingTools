var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":21,"id":54225,"methods":[{"el":15,"sc":5,"sl":12},{"el":20,"sc":5,"sl":17}],"name":"Bug_for_jiangwei1","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4019":{"methods":[{"sl":12}],"name":"test_double","pass":true,"statements":[{"sl":13},{"sl":14}]},"test_4795":{"methods":[{"sl":17}],"name":"test_JSONArray_double","pass":true,"statements":[{"sl":18},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [4019], [4019], [4019], [], [], [4795], [4795], [4795], [], []]
