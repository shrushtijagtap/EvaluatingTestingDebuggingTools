var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":72,"id":54564,"methods":[{"el":15,"sc":5,"sl":11},{"el":20,"sc":5,"sl":17},{"el":27,"sc":5,"sl":22}],"name":"Bug_for_yuanmomo_Issue_505_1","sl":9},{"el":54,"id":54575,"methods":[{"el":36,"sc":9,"sl":34},{"el":40,"sc":9,"sl":38},{"el":44,"sc":9,"sl":42},{"el":48,"sc":9,"sl":46},{"el":53,"sc":9,"sl":50}],"name":"Bug_for_yuanmomo_Issue_505_1.User","sl":29},{"el":71,"id":54585,"methods":[{"el":62,"sc":9,"sl":60},{"el":66,"sc":9,"sl":64},{"el":70,"sc":9,"sl":68}],"name":"Bug_for_yuanmomo_Issue_505_1.UserExt","sl":56}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2065":{"methods":[{"sl":11},{"sl":38},{"sl":46},{"sl":50},{"sl":64},{"sl":68}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":39},{"sl":47},{"sl":52},{"sl":65},{"sl":69}]},"test_2446":{"methods":[{"sl":22},{"sl":38},{"sl":46},{"sl":50},{"sl":64},{"sl":68}],"name":"test_for_issue_2","pass":true,"statements":[{"sl":23},{"sl":25},{"sl":26},{"sl":39},{"sl":47},{"sl":52},{"sl":65},{"sl":69}]},"test_4324":{"methods":[{"sl":17},{"sl":64}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":65}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [2065], [2065], [2065], [2065], [], [], [4324], [4324], [4324], [], [], [2446], [2446], [], [2446], [2446], [], [], [], [], [], [], [], [], [], [], [], [2446, 2065], [2446, 2065], [], [], [], [], [], [], [2446, 2065], [2446, 2065], [], [], [2446, 2065], [], [2446, 2065], [], [], [], [], [], [], [], [], [], [], [], [2446, 2065, 4324], [2446, 2065, 4324], [], [], [2446, 2065], [2446, 2065], [], [], []]
