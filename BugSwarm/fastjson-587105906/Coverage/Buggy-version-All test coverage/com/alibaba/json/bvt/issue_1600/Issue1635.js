var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":52,"id":63435,"methods":[{"el":36,"sc":5,"sl":24},{"el":51,"sc":5,"sl":38}],"name":"Issue1635","sl":11},{"el":22,"id":63435,"methods":[{"el":21,"sc":9,"sl":18}],"name":"Issue1635.Foo","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3981":{"methods":[{"sl":18},{"sl":38}],"name":"test_issue_1","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":50}]},"test_4396":{"methods":[{"sl":18},{"sl":24}],"name":"test_issue","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4396, 3981], [4396, 3981], [4396, 3981], [], [], [], [4396], [4396], [4396], [4396], [4396], [], [], [], [], [], [], [4396], [], [], [3981], [3981], [3981], [3981], [3981], [], [], [], [], [], [], [], [3981], [], []]
