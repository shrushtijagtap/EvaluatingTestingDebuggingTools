var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":36,"id":86598,"methods":[{"el":25,"sc":5,"sl":16},{"el":30,"sc":5,"sl":27}],"name":"EnumTest","sl":10},{"el":14,"id":86598,"methods":[],"name":"EnumTest.Type","sl":12},{"el":34,"id":86609,"methods":[],"name":"EnumTest.Model","sl":32}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3020":{"methods":[{"sl":16}],"name":"test_enum","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":21},{"sl":22},{"sl":23},{"sl":24}]},"test_3123":{"methods":[{"sl":27}],"name":"test_empty","pass":true,"statements":[{"sl":28},{"sl":29}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3020], [3020], [3020], [3020], [], [3020], [3020], [3020], [3020], [], [], [3123], [3123], [3123], [], [], [], [], [], [], []]
