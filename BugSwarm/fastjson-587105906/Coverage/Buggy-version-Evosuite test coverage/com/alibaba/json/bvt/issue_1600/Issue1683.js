var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":64,"id":63594,"methods":[{"el":16,"sc":5,"sl":9}],"name":"Issue1683","sl":8},{"el":62,"id":63601,"methods":[{"el":32,"sc":9,"sl":30},{"el":36,"sc":9,"sl":34},{"el":40,"sc":9,"sl":38},{"el":44,"sc":9,"sl":42},{"el":48,"sc":9,"sl":46},{"el":52,"sc":9,"sl":50},{"el":56,"sc":9,"sl":54},{"el":60,"sc":9,"sl":58}],"name":"Issue1683.BookDO","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2088":{"methods":[{"sl":9},{"sl":34},{"sl":42},{"sl":50},{"sl":58}],"name":"test_for_issue","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":35},{"sl":43},{"sl":51},{"sl":59}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [2088], [2088], [2088], [2088], [2088], [2088], [2088], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2088], [2088], [], [], [], [], [], [], [2088], [2088], [], [], [], [], [], [], [2088], [2088], [], [], [], [], [], [], [2088], [2088], [], [], [], [], []]
