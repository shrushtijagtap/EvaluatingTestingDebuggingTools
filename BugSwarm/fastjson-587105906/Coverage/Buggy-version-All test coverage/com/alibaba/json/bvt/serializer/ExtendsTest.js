var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":48,"id":83144,"methods":[{"el":19,"sc":5,"sl":11}],"name":"ExtendsTest","sl":9},{"el":33,"id":83151,"methods":[{"el":27,"sc":9,"sl":25},{"el":31,"sc":9,"sl":29}],"name":"ExtendsTest.A","sl":21},{"el":47,"id":83155,"methods":[{"el":41,"sc":9,"sl":39},{"el":45,"sc":9,"sl":43}],"name":"ExtendsTest.B","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2031":{"methods":[{"sl":11},{"sl":25},{"sl":29},{"sl":39},{"sl":43}],"name":"test_extends","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":16},{"sl":17},{"sl":18},{"sl":26},{"sl":30},{"sl":40},{"sl":44}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [2031], [2031], [2031], [2031], [], [2031], [2031], [2031], [], [], [], [], [], [], [2031], [2031], [], [], [2031], [2031], [], [], [], [], [], [], [], [], [2031], [2031], [], [], [2031], [2031], [], [], [], []]
