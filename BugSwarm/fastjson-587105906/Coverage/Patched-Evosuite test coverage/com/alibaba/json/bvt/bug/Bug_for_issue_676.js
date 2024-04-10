var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":52867,"methods":[{"el":14,"sc":5,"sl":12}],"name":"Bug_for_issue_676","sl":11},{"el":18,"id":52869,"methods":[],"name":"Bug_for_issue_676.MenuExpend","sl":16},{"el":22,"id":52869,"methods":[],"name":"Bug_for_issue_676.ModelType","sl":20}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4343":{"methods":[{"sl":12}],"name":"test_for_issue","pass":true,"statements":[{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [4343], [4343], [], [], [], [], [], [], [], [], [], []]
