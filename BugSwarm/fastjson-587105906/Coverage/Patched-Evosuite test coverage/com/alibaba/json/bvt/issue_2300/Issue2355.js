var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":33,"id":64349,"methods":[{"el":18,"sc":5,"sl":11}],"name":"Issue2355","sl":10},{"el":32,"id":64355,"methods":[{"el":27,"sc":9,"sl":25},{"el":31,"sc":9,"sl":29}],"name":"Issue2355.VO","sl":20}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1149":{"methods":[{"sl":11},{"sl":25},{"sl":29}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":17},{"sl":26},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [1149], [1149], [1149], [1149], [1149], [], [1149], [], [], [], [], [], [], [], [1149], [1149], [], [], [1149], [1149], [], [], []]
