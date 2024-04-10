var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":65528,"methods":[{"el":33,"sc":5,"sl":23}],"name":"Issue2428","sl":13},{"el":21,"id":65528,"methods":[],"name":"Issue2428.NestedBean","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_794":{"methods":[{"sl":23}],"name":"test_for_issue","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":29},{"sl":30},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [794], [794], [794], [794], [794], [], [794], [794], [], [794], [], []]
