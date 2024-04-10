var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":51,"id":64033,"methods":[{"el":25,"sc":5,"sl":21},{"el":36,"sc":5,"sl":28},{"el":50,"sc":5,"sl":39}],"name":"TestIssue1763_2","sl":17}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_183":{"methods":[{"sl":28}],"name":"testFixBug1763_2","pass":true,"statements":[{"sl":30},{"sl":32},{"sl":33},{"sl":34},{"sl":35}]},"test_3911":{"methods":[{"sl":39}],"name":"testBug1763_2","pass":true,"statements":[{"sl":41},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [183], [], [183], [], [183], [183], [183], [183], [], [], [], [3911], [], [3911], [], [3911], [3911], [3911], [3911], [], [3911], [], [], []]
