var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":36,"id":60133,"methods":[{"el":17,"sc":5,"sl":14},{"el":22,"sc":5,"sl":19}],"name":"Issue1152","sl":13},{"el":35,"id":60139,"methods":[{"el":30,"sc":9,"sl":28},{"el":34,"sc":9,"sl":31}],"name":"Issue1152.TestBean","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3938":{"methods":[{"sl":14}],"name":"test_for_issue","pass":false,"statements":[{"sl":15}]},"test_4631":{"methods":[{"sl":19}],"name":"test_for_issue_2","pass":false,"statements":[{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [3938], [3938], [], [], [], [4631], [4631], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
