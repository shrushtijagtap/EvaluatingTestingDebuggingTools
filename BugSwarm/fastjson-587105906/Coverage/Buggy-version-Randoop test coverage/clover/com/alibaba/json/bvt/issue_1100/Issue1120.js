var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":59922,"methods":[{"el":16,"sc":5,"sl":11}],"name":"Issue1120","sl":10},{"el":29,"id":59926,"methods":[{"el":24,"sc":9,"sl":22},{"el":28,"sc":9,"sl":26}],"name":"Issue1120.Model","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3529":{"methods":[{"sl":11},{"sl":22},{"sl":26}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":15},{"sl":23},{"sl":27}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3529], [3529], [3529], [], [3529], [], [], [], [], [], [], [3529], [3529], [], [], [3529], [3529], [], [], []]
