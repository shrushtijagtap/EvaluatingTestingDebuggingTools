var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":21,"id":54214,"methods":[{"el":15,"sc":5,"sl":12},{"el":20,"sc":5,"sl":17}],"name":"Bug_for_jiangwei1","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1926":{"methods":[{"sl":12}],"name":"test_double","pass":true,"statements":[{"sl":13},{"sl":14}]},"test_1965":{"methods":[{"sl":17}],"name":"test_JSONArray_double","pass":true,"statements":[{"sl":18},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [1926], [1926], [1926], [], [], [1965], [1965], [1965], [], []]
