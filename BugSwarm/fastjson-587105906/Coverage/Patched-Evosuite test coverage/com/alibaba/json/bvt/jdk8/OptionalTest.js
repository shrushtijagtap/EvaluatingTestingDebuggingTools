var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":77,"id":65063,"methods":[{"el":25,"sc":5,"sl":16},{"el":31,"sc":5,"sl":27},{"el":42,"sc":5,"sl":33},{"el":48,"sc":5,"sl":44},{"el":59,"sc":5,"sl":50},{"el":65,"sc":5,"sl":61},{"el":76,"sc":5,"sl":67}],"name":"OptionalTest","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1292":{"methods":[{"sl":44}],"name":"test_optionalLong_present","pass":true,"statements":[{"sl":45},{"sl":47}]},"test_2015":{"methods":[{"sl":67}],"name":"test_optionalDouble","pass":true,"statements":[{"sl":68},{"sl":70},{"sl":72},{"sl":74},{"sl":75}]},"test_2433":{"methods":[{"sl":61}],"name":"test_optionalDouble_present","pass":true,"statements":[{"sl":62},{"sl":64}]},"test_3185":{"methods":[{"sl":50}],"name":"test_optionalLong","pass":true,"statements":[{"sl":51},{"sl":53},{"sl":55},{"sl":57},{"sl":58}]},"test_4692":{"methods":[{"sl":27}],"name":"test_optionalInt_present","pass":true,"statements":[{"sl":28},{"sl":30}]},"test_533":{"methods":[{"sl":33}],"name":"test_optionalInt","pass":true,"statements":[{"sl":34},{"sl":36},{"sl":38},{"sl":40},{"sl":41}]},"test_729":{"methods":[{"sl":16}],"name":"test_optional","pass":true,"statements":[{"sl":17},{"sl":19},{"sl":21},{"sl":23},{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [729], [729], [], [729], [], [729], [], [729], [729], [], [], [4692], [4692], [], [4692], [], [], [533], [533], [], [533], [], [533], [], [533], [533], [], [], [1292], [1292], [], [1292], [], [], [3185], [3185], [], [3185], [], [3185], [], [3185], [3185], [], [], [2433], [2433], [], [2433], [], [], [2015], [2015], [], [2015], [], [2015], [], [2015], [2015], [], []]
