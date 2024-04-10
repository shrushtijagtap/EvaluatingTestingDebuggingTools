var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":69,"id":56991,"methods":[{"el":27,"sc":5,"sl":12}],"name":"Issue274","sl":10},{"el":34,"id":57001,"methods":[],"name":"Issue274.Indexable","sl":29},{"el":68,"id":57001,"methods":[{"el":43,"sc":9,"sl":41},{"el":47,"sc":9,"sl":45},{"el":51,"sc":9,"sl":49},{"el":55,"sc":9,"sl":53},{"el":60,"sc":9,"sl":57},{"el":66,"sc":9,"sl":63}],"name":"Issue274.Customer","sl":36}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_360":{"methods":[{"sl":12},{"sl":41},{"sl":45},{"sl":49},{"sl":53},{"sl":57}],"name":"test","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":17},{"sl":18},{"sl":20},{"sl":22},{"sl":24},{"sl":26},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":59}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [360], [360], [360], [360], [], [360], [360], [], [360], [], [360], [], [360], [], [360], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [360], [360], [], [], [360], [360], [], [], [360], [360], [], [], [360], [360], [], [], [360], [], [360], [], [], [], [], [], [], [], [], [], []]
