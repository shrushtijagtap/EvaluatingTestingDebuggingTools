var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":77,"id":66173,"methods":[{"el":25,"sc":5,"sl":16},{"el":31,"sc":5,"sl":27},{"el":42,"sc":5,"sl":33},{"el":48,"sc":5,"sl":44},{"el":59,"sc":5,"sl":50},{"el":65,"sc":5,"sl":61},{"el":76,"sc":5,"sl":67}],"name":"OptionalTest","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_125":{"methods":[{"sl":16}],"name":"test_optional","pass":true,"statements":[{"sl":17},{"sl":19},{"sl":21},{"sl":23},{"sl":24}]},"test_2009":{"methods":[{"sl":50}],"name":"test_optionalLong","pass":true,"statements":[{"sl":51},{"sl":53},{"sl":55},{"sl":57},{"sl":58}]},"test_2173":{"methods":[{"sl":44}],"name":"test_optionalLong_present","pass":true,"statements":[{"sl":45},{"sl":47}]},"test_3309":{"methods":[{"sl":67}],"name":"test_optionalDouble","pass":true,"statements":[{"sl":68},{"sl":70},{"sl":72},{"sl":74},{"sl":75}]},"test_4125":{"methods":[{"sl":33}],"name":"test_optionalInt","pass":true,"statements":[{"sl":34},{"sl":36},{"sl":38},{"sl":40},{"sl":41}]},"test_4726":{"methods":[{"sl":27}],"name":"test_optionalInt_present","pass":true,"statements":[{"sl":28},{"sl":30}]},"test_4742":{"methods":[{"sl":61}],"name":"test_optionalDouble_present","pass":true,"statements":[{"sl":62},{"sl":64}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [125], [125], [], [125], [], [125], [], [125], [125], [], [], [4726], [4726], [], [4726], [], [], [4125], [4125], [], [4125], [], [4125], [], [4125], [4125], [], [], [2173], [2173], [], [2173], [], [], [2009], [2009], [], [2009], [], [2009], [], [2009], [2009], [], [], [4742], [4742], [], [4742], [], [], [3309], [3309], [], [3309], [], [3309], [], [3309], [3309], [], []]
