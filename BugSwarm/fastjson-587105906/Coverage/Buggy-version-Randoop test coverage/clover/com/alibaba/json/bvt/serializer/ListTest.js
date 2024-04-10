var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":84222,"methods":[{"el":20,"sc":5,"sl":14}],"name":"ListTest","sl":12},{"el":34,"id":84227,"methods":[{"el":28,"sc":9,"sl":26},{"el":32,"sc":9,"sl":30}],"name":"ListTest.VO","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_223":{"methods":[{"sl":14}],"name":"test_null","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [223], [223], [223], [223], [], [223], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
