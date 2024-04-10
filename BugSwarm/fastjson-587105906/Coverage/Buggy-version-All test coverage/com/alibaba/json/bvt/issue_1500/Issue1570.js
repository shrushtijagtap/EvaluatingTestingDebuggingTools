var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":59,"id":63119,"methods":[{"el":14,"sc":5,"sl":10},{"el":20,"sc":5,"sl":16},{"el":26,"sc":5,"sl":22},{"el":32,"sc":5,"sl":28},{"el":38,"sc":5,"sl":34}],"name":"Issue1570","sl":9},{"el":42,"id":63139,"methods":[],"name":"Issue1570.Model","sl":40},{"el":46,"id":63139,"methods":[],"name":"Issue1570.ModelInt","sl":44},{"el":50,"id":63139,"methods":[],"name":"Issue1570.ModelLong","sl":48},{"el":54,"id":63139,"methods":[],"name":"Issue1570.ModelBool","sl":52},{"el":58,"id":63139,"methods":[],"name":"Issue1570.ModelList","sl":56}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2348":{"methods":[{"sl":28}],"name":"test_for_issue_bool","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":31}]},"test_2697":{"methods":[{"sl":10}],"name":"test_for_issue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_4174":{"methods":[{"sl":34}],"name":"test_for_issue_list","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37}]},"test_4209":{"methods":[{"sl":16}],"name":"test_for_issue_int","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19}]},"test_434":{"methods":[{"sl":22}],"name":"test_for_issue_long","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [2697], [2697], [2697], [2697], [], [], [4209], [4209], [4209], [4209], [], [], [434], [434], [434], [434], [], [], [2348], [2348], [2348], [2348], [], [], [4174], [4174], [4174], [4174], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
