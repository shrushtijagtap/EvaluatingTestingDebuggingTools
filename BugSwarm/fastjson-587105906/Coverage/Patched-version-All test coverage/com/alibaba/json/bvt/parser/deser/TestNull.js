var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":38,"id":75732,"methods":[{"el":19,"sc":5,"sl":15},{"el":25,"sc":5,"sl":21},{"el":31,"sc":5,"sl":27},{"el":37,"sc":5,"sl":33}],"name":"TestNull","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2480":{"methods":[{"sl":27}],"name":"test_short","pass":true,"statements":[{"sl":28},{"sl":30}]},"test_3010":{"methods":[{"sl":21}],"name":"test_char","pass":true,"statements":[{"sl":22},{"sl":24}]},"test_908":{"methods":[{"sl":15}],"name":"test_byte","pass":true,"statements":[{"sl":16},{"sl":18}]},"test_933":{"methods":[{"sl":33}],"name":"test_null","pass":true,"statements":[{"sl":34},{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [908], [908], [], [908], [], [], [3010], [3010], [], [3010], [], [], [2480], [2480], [], [2480], [], [], [933], [933], [], [933], [], []]
