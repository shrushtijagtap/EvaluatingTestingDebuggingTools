var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":66885,"methods":[{"el":25,"sc":5,"sl":11}],"name":"Issue1750","sl":10},{"el":41,"id":66893,"methods":[{"el":40,"sc":9,"sl":29}],"name":"Issue1750.ExtClassLoader","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1214":{"methods":[{"sl":11},{"sl":29}],"name":"test_user","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":15},{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":30},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [1214], [1214], [1214], [], [1214], [], [], [], [], [], [1214], [1214], [1214], [1214], [], [], [], [], [1214], [1214], [], [], [1214], [1214], [1214], [1214], [], [1214], [], [], [], []]
