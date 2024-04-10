var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":45754,"methods":[{"el":11,"sc":5,"sl":9}],"name":"OverriadeTest","sl":7},{"el":25,"id":45756,"methods":[{"el":19,"sc":9,"sl":17},{"el":23,"sc":9,"sl":21}],"name":"OverriadeTest.A","sl":13},{"el":31,"id":45760,"methods":[{"el":30,"sc":9,"sl":28}],"name":"OverriadeTest.B","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1812":{"methods":[{"sl":9},{"sl":28}],"name":"test_override","pass":true,"statements":[{"sl":10},{"sl":29}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [1812], [1812], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1812], [1812], [], [], []]
