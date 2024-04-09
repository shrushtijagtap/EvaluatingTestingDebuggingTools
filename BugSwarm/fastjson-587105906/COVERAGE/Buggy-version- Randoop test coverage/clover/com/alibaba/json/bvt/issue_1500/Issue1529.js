var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":31,"id":61787,"methods":[{"el":13,"sc":5,"sl":7}],"name":"Issue1529","sl":6},{"el":30,"id":61793,"methods":[{"el":22,"sc":9,"sl":20},{"el":29,"sc":9,"sl":24}],"name":"Issue1529.Person","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3309":{"methods":[{"sl":7}],"name":"test_for_issue","pass":false,"statements":[{"sl":8},{"sl":9}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [3309], [3309], [3309], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
