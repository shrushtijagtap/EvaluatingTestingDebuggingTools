var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":53,"id":60169,"methods":[{"el":28,"sc":5,"sl":12}],"name":"Issue1226","sl":11},{"el":40,"id":60181,"methods":[{"el":35,"sc":9,"sl":33},{"el":39,"sc":9,"sl":37}],"name":"Issue1226.TestBean","sl":30},{"el":52,"id":60185,"methods":[{"el":47,"sc":9,"sl":45},{"el":51,"sc":9,"sl":49}],"name":"Issue1226.TestBean2","sl":42}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2899":{"methods":[{"sl":12},{"sl":33},{"sl":37},{"sl":45},{"sl":49}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":17},{"sl":18},{"sl":20},{"sl":21},{"sl":23},{"sl":24},{"sl":26},{"sl":27},{"sl":34},{"sl":38},{"sl":46},{"sl":50}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [2899], [2899], [2899], [2899], [], [2899], [2899], [], [2899], [2899], [], [2899], [2899], [], [2899], [2899], [], [], [], [], [], [2899], [2899], [], [], [2899], [2899], [], [], [], [], [], [], [2899], [2899], [], [], [2899], [2899], [], [], []]
