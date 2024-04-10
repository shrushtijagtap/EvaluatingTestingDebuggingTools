var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":19,"id":81002,"methods":[{"el":12,"sc":5,"sl":9},{"el":17,"sc":5,"sl":14}],"name":"JSONPath_like","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2061":{"methods":[{"sl":9}],"name":"test_like_not_match","pass":true,"statements":[{"sl":10}]},"test_2121":{"methods":[{"sl":14}],"name":"test_like_not_match_1","pass":true,"statements":[{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [2061], [2061], [], [], [], [2121], [2121], [], [], [], []]
