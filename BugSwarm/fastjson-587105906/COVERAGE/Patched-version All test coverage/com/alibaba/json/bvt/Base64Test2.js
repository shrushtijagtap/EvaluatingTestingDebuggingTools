var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":42159,"methods":[{"el":30,"sc":5,"sl":11},{"el":39,"sc":5,"sl":32}],"name":"Base64Test2","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_100":{"methods":[{"sl":11}],"name":"test_base64_2","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":27}]},"test_1126":{"methods":[{"sl":32}],"name":"test_illegal","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [100], [100], [100], [100], [], [100], [100], [100], [100], [], [], [100], [100], [100], [100], [], [100], [], [], [], [], [1126], [1126], [1126], [1126], [1126], [1126], [1126], [], []]
