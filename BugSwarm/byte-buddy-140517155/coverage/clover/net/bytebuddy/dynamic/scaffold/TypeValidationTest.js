var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":40734,"methods":[{"el":22,"sc":5,"sl":16},{"el":31,"sc":5,"sl":28},{"el":36,"sc":5,"sl":33},{"el":41,"sc":5,"sl":38}],"name":"TypeValidationTest","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2030":{"methods":[{"sl":33}],"name":"testIsEnabled","pass":true,"statements":[{"sl":35}]},"test_3383":{"methods":[{"sl":38}],"name":"testReceival","pass":true,"statements":[{"sl":40}]},"test_4555":{"methods":[{"sl":38}],"name":"testReceival","pass":true,"statements":[{"sl":40}]},"test_5256":{"methods":[{"sl":33}],"name":"testIsEnabled","pass":true,"statements":[{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [5256, 2030], [], [5256, 2030], [], [], [3383, 4555], [], [3383, 4555], [], []]
