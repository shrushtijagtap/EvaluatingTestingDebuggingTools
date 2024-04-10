var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":47822,"methods":[{"el":16,"sc":5,"sl":11}],"name":"TestSerializable","sl":10},{"el":39,"id":47826,"methods":[{"el":25,"sc":9,"sl":23},{"el":29,"sc":9,"sl":27},{"el":33,"sc":9,"sl":31},{"el":37,"sc":9,"sl":35}],"name":"TestSerializable.VO","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3500":{"methods":[{"sl":11},{"sl":23},{"sl":31},{"sl":35}],"name":"test_codec","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":15},{"sl":24},{"sl":32},{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3500], [3500], [3500], [], [3500], [], [], [], [], [], [], [], [3500], [3500], [], [], [], [], [], [], [3500], [3500], [], [], [3500], [3500], [], [], [], []]
