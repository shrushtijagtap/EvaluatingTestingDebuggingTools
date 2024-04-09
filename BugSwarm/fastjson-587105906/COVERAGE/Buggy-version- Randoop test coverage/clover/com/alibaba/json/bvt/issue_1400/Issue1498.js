var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":39,"id":61680,"methods":[{"el":10,"sc":5,"sl":7},{"el":15,"sc":5,"sl":12}],"name":"Issue1498","sl":6},{"el":19,"id":61686,"methods":[],"name":"Issue1498.Model","sl":17},{"el":38,"id":61686,"methods":[{"el":32,"sc":9,"sl":28},{"el":37,"sc":9,"sl":34}],"name":"Issue1498.BuFlag","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2295":{"methods":[{"sl":12},{"sl":28}],"name":"test_for_issue_match","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":30},{"sl":31}]},"test_4005":{"methods":[{"sl":7}],"name":"test_for_issue","pass":true,"statements":[{"sl":8},{"sl":9}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [4005], [4005], [4005], [], [], [2295], [2295], [2295], [], [], [], [], [], [], [], [], [], [], [], [], [], [2295], [], [2295], [2295], [], [], [], [], [], [], [], []]
