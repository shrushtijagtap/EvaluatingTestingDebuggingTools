var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":64,"id":52813,"methods":[{"el":20,"sc":5,"sl":13},{"el":35,"sc":13,"sl":29},{"el":40,"sc":5,"sl":22}],"name":"Bug_for_issue_572_private","sl":11},{"el":63,"id":52832,"methods":[{"el":49,"sc":9,"sl":47},{"el":53,"sc":9,"sl":51},{"el":57,"sc":9,"sl":55},{"el":61,"sc":9,"sl":59}],"name":"Bug_for_issue_572_private.Model","sl":42}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4032":{"methods":[{"sl":22},{"sl":29},{"sl":47},{"sl":55}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":27},{"sl":31},{"sl":34},{"sl":38},{"sl":39},{"sl":48},{"sl":56}]},"test_876":{"methods":[{"sl":13},{"sl":47},{"sl":55}],"name":"test_for_issue","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":18},{"sl":19},{"sl":48},{"sl":56}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [876], [876], [876], [876], [], [876], [876], [], [], [4032], [4032], [4032], [4032], [], [4032], [], [4032], [], [4032], [], [], [4032], [], [], [], [4032], [4032], [], [], [], [], [], [], [], [4032, 876], [4032, 876], [], [], [], [], [], [], [4032, 876], [4032, 876], [], [], [], [], [], [], [], []]
