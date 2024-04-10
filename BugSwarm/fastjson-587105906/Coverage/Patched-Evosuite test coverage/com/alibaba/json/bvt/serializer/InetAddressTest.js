var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":82052,"methods":[{"el":23,"sc":5,"sl":13},{"el":27,"sc":5,"sl":25},{"el":31,"sc":5,"sl":29}],"name":"InetAddressTest","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1830":{"methods":[{"sl":25}],"name":"test_null","pass":true,"statements":[{"sl":26}]},"test_3141":{"methods":[{"sl":29}],"name":"test_empty","pass":true,"statements":[{"sl":30}]},"test_3226":{"methods":[{"sl":13}],"name":"test_inetAddress","pass":true,"statements":[{"sl":14},{"sl":16},{"sl":18},{"sl":20},{"sl":21},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [3226], [3226], [], [3226], [], [3226], [], [3226], [3226], [3226], [], [], [1830], [1830], [], [], [3141], [3141], [], []]
