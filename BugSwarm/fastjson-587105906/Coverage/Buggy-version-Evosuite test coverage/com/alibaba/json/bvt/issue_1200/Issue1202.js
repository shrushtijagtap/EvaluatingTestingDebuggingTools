var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":39,"id":60260,"methods":[{"el":18,"sc":5,"sl":15},{"el":25,"sc":5,"sl":20}],"name":"Issue1202","sl":14},{"el":38,"id":60267,"methods":[{"el":33,"sc":9,"sl":31},{"el":37,"sc":9,"sl":35}],"name":"Issue1202.Model","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1708":{"methods":[{"sl":20},{"sl":35}],"name":"test_for_issue","pass":true,"statements":[{"sl":21},{"sl":22},{"sl":23},{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1708], [1708], [1708], [1708], [], [], [], [], [], [], [], [], [], [], [], [1708], [1708], [], [], []]
