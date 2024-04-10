var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":31,"id":86141,"methods":[{"el":16,"sc":5,"sl":10}],"name":"TestPivateStaticClass","sl":8},{"el":30,"id":86146,"methods":[{"el":24,"sc":9,"sl":22},{"el":28,"sc":9,"sl":26}],"name":"TestPivateStaticClass.VO","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3201":{"methods":[{"sl":10},{"sl":22},{"sl":26}],"name":"test_inner","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":15},{"sl":23},{"sl":27}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [3201], [3201], [3201], [3201], [], [3201], [], [], [], [], [], [], [3201], [3201], [], [], [3201], [3201], [], [], [], []]
