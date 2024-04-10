var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":46,"id":53544,"methods":[{"el":16,"sc":5,"sl":14},{"el":26,"sc":5,"sl":18},{"el":36,"sc":5,"sl":28}],"name":"Bug_for_issue_430","sl":13},{"el":41,"id":53560,"methods":[],"name":"Bug_for_issue_430.FooModel","sl":38},{"el":45,"id":53560,"methods":[],"name":"Bug_for_issue_430.FooCollectionModel","sl":43}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2848":{"methods":[{"sl":28}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":34},{"sl":35}]},"test_3044":{"methods":[{"sl":18}],"name":"test_for_issue","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":24},{"sl":25}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3044], [3044], [3044], [3044], [3044], [], [3044], [3044], [], [], [2848], [2848], [2848], [2848], [2848], [], [2848], [2848], [], [], [], [], [], [], [], [], [], [], []]
