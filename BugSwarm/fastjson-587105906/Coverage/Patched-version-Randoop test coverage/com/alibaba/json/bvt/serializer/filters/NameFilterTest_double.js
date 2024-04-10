var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":86,"id":87377,"methods":[{"el":24,"sc":13,"sl":18},{"el":37,"sc":5,"sl":15},{"el":48,"sc":13,"sl":42},{"el":62,"sc":5,"sl":39}],"name":"NameFilterTest_double","sl":13},{"el":85,"id":87408,"methods":[{"el":71,"sc":9,"sl":69},{"el":75,"sc":9,"sl":73},{"el":79,"sc":9,"sl":77},{"el":83,"sc":9,"sl":81}],"name":"NameFilterTest_double.Bean","sl":64}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3506":{"methods":[{"sl":15},{"sl":18},{"sl":69},{"sl":77}],"name":"test_namefilter","pass":true,"statements":[{"sl":16},{"sl":19},{"sl":20},{"sl":23},{"sl":28},{"sl":29},{"sl":30},{"sl":32},{"sl":33},{"sl":35},{"sl":36},{"sl":70},{"sl":78}]},"test_3837":{"methods":[{"sl":39},{"sl":42}],"name":"test_namefilter_1","pass":true,"statements":[{"sl":40},{"sl":43},{"sl":44},{"sl":52},{"sl":53},{"sl":54},{"sl":56},{"sl":57},{"sl":58},{"sl":60},{"sl":61}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3506], [3506], [], [3506], [3506], [3506], [], [], [3506], [], [], [], [], [3506], [3506], [3506], [], [3506], [3506], [], [3506], [3506], [], [], [3837], [3837], [], [3837], [3837], [3837], [], [], [], [], [], [], [], [3837], [3837], [3837], [], [3837], [3837], [3837], [], [3837], [3837], [], [], [], [], [], [], [], [3506], [3506], [], [], [], [], [], [], [3506], [3506], [], [], [], [], [], [], [], []]
