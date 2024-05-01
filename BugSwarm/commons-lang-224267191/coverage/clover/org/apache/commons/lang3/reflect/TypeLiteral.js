var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":123,"id":17440,"methods":[{"el":95,"sc":5,"sl":89},{"el":107,"sc":5,"sl":97},{"el":112,"sc":5,"sl":109},{"el":117,"sc":5,"sl":114},{"el":122,"sc":5,"sl":119}],"name":"TypeLiteral","sl":74}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1687":{"methods":[{"sl":89}],"name":"testBasic","pass":true,"statements":[{"sl":90},{"sl":94}]},"test_2680":{"methods":[{"sl":89},{"sl":119}],"name":"testTyped","pass":true,"statements":[{"sl":90},{"sl":94},{"sl":121}]},"test_3135":{"methods":[{"sl":89},{"sl":97}],"name":"testEquals","pass":true,"statements":[{"sl":90},{"sl":94},{"sl":99},{"sl":102},{"sl":105},{"sl":106}]},"test_3216":{"methods":[{"sl":89}],"name":"testRaw","pass":true,"statements":[{"sl":90}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3216, 3135, 2680, 1687], [3216, 3135, 2680, 1687], [], [], [], [3135, 2680, 1687], [], [], [3135], [], [3135], [], [], [3135], [], [], [3135], [3135], [], [], [], [], [], [], [], [], [], [], [], [], [2680], [], [2680], [], []]
