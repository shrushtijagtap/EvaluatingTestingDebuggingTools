var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":59,"id":61896,"methods":[{"el":14,"sc":5,"sl":10},{"el":20,"sc":5,"sl":16},{"el":26,"sc":5,"sl":22},{"el":32,"sc":5,"sl":28},{"el":38,"sc":5,"sl":34}],"name":"Issue1570_private","sl":9},{"el":42,"id":61916,"methods":[],"name":"Issue1570_private.Model","sl":40},{"el":46,"id":61916,"methods":[],"name":"Issue1570_private.ModelInt","sl":44},{"el":50,"id":61916,"methods":[],"name":"Issue1570_private.ModelLong","sl":48},{"el":54,"id":61916,"methods":[],"name":"Issue1570_private.ModelBool","sl":52},{"el":58,"id":61916,"methods":[],"name":"Issue1570_private.ModelList","sl":56}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_151":{"methods":[{"sl":10}],"name":"test_for_issue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_307":{"methods":[{"sl":34}],"name":"test_for_issue_list","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37}]},"test_3859":{"methods":[{"sl":16}],"name":"test_for_issue_int","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19}]},"test_4056":{"methods":[{"sl":22}],"name":"test_for_issue_long","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25}]},"test_4646":{"methods":[{"sl":28}],"name":"test_for_issue_bool","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":31}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [151], [151], [151], [151], [], [], [3859], [3859], [3859], [3859], [], [], [4056], [4056], [4056], [4056], [], [], [4646], [4646], [4646], [4646], [], [], [307], [307], [307], [307], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
