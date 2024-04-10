var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":39,"id":52688,"methods":[{"el":18,"sc":5,"sl":14},{"el":26,"sc":5,"sl":21},{"el":34,"sc":5,"sl":32},{"el":38,"sc":5,"sl":36}],"name":"Bug_for_issue_491","sl":12},{"el":30,"id":52697,"methods":[],"name":"Bug_for_issue_491.Model","sl":28}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_259":{"methods":[{"sl":21},{"sl":36}],"name":"test_for_issue_2","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":37}]},"test_3678":{"methods":[{"sl":14},{"sl":32}],"name":"test_for_issue","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [3678], [3678], [3678], [3678], [], [], [], [259], [259], [259], [259], [259], [], [], [], [], [], [], [3678], [3678], [], [], [259], [259], [], []]
