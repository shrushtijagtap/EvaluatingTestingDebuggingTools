var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":25,"id":51970,"methods":[{"el":13,"sc":5,"sl":10},{"el":19,"sc":5,"sl":15},{"el":24,"sc":5,"sl":21}],"name":"EqualityMatcherTest","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1076":{"methods":[{"sl":21}],"name":"testNoMatch","pass":true,"statements":[{"sl":23}]},"test_3617":{"methods":[{"sl":15}],"name":"testMatch","pass":true,"statements":[{"sl":17},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3617], [], [3617], [3617], [], [], [1076], [], [1076], [], []]
