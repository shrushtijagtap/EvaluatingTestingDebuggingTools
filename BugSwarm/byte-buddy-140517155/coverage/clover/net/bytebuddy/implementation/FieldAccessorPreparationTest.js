var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":42670,"methods":[{"el":34,"sc":5,"sl":31},{"el":42,"sc":5,"sl":36},{"el":48,"sc":5,"sl":44},{"el":54,"sc":5,"sl":50}],"name":"FieldAccessorPreparationTest","sl":17}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1776":{"methods":[{"sl":50}],"name":"testPreparationPropertyAccessor","pass":true,"statements":[{"sl":52},{"sl":53}]},"test_5500":{"methods":[{"sl":36}],"name":"testPreparationDefineField","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40},{"sl":41}]},"test_5526":{"methods":[{"sl":44}],"name":"testPreparationNoDefineField","pass":true,"statements":[{"sl":46},{"sl":47}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [5500], [], [5500], [5500], [5500], [5500], [], [], [5526], [], [5526], [5526], [], [], [1776], [], [1776], [1776], [], []]
