var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":65672,"methods":[{"el":22,"sc":2,"sl":9},{"el":28,"sc":2,"sl":24}],"name":"Issue2430","sl":8},{"el":54,"id":65686,"methods":[{"el":36,"sc":3,"sl":34},{"el":40,"sc":3,"sl":38},{"el":44,"sc":3,"sl":42},{"el":48,"sc":3,"sl":46},{"el":53,"sc":3,"sl":50}],"name":"Issue2430.VO","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":9},{"sl":34},{"sl":38},{"sl":42},{"sl":46}],"name":"testForIssue","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":16},{"sl":17},{"sl":18},{"sl":20},{"sl":35},{"sl":39},{"sl":43},{"sl":47}]},"test_4815":{"methods":[{"sl":24},{"sl":38},{"sl":46},{"sl":50}],"name":"testForIssue2","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":39},{"sl":47},{"sl":52}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [0], [0], [0], [0], [0], [0], [], [0], [0], [0], [], [0], [], [], [], [4815], [4815], [4815], [4815], [], [], [], [], [], [], [0], [0], [], [], [4815, 0], [4815, 0], [], [], [0], [0], [], [], [4815, 0], [4815, 0], [], [], [4815], [], [4815], [], [], []]
