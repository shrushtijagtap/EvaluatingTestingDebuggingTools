var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":56331,"methods":[{"el":54,"sc":5,"sl":18}],"name":"Issue1023","sl":17}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_234":{"methods":[{"sl":18}],"name":"test_for_issue","pass":true,"statements":[{"sl":19},{"sl":21},{"sl":22},{"sl":24},{"sl":26},{"sl":28},{"sl":30},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42},{"sl":45},{"sl":46},{"sl":47},{"sl":51},{"sl":52},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [234], [234], [], [234], [234], [], [234], [], [234], [], [234], [], [234], [], [], [], [], [], [], [234], [234], [234], [234], [], [234], [], [], [234], [234], [234], [], [], [], [234], [234], [234], [], []]
