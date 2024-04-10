var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":59697,"methods":[{"el":19,"sc":5,"sl":13},{"el":27,"sc":5,"sl":21}],"name":"FeaturesTest","sl":11},{"el":42,"id":59707,"methods":[{"el":36,"sc":9,"sl":33},{"el":40,"sc":9,"sl":38}],"name":"FeaturesTest.Entity","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1971":{"methods":[{"sl":13},{"sl":33}],"name":"test_0","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":17},{"sl":18},{"sl":35}]},"test_254":{"methods":[{"sl":21},{"sl":33}],"name":"test_1","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":25},{"sl":26},{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [1971], [1971], [1971], [], [1971], [1971], [], [], [254], [254], [254], [], [254], [254], [], [], [], [], [], [], [1971, 254], [], [1971, 254], [], [], [], [], [], [], [], []]
