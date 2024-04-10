var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":76002,"methods":[{"el":20,"sc":5,"sl":15},{"el":27,"sc":5,"sl":22}],"name":"ArrayLisMapDeserializerTest","sl":13},{"el":41,"id":76012,"methods":[{"el":35,"sc":9,"sl":33},{"el":39,"sc":9,"sl":37}],"name":"ArrayLisMapDeserializerTest.Entity","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_135":{"methods":[{"sl":15},{"sl":33},{"sl":37}],"name":"test_list","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":34},{"sl":38}]},"test_340":{"methods":[{"sl":22}],"name":"test_list_2","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [135], [135], [135], [135], [135], [], [], [340], [340], [340], [340], [340], [], [], [], [], [], [], [135], [135], [], [], [135], [135], [], [], [], []]
