var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":57180,"methods":[{"el":25,"sc":5,"sl":19},{"el":34,"sc":5,"sl":27}],"name":"Issue744","sl":12},{"el":17,"id":57180,"methods":[],"name":"Issue744.Model","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3222":{"methods":[{"sl":19}],"name":"test","pass":true,"statements":[{"sl":20},{"sl":21},{"sl":23},{"sl":24}]},"test_554":{"methods":[{"sl":27}],"name":"test_reader","pass":true,"statements":[{"sl":28},{"sl":30},{"sl":32},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3222], [3222], [3222], [], [3222], [3222], [], [], [554], [554], [], [554], [], [554], [554], [], []]
