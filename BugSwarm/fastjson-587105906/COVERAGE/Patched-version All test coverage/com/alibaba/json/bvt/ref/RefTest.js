var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":81608,"methods":[{"el":16,"sc":5,"sl":13},{"el":20,"sc":5,"sl":18}],"name":"RefTest","sl":11},{"el":34,"id":81613,"methods":[{"el":28,"sc":9,"sl":26},{"el":32,"sc":9,"sl":30}],"name":"RefTest.A","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3121":{"methods":[{"sl":18},{"sl":26}],"name":"test_array_ref","pass":true,"statements":[{"sl":19},{"sl":27}]},"test_4164":{"methods":[{"sl":13}],"name":"test_ref","pass":true,"statements":[{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [4164], [4164], [4164], [], [], [3121], [3121], [], [], [], [], [], [], [3121], [3121], [], [], [], [], [], [], [], []]
