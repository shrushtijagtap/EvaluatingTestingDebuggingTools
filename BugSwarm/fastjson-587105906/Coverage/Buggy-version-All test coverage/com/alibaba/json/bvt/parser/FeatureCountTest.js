var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":12,"id":68976,"methods":[{"el":11,"sc":5,"sl":7}],"name":"FeatureCountTest","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2060":{"methods":[{"sl":7}],"name":"testZ_0","pass":true,"statements":[{"sl":8},{"sl":9},{"sl":10}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [2060], [2060], [2060], [2060], [], []]
