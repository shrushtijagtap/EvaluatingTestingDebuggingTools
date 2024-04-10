var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":33,"id":64192,"methods":[{"el":11,"sc":5,"sl":9}],"name":"Issue1870","sl":8},{"el":25,"id":64193,"methods":[{"el":20,"sc":9,"sl":18},{"el":24,"sc":9,"sl":22}],"name":"Issue1870.Comment","sl":13},{"el":32,"id":64197,"methods":[],"name":"Issue1870.Pic","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4266":{"methods":[{"sl":9}],"name":"test_for_issue","pass":true,"statements":[]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [4266], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
