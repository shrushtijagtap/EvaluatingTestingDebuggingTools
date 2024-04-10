var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":61418,"methods":[{"el":34,"sc":5,"sl":11}],"name":"Issue1429","sl":10},{"el":41,"id":61429,"methods":[],"name":"Issue1429.Student","sl":37}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4679":{"methods":[{"sl":11}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30},{"sl":31},{"sl":32},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [4679], [4679], [], [], [], [], [], [], [], [], [], [], [], [4679], [4679], [4679], [4679], [4679], [], [4679], [4679], [4679], [4679], [], [], [], [], [], [], [], [], []]
