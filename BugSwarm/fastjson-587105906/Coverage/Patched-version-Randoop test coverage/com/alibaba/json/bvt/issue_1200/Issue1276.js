var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":78,"id":60429,"methods":[{"el":21,"sc":5,"sl":10}],"name":"Issue1276","sl":9},{"el":77,"id":60437,"methods":[{"el":29,"sc":9,"sl":27},{"el":33,"sc":9,"sl":31},{"el":37,"sc":9,"sl":35},{"el":41,"sc":9,"sl":39},{"el":46,"sc":9,"sl":43},{"el":51,"sc":9,"sl":48},{"el":56,"sc":9,"sl":53},{"el":61,"sc":9,"sl":58},{"el":65,"sc":9,"sl":63},{"el":69,"sc":9,"sl":67},{"el":76,"sc":9,"sl":71}],"name":"Issue1276.MyException","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4633":{"methods":[{"sl":10},{"sl":31},{"sl":53},{"sl":63},{"sl":67}],"name":"test_for_issue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":18},{"sl":19},{"sl":32},{"sl":54},{"sl":55},{"sl":64},{"sl":68}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [4633], [4633], [4633], [4633], [], [4633], [4633], [], [4633], [4633], [], [], [], [], [], [], [], [], [], [], [], [4633], [4633], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4633], [4633], [4633], [], [], [], [], [], [], [], [4633], [4633], [], [], [4633], [4633], [], [], [], [], [], [], [], [], [], []]
