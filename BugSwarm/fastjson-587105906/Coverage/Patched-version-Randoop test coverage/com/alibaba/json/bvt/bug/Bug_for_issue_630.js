var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":70,"id":53950,"methods":[{"el":26,"sc":5,"sl":14},{"el":40,"sc":5,"sl":28},{"el":54,"sc":5,"sl":42}],"name":"Bug_for_issue_630","sl":12},{"el":63,"id":53977,"methods":[],"name":"Bug_for_issue_630.Model","sl":56},{"el":69,"id":53977,"methods":[],"name":"Bug_for_issue_630.Person","sl":65}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2366":{"methods":[{"sl":42}],"name":"test_for_issue_one","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":51},{"sl":53}]},"test_28":{"methods":[{"sl":14}],"name":"test_for_issue_null","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":23},{"sl":25}]},"test_3594":{"methods":[{"sl":28}],"name":"test_for_issue_empty","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":37},{"sl":39}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [28], [28], [28], [28], [28], [28], [], [], [], [28], [], [28], [], [], [3594], [3594], [3594], [3594], [3594], [3594], [3594], [], [], [3594], [], [3594], [], [], [2366], [2366], [2366], [2366], [2366], [2366], [2366], [2366], [], [2366], [], [2366], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
