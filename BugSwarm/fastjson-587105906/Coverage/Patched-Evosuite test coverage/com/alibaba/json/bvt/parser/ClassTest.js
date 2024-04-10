var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":47,"id":66377,"methods":[{"el":16,"sc":5,"sl":10},{"el":23,"sc":5,"sl":18}],"name":"ClassTest","sl":8},{"el":46,"id":66385,"methods":[{"el":32,"sc":9,"sl":30},{"el":36,"sc":9,"sl":34},{"el":40,"sc":9,"sl":38},{"el":44,"sc":9,"sl":42}],"name":"ClassTest.VO","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2950":{"methods":[{"sl":10},{"sl":30},{"sl":34},{"sl":42}],"name":"test_class_array","pass":true,"statements":[{"sl":11},{"sl":13},{"sl":15},{"sl":31},{"sl":35},{"sl":43}]},"test_4533":{"methods":[{"sl":18},{"sl":30},{"sl":34},{"sl":42}],"name":"test_class","pass":true,"statements":[{"sl":19},{"sl":21},{"sl":22},{"sl":31},{"sl":35},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [2950], [2950], [], [2950], [], [2950], [], [], [4533], [4533], [], [4533], [4533], [], [], [], [], [], [], [], [4533, 2950], [4533, 2950], [], [], [4533, 2950], [4533, 2950], [], [], [], [], [], [], [4533, 2950], [4533, 2950], [], [], [], []]
