var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":56510,"methods":[{"el":20,"sc":5,"sl":13}],"name":"Issue944","sl":12},{"el":29,"id":56515,"methods":[{"el":28,"sc":9,"sl":25}],"name":"Issue944.Model","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1277":{"methods":[{"sl":13}],"name":"test_for_issue","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":17},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [1277], [1277], [1277], [], [1277], [], [1277], [], [], [], [], [], [], [], [], [], [], []]
