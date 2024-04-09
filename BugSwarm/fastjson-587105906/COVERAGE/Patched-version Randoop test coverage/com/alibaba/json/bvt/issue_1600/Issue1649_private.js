var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":59,"id":63374,"methods":[{"el":13,"sc":5,"sl":9}],"name":"Issue1649_private","sl":8},{"el":58,"id":63378,"methods":[{"el":25,"sc":9,"sl":23},{"el":30,"sc":9,"sl":27},{"el":34,"sc":9,"sl":32},{"el":39,"sc":9,"sl":36},{"el":43,"sc":9,"sl":41},{"el":48,"sc":9,"sl":45},{"el":53,"sc":9,"sl":50},{"el":57,"sc":9,"sl":55}],"name":"Issue1649_private.Apple","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4415":{"methods":[{"sl":9},{"sl":23},{"sl":32},{"sl":41}],"name":"test_for_issue","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12},{"sl":24},{"sl":33},{"sl":42}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [4415], [4415], [4415], [4415], [], [], [], [], [], [], [], [], [], [], [4415], [4415], [], [], [], [], [], [], [], [4415], [4415], [], [], [], [], [], [], [], [4415], [4415], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
