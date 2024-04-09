var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":59719,"methods":[{"el":20,"sc":5,"sl":11}],"name":"LongTest","sl":9},{"el":33,"id":59725,"methods":[{"el":28,"sc":9,"sl":26},{"el":32,"sc":9,"sl":30}],"name":"LongTest.VO","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2199":{"methods":[{"sl":11},{"sl":26},{"sl":30}],"name":"test_0","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":16},{"sl":17},{"sl":19},{"sl":27},{"sl":31}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [2199], [], [2199], [2199], [], [2199], [2199], [], [2199], [], [], [], [], [], [], [2199], [2199], [], [], [2199], [2199], [], [], []]
