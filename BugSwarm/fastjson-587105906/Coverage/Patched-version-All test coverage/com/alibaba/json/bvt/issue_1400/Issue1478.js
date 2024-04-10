var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":24,"id":61555,"methods":[{"el":14,"sc":5,"sl":8}],"name":"Issue1478","sl":7},{"el":23,"id":61560,"methods":[{"el":22,"sc":9,"sl":20}],"name":"Issue1478.Model","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4017":{"methods":[{"sl":8},{"sl":20}],"name":"test_for_issue","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":12},{"sl":13},{"sl":21}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [4017], [4017], [4017], [], [4017], [4017], [], [], [], [], [], [], [4017], [4017], [], [], []]
