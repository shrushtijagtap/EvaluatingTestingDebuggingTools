var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":38,"id":61199,"methods":[{"el":15,"sc":5,"sl":10},{"el":21,"sc":5,"sl":17},{"el":27,"sc":5,"sl":23},{"el":33,"sc":5,"sl":29}],"name":"Issue1422","sl":9},{"el":37,"id":61215,"methods":[],"name":"Issue1422.Foo","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1026":{"methods":[{"sl":29}],"name":"test_for_issue_1_reader","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32}]},"test_2627":{"methods":[{"sl":10}],"name":"test_for_issue","pass":true,"statements":[{"sl":11},{"sl":13},{"sl":14}]},"test_3187":{"methods":[{"sl":23}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26}]},"test_4693":{"methods":[{"sl":17}],"name":"test_for_issue_reader","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [2627], [2627], [], [2627], [2627], [], [], [4693], [4693], [4693], [4693], [], [], [3187], [3187], [3187], [3187], [], [], [1026], [1026], [1026], [1026], [], [], [], [], [], []]
