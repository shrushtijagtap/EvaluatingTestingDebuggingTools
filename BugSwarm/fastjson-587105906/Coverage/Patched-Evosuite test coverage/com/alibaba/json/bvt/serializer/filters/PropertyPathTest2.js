var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":68,"id":87540,"methods":[{"el":29,"sc":5,"sl":15}],"name":"PropertyPathTest2","sl":13},{"el":43,"id":87550,"methods":[{"el":41,"sc":9,"sl":33}],"name":"PropertyPathTest2.MyPropertyPreFilter","sl":31},{"el":67,"id":87557,"methods":[{"el":53,"sc":9,"sl":51},{"el":57,"sc":9,"sl":55},{"el":61,"sc":9,"sl":59},{"el":65,"sc":9,"sl":63}],"name":"PropertyPathTest2.Person","sl":45}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1111":{"methods":[{"sl":15},{"sl":33},{"sl":51},{"sl":55},{"sl":59}],"name":"test_path","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":19},{"sl":20},{"sl":22},{"sl":23},{"sl":25},{"sl":26},{"sl":28},{"sl":34},{"sl":36},{"sl":37},{"sl":40},{"sl":52},{"sl":56},{"sl":60}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1111], [1111], [1111], [], [1111], [1111], [], [1111], [1111], [], [1111], [1111], [], [1111], [], [], [], [], [1111], [1111], [], [1111], [1111], [], [], [1111], [], [], [], [], [], [], [], [], [], [], [1111], [1111], [], [], [1111], [1111], [], [], [1111], [1111], [], [], [], [], [], [], [], []]
