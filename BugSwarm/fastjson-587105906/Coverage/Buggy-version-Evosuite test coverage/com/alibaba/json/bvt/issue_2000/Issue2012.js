var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":24,"id":64453,"methods":[{"el":19,"sc":5,"sl":9}],"name":"Issue2012","sl":8},{"el":23,"id":64462,"methods":[],"name":"Issue2012.Model","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3373":{"methods":[{"sl":9}],"name":"test_for_issue","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [3373], [3373], [3373], [3373], [3373], [], [3373], [3373], [3373], [3373], [], [], [], [], [], []]
