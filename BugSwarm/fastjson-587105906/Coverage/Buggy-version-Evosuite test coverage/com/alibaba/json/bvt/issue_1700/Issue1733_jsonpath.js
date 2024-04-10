var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":72,"id":63853,"methods":[{"el":22,"sc":5,"sl":12},{"el":35,"sc":5,"sl":24},{"el":48,"sc":5,"sl":37}],"name":"Issue1733_jsonpath","sl":11},{"el":53,"id":63882,"methods":[],"name":"Issue1733_jsonpath.Order","sl":50},{"el":71,"id":63882,"methods":[{"el":61,"sc":9,"sl":59},{"el":65,"sc":9,"sl":63},{"el":70,"sc":9,"sl":67}],"name":"Issue1733_jsonpath.Book","sl":55}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1939":{"methods":[{"sl":24},{"sl":63},{"sl":67}],"name":"test_for_issue_or","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":64},{"sl":68},{"sl":69}]},"test_3469":{"methods":[{"sl":12},{"sl":63},{"sl":67}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":64},{"sl":68},{"sl":69}]},"test_3594":{"methods":[{"sl":37},{"sl":63},{"sl":67}],"name":"test_for_issue_or_1","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":64},{"sl":68},{"sl":69}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [3469], [3469], [3469], [3469], [3469], [], [3469], [3469], [3469], [3469], [], [], [1939], [1939], [1939], [1939], [1939], [], [1939], [1939], [1939], [1939], [1939], [], [], [3594], [3594], [3594], [3594], [3594], [], [3594], [3594], [3594], [3594], [3594], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1939, 3594, 3469], [1939, 3594, 3469], [], [], [1939, 3594, 3469], [1939, 3594, 3469], [1939, 3594, 3469], [], [], []]
