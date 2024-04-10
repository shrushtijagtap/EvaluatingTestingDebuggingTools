var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":28,"id":64722,"methods":[{"el":15,"sc":5,"sl":10},{"el":22,"sc":5,"sl":17}],"name":"Issue2216","sl":9},{"el":27,"id":64732,"methods":[],"name":"Issue2216.Model","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2494":{"methods":[{"sl":17}],"name":"test_for_issue_2","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20},{"sl":21}]},"test_2960":{"methods":[{"sl":10}],"name":"test_for_issue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [2960], [2960], [2960], [2960], [2960], [], [], [2494], [2494], [2494], [2494], [2494], [], [], [], [], [], [], []]
