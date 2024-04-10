var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":54889,"methods":[{"el":11,"sc":5,"sl":9},{"el":15,"sc":5,"sl":13},{"el":19,"sc":5,"sl":17}],"name":"Bug_for_primitive_boolean","sl":7},{"el":33,"id":54895,"methods":[{"el":27,"sc":9,"sl":25},{"el":31,"sc":9,"sl":29}],"name":"Bug_for_primitive_boolean.VO","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1603":{"methods":[{"sl":13}],"name":"test_null","pass":true,"statements":[{"sl":14}]},"test_1665":{"methods":[{"sl":9}],"name":"test_emptyStr","pass":true,"statements":[{"sl":10}]},"test_3490":{"methods":[{"sl":17}],"name":"test_strNull","pass":true,"statements":[{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [1665], [1665], [], [], [1603], [1603], [], [], [3490], [3490], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
