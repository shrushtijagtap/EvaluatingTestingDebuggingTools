var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":86000,"methods":[{"el":23,"sc":5,"sl":11}],"name":"TestInnerClass2","sl":9},{"el":41,"id":86009,"methods":[{"el":31,"sc":9,"sl":29},{"el":35,"sc":9,"sl":33},{"el":39,"sc":9,"sl":37}],"name":"TestInnerClass2.VO","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3522":{"methods":[{"sl":11},{"sl":29},{"sl":33}],"name":"test_inner","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":16},{"sl":17},{"sl":18},{"sl":20},{"sl":22},{"sl":30},{"sl":34}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3522], [3522], [3522], [3522], [], [3522], [3522], [3522], [], [3522], [], [3522], [], [], [], [], [], [], [3522], [3522], [], [], [3522], [3522], [], [], [], [], [], [], [], []]
