var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":28,"id":90253,"methods":[{"el":19,"sc":5,"sl":11},{"el":27,"sc":5,"sl":21}],"name":"MoneyTest","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3277":{"methods":[{"sl":21}],"name":"test_compatible","pass":false,"statements":[{"sl":22},{"sl":24}]},"test_85":{"methods":[{"sl":11}],"name":"test_for_issue","pass":false,"statements":[{"sl":12},{"sl":14},{"sl":15},{"sl":16}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [85], [85], [], [85], [85], [85], [], [], [], [], [3277], [3277], [], [3277], [], [], [], []]
