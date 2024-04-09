var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":47,"id":64329,"methods":[{"el":20,"sc":5,"sl":18},{"el":25,"sc":5,"sl":22},{"el":41,"sc":5,"sl":27}],"name":"Issue2040","sl":16},{"el":46,"id":64339,"methods":[],"name":"Issue2040.Model","sl":43}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1803":{"methods":[{"sl":27}],"name":"test_for_issue_2040_2","pass":true,"statements":[{"sl":28},{"sl":36},{"sl":39},{"sl":40}]},"test_3517":{"methods":[{"sl":22}],"name":"test_for_issue_2040","pass":true,"statements":[{"sl":23},{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3517], [3517], [3517], [], [], [1803], [1803], [], [], [], [], [], [], [], [1803], [], [], [1803], [1803], [], [], [], [], [], [], []]
