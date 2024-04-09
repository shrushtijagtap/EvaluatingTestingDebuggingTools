var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":81493,"methods":[{"el":16,"sc":5,"sl":13},{"el":20,"sc":5,"sl":18}],"name":"RefTest","sl":11},{"el":34,"id":81498,"methods":[{"el":28,"sc":9,"sl":26},{"el":32,"sc":9,"sl":30}],"name":"RefTest.A","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2653":{"methods":[{"sl":13}],"name":"test_ref","pass":true,"statements":[{"sl":14},{"sl":15}]},"test_4237":{"methods":[{"sl":18},{"sl":26}],"name":"test_array_ref","pass":true,"statements":[{"sl":19},{"sl":27}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [2653], [2653], [2653], [], [], [4237], [4237], [], [], [], [], [], [], [4237], [4237], [], [], [], [], [], [], [], []]
