var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":27,"id":63992,"methods":[{"el":14,"sc":5,"sl":11},{"el":22,"sc":5,"sl":16}],"name":"Issue1772","sl":10},{"el":26,"id":64000,"methods":[],"name":"Issue1772.Model","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1212":{"methods":[{"sl":11}],"name":"test_0","pass":true,"statements":[{"sl":12},{"sl":13}]},"test_4577":{"methods":[{"sl":16}],"name":"test_1","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":20},{"sl":21}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [1212], [1212], [1212], [], [], [4577], [4577], [4577], [], [4577], [4577], [], [], [], [], [], []]
