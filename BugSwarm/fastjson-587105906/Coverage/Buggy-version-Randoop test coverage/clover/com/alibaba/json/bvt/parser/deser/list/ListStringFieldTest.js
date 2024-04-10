var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":77258,"methods":[{"el":21,"sc":5,"sl":14},{"el":27,"sc":5,"sl":23}],"name":"ListStringFieldTest","sl":12},{"el":41,"id":77269,"methods":[{"el":35,"sc":9,"sl":33},{"el":39,"sc":9,"sl":37}],"name":"ListStringFieldTest.Model","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3029":{"methods":[{"sl":23},{"sl":37}],"name":"test_null","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":38}]},"test_584":{"methods":[{"sl":14},{"sl":37}],"name":"test_list","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [584], [584], [584], [584], [584], [584], [584], [], [], [3029], [3029], [3029], [3029], [], [], [], [], [], [], [], [], [], [], [3029, 584], [3029, 584], [], [], [], []]
