var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":52,"id":53868,"methods":[{"el":17,"sc":5,"sl":13},{"el":23,"sc":5,"sl":19},{"el":29,"sc":5,"sl":25}],"name":"Bug_for_issue_470","sl":11},{"el":33,"id":53880,"methods":[],"name":"Bug_for_issue_470.VO","sl":31},{"el":37,"id":53880,"methods":[],"name":"Bug_for_issue_470.V1","sl":35},{"el":51,"id":53880,"methods":[{"el":44,"sc":9,"sl":42},{"el":49,"sc":9,"sl":47}],"name":"Bug_for_issue_470.V2","sl":39}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1893":{"methods":[{"sl":19}],"name":"test_for_issue_private","pass":true,"statements":[{"sl":20},{"sl":21},{"sl":22}]},"test_2308":{"methods":[{"sl":25}],"name":"test_for_issue_method","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":28}]},"test_314":{"methods":[{"sl":13}],"name":"test_for_issue","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [314], [314], [314], [314], [], [], [1893], [1893], [1893], [1893], [], [], [2308], [2308], [2308], [2308], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
