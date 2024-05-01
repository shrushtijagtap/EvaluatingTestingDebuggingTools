var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":24,"id":52264,"methods":[{"el":13,"sc":5,"sl":10},{"el":18,"sc":5,"sl":15},{"el":23,"sc":5,"sl":20}],"name":"NullMatcherTest","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3231":{"methods":[{"sl":15}],"name":"testMatch","pass":true,"statements":[{"sl":17}]},"test_3316":{"methods":[{"sl":20}],"name":"testPositiveToNegative","pass":true,"statements":[{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3231], [], [3231], [], [], [3316], [], [3316], [], []]
