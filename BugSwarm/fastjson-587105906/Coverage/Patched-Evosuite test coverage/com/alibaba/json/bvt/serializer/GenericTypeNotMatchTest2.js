var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":82007,"methods":[{"el":19,"sc":5,"sl":12}],"name":"GenericTypeNotMatchTest2","sl":11},{"el":24,"id":82012,"methods":[],"name":"GenericTypeNotMatchTest2.Model","sl":22},{"el":36,"id":82012,"methods":[{"el":31,"sc":9,"sl":29},{"el":35,"sc":9,"sl":33}],"name":"GenericTypeNotMatchTest2.Base","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1815":{"methods":[{"sl":12},{"sl":29},{"sl":33}],"name":"test_for_notMatch","pass":true,"statements":[{"sl":13},{"sl":15},{"sl":16},{"sl":18},{"sl":30},{"sl":34}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [1815], [1815], [], [1815], [1815], [], [1815], [], [], [], [], [], [], [], [], [], [], [1815], [1815], [], [], [1815], [1815], [], [], []]
