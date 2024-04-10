var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":56149,"methods":[{"el":19,"sc":5,"sl":13}],"name":"Issue79","sl":11},{"el":24,"id":56155,"methods":[],"name":"Issue79.SearchResult","sl":21},{"el":29,"id":56155,"methods":[],"name":"Issue79.Present","sl":26},{"el":33,"id":56155,"methods":[],"name":"Issue79.PresentRecord","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4337":{"methods":[{"sl":13}],"name":"test_for_issue_79","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [4337], [4337], [4337], [4337], [4337], [4337], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
