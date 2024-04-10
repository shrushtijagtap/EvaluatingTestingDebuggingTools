var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":59,"id":53568,"methods":[{"el":20,"sc":5,"sl":17},{"el":35,"sc":5,"sl":22}],"name":"Bug_for_issue_447","sl":16},{"el":58,"id":53584,"methods":[{"el":44,"sc":9,"sl":42},{"el":48,"sc":9,"sl":46},{"el":52,"sc":9,"sl":50},{"el":56,"sc":9,"sl":54}],"name":"Bug_for_issue_447.Foo","sl":37}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2561":{"methods":[{"sl":22},{"sl":42},{"sl":50},{"sl":54}],"name":"test_for_issue","pass":false,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":43},{"sl":51},{"sl":55}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2561], [2561], [2561], [2561], [2561], [2561], [2561], [2561], [2561], [2561], [2561], [2561], [2561], [], [], [], [], [], [], [], [2561], [2561], [], [], [], [], [], [], [2561], [2561], [], [], [2561], [2561], [], [], [], []]
