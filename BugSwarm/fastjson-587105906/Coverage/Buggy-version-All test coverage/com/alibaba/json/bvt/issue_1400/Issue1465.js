var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":61532,"methods":[{"el":13,"sc":5,"sl":8}],"name":"Issue1465","sl":7},{"el":36,"id":61537,"methods":[{"el":22,"sc":9,"sl":20},{"el":27,"sc":9,"sl":24},{"el":31,"sc":9,"sl":29},{"el":35,"sc":9,"sl":33}],"name":"Issue1465.Model","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4593":{"methods":[{"sl":8},{"sl":33}],"name":"test_for_issue","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":11},{"sl":12},{"sl":34}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [4593], [4593], [4593], [4593], [4593], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4593], [4593], [], [], []]
