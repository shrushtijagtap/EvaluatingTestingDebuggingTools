var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":33,"id":81931,"methods":[{"el":18,"sc":5,"sl":13},{"el":25,"sc":5,"sl":20},{"el":32,"sc":5,"sl":27}],"name":"RefTest4","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2014":{"methods":[{"sl":20}],"name":"test_decimal","pass":true,"statements":[{"sl":21},{"sl":22},{"sl":23},{"sl":24}]},"test_4095":{"methods":[{"sl":27}],"name":"test_integer","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":31}]},"test_617":{"methods":[{"sl":13}],"name":"test_str","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [617], [617], [617], [617], [617], [], [], [2014], [2014], [2014], [2014], [2014], [], [], [4095], [4095], [4095], [4095], [4095], [], []]
