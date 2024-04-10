var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":18,"id":46866,"methods":[{"el":17,"sc":5,"sl":11}],"name":"XX01","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_233":{"methods":[{"sl":11}],"name":"test_for_xx","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":15},{"sl":16}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [233], [233], [233], [], [233], [233], [], []]
