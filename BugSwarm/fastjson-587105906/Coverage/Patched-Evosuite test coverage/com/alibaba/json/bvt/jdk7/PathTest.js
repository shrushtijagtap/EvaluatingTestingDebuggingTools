var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":39,"id":64680,"methods":[{"el":27,"sc":5,"sl":13},{"el":34,"sc":5,"sl":29}],"name":"PathTest","sl":12},{"el":38,"id":64691,"methods":[],"name":"PathTest.Model","sl":36}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2340":{"methods":[{"sl":29}],"name":"test_for_null","pass":true,"statements":[{"sl":30},{"sl":32},{"sl":33}]},"test_2379":{"methods":[{"sl":13}],"name":"test_for_path","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":17},{"sl":18},{"sl":25},{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [2379], [2379], [2379], [], [2379], [2379], [], [], [], [], [], [], [2379], [2379], [], [], [2340], [2340], [], [2340], [2340], [], [], [], [], [], []]
