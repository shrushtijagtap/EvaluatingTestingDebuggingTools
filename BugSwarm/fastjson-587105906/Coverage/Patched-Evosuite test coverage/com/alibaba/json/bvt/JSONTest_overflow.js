var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":44442,"methods":[{"el":19,"sc":5,"sl":12},{"el":28,"sc":5,"sl":21}],"name":"JSONTest_overflow","sl":10},{"el":42,"id":44454,"methods":[{"el":36,"sc":9,"sl":34},{"el":40,"sc":9,"sl":38}],"name":"JSONTest_overflow.Entity","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_171":{"methods":[{"sl":21},{"sl":34},{"sl":38}],"name":"test_overflow_1","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":25},{"sl":26},{"sl":27},{"sl":35},{"sl":39}]},"test_950":{"methods":[{"sl":12},{"sl":34},{"sl":38}],"name":"test_overflow","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":16},{"sl":17},{"sl":18},{"sl":35},{"sl":39}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [950], [950], [950], [], [950], [950], [950], [], [], [171], [171], [171], [], [171], [171], [171], [], [], [], [], [], [], [171, 950], [171, 950], [], [], [171, 950], [171, 950], [], [], [], []]
