var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":41,"id":57743,"methods":[{"el":19,"sc":5,"sl":16},{"el":27,"sc":5,"sl":21},{"el":35,"sc":5,"sl":29}],"name":"Issue978","sl":15},{"el":40,"id":57756,"methods":[],"name":"Issue978.Model","sl":37}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2346":{"methods":[{"sl":21}],"name":"test_for_issue","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":25},{"sl":26}]},"test_4626":{"methods":[{"sl":29}],"name":"test_for_issue2","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":33},{"sl":34}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2346], [2346], [2346], [], [2346], [2346], [], [], [4626], [4626], [4626], [], [4626], [4626], [], [], [], [], [], [], []]
