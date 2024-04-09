var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":41,"id":75234,"methods":[{"el":19,"sc":5,"sl":16},{"el":25,"sc":5,"sl":21},{"el":31,"sc":5,"sl":27},{"el":40,"sc":5,"sl":33}],"name":"LocaleTest","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1501":{"methods":[{"sl":16}],"name":"test_0","pass":true,"statements":[{"sl":17},{"sl":18}]},"test_1556":{"methods":[{"sl":27}],"name":"test_2","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30}]},"test_2444":{"methods":[{"sl":21}],"name":"test_1","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24}]},"test_936":{"methods":[{"sl":33}],"name":"test_null","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":37},{"sl":39}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1501], [1501], [1501], [], [], [2444], [2444], [2444], [2444], [], [], [1556], [1556], [1556], [1556], [], [], [936], [936], [936], [], [936], [], [936], [], []]
