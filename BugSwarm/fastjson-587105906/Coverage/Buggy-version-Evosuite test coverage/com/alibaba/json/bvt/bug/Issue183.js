var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":66,"id":56687,"methods":[{"el":18,"sc":5,"sl":12}],"name":"Issue183","sl":10},{"el":27,"id":56693,"methods":[],"name":"Issue183.IA","sl":20},{"el":65,"id":56693,"methods":[{"el":36,"sc":9,"sl":34},{"el":40,"sc":9,"sl":38},{"el":45,"sc":9,"sl":42},{"el":50,"sc":9,"sl":47},{"el":63,"sc":9,"sl":52}],"name":"Issue183.A","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_884":{"methods":[{"sl":12},{"sl":34},{"sl":38},{"sl":42},{"sl":47},{"sl":52}],"name":"test_issue_183","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":35},{"sl":39},{"sl":43},{"sl":44},{"sl":48},{"sl":49},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":61},{"sl":62}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [884], [884], [884], [884], [884], [884], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [884], [884], [], [], [884], [884], [], [], [884], [884], [884], [], [], [884], [884], [884], [], [], [884], [], [884], [884], [884], [884], [884], [884], [], [884], [884], [], [], [], []]
