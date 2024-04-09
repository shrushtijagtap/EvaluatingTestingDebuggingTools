var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":75608,"methods":[{"el":19,"sc":5,"sl":14}],"name":"TestEnum","sl":8},{"el":12,"id":75608,"methods":[],"name":"TestEnum.Type","sl":10},{"el":33,"id":75613,"methods":[{"el":27,"sc":9,"sl":25},{"el":31,"sc":9,"sl":29}],"name":"TestEnum.VO","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_876":{"methods":[{"sl":14},{"sl":25},{"sl":29}],"name":"test_enum","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":26},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [876], [876], [876], [876], [876], [], [], [], [], [], [], [876], [876], [], [], [876], [876], [], [], [], []]
