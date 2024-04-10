var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":53,"id":52881,"methods":[{"el":22,"sc":5,"sl":14}],"name":"Bug_for_issue_729","sl":12},{"el":52,"id":52888,"methods":[{"el":33,"sc":9,"sl":31},{"el":37,"sc":9,"sl":35},{"el":41,"sc":9,"sl":39},{"el":45,"sc":9,"sl":43},{"el":50,"sc":9,"sl":47}],"name":"Bug_for_issue_729.Person","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1975":{"methods":[{"sl":14},{"sl":31},{"sl":35},{"sl":39},{"sl":43},{"sl":47}],"name":"test_for_issue","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":19},{"sl":20},{"sl":21},{"sl":32},{"sl":36},{"sl":40},{"sl":44},{"sl":49}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [1975], [1975], [1975], [1975], [], [1975], [1975], [1975], [], [], [], [], [], [], [], [], [], [1975], [1975], [], [], [1975], [1975], [], [], [1975], [1975], [], [], [1975], [1975], [], [], [1975], [], [1975], [], [], [], []]
