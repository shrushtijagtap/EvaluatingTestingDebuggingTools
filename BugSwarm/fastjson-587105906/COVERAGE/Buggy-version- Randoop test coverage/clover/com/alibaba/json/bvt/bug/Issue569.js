var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":57038,"methods":[{"el":25,"sc":5,"sl":15}],"name":"Issue569","sl":14},{"el":37,"id":57046,"methods":[{"el":32,"sc":9,"sl":30},{"el":36,"sc":9,"sl":34}],"name":"Issue569.MyTable","sl":27},{"el":41,"id":57050,"methods":[],"name":"Issue569.MyValue","sl":39}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3473":{"methods":[{"sl":15},{"sl":34}],"name":"test_for_issue","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":20},{"sl":21},{"sl":23},{"sl":24},{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3473], [3473], [3473], [3473], [], [3473], [3473], [], [3473], [3473], [], [], [], [], [], [], [], [], [], [3473], [3473], [], [], [], [], [], [], []]
