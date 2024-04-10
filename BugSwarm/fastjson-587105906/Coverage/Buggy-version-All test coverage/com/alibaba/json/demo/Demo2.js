var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":94688,"methods":[{"el":23,"sc":5,"sl":13}],"name":"Demo2","sl":11},{"el":41,"id":94696,"methods":[{"el":32,"sc":9,"sl":32},{"el":33,"sc":9,"sl":33},{"el":34,"sc":9,"sl":34},{"el":35,"sc":9,"sl":35},{"el":37,"sc":9,"sl":36},{"el":38,"sc":9,"sl":38},{"el":39,"sc":9,"sl":39},{"el":40,"sc":9,"sl":40}],"name":"Demo2.Department","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
