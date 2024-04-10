var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":52098,"methods":[{"el":16,"sc":5,"sl":12},{"el":22,"sc":5,"sl":18},{"el":29,"sc":5,"sl":25}],"name":"Bug_for_issue_296","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3006":{"methods":[{"sl":18}],"name":"test_for_issue_space","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":21}]},"test_4241":{"methods":[{"sl":25}],"name":"test_for_issue_127","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":28}]},"test_982":{"methods":[{"sl":12}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [982], [982], [982], [982], [], [], [3006], [3006], [3006], [3006], [], [], [], [4241], [4241], [4241], [4241], [], []]
