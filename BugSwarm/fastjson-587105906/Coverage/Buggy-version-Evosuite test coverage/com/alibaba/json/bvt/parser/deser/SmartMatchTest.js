var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":52,"id":75563,"methods":[{"el":16,"sc":5,"sl":11},{"el":23,"sc":5,"sl":18}],"name":"SmartMatchTest","sl":9},{"el":37,"id":75571,"methods":[{"el":31,"sc":9,"sl":29},{"el":35,"sc":9,"sl":33}],"name":"SmartMatchTest.VO","sl":25},{"el":51,"id":75575,"methods":[{"el":45,"sc":9,"sl":43},{"el":49,"sc":9,"sl":47}],"name":"SmartMatchTest.VO2","sl":39}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1884":{"methods":[{"sl":18},{"sl":43},{"sl":47}],"name":"test_vo2","pass":true,"statements":[{"sl":19},{"sl":21},{"sl":22},{"sl":44},{"sl":48}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1884], [1884], [], [1884], [1884], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1884], [1884], [], [], [1884], [1884], [], [], [], []]
