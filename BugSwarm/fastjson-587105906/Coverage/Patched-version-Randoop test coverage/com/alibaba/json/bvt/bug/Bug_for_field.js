var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":52678,"methods":[{"el":18,"sc":5,"sl":11}],"name":"Bug_for_field","sl":9},{"el":33,"id":52683,"methods":[{"el":27,"sc":9,"sl":25},{"el":31,"sc":9,"sl":29}],"name":"Bug_for_field.VO","sl":20}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4781":{"methods":[{"sl":11},{"sl":25},{"sl":29}],"name":"test_annotation","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":15},{"sl":17},{"sl":26},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [4781], [4781], [4781], [], [4781], [], [4781], [], [], [], [], [], [], [], [4781], [4781], [], [], [4781], [4781], [], [], [], []]
