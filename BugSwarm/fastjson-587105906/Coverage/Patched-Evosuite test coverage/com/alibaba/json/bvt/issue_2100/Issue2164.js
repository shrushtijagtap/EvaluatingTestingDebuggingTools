var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":63361,"methods":[{"el":13,"sc":5,"sl":7},{"el":21,"sc":5,"sl":15}],"name":"Issue2164","sl":6},{"el":33,"id":63373,"methods":[{"el":28,"sc":9,"sl":26},{"el":32,"sc":9,"sl":30}],"name":"Issue2164.Model","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1886":{"methods":[{"sl":15},{"sl":26},{"sl":30}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":31}]},"test_734":{"methods":[{"sl":7}],"name":"test_for_issue","pass":true,"statements":[{"sl":8},{"sl":9},{"sl":10},{"sl":11},{"sl":12}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [734], [734], [734], [734], [734], [734], [], [], [1886], [1886], [1886], [1886], [1886], [1886], [], [], [], [], [], [1886], [], [], [], [1886], [1886], [], [], []]
