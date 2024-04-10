var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":72,"id":53947,"methods":[{"el":22,"sc":5,"sl":12},{"el":34,"sc":5,"sl":24},{"el":47,"sc":5,"sl":37}],"name":"Bug_for_issue_537","sl":10},{"el":52,"id":53971,"methods":[],"name":"Bug_for_issue_537.VO","sl":49},{"el":57,"id":53971,"methods":[],"name":"Bug_for_issue_537.V1","sl":54},{"el":71,"id":53971,"methods":[{"el":65,"sc":9,"sl":63},{"el":69,"sc":9,"sl":67}],"name":"Bug_for_issue_537.V2","sl":59}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3504":{"methods":[{"sl":37}],"name":"test_for_issue_method","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":43},{"sl":45},{"sl":46}]},"test_3887":{"methods":[{"sl":12}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":18},{"sl":20},{"sl":21}]},"test_596":{"methods":[{"sl":24}],"name":"test_for_issue_private","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30},{"sl":32},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [3887], [3887], [3887], [3887], [3887], [], [3887], [], [3887], [3887], [], [], [596], [596], [596], [596], [596], [], [596], [], [596], [596], [], [], [], [3504], [3504], [3504], [3504], [3504], [], [3504], [], [3504], [3504], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
