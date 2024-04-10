var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":63,"id":64179,"methods":[{"el":18,"sc":5,"sl":9}],"name":"Issue1856","sl":8},{"el":62,"id":64187,"methods":[{"el":30,"sc":9,"sl":27},{"el":34,"sc":9,"sl":32},{"el":39,"sc":9,"sl":36},{"el":43,"sc":9,"sl":41},{"el":48,"sc":9,"sl":45},{"el":52,"sc":9,"sl":50},{"el":56,"sc":9,"sl":54},{"el":60,"sc":9,"sl":58}],"name":"Issue1856.VO","sl":20}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2817":{"methods":[{"sl":9},{"sl":27},{"sl":32},{"sl":36},{"sl":41},{"sl":50},{"sl":54},{"sl":58}],"name":"test_excludes","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":16},{"sl":17},{"sl":29},{"sl":33},{"sl":38},{"sl":42},{"sl":51},{"sl":55},{"sl":59}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [2817], [2817], [2817], [2817], [2817], [2817], [], [2817], [2817], [], [], [], [], [], [], [], [], [], [2817], [], [2817], [], [], [2817], [2817], [], [], [2817], [], [2817], [], [], [2817], [2817], [], [], [], [], [], [], [], [2817], [2817], [], [], [2817], [2817], [], [], [2817], [2817], [], [], [], []]
