var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":42500,"methods":[{"el":22,"sc":5,"sl":15}],"name":"ChineseSpaceTest","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3533":{"methods":[{"sl":15}],"name":"test_for_chinese_space","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":20},{"sl":21}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3533], [3533], [3533], [3533], [], [3533], [3533], [], []]
