var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":52,"id":52360,"methods":[{"el":16,"sc":2,"sl":10}],"name":"Bug_for_array","sl":9},{"el":29,"id":52365,"methods":[{"el":23,"sc":3,"sl":21},{"el":27,"sc":3,"sl":25}],"name":"Bug_for_array.A","sl":18},{"el":51,"id":52369,"methods":[{"el":36,"sc":3,"sl":34},{"el":41,"sc":3,"sl":38},{"el":45,"sc":3,"sl":43},{"el":49,"sc":3,"sl":47}],"name":"Bug_for_array.B","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2709":{"methods":[{"sl":10},{"sl":21},{"sl":25},{"sl":38},{"sl":43},{"sl":47}],"name":"test_array","pass":true,"statements":[{"sl":11},{"sl":13},{"sl":14},{"sl":15},{"sl":22},{"sl":26},{"sl":39},{"sl":40},{"sl":44},{"sl":48}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [2709], [2709], [], [2709], [2709], [2709], [], [], [], [], [], [2709], [2709], [], [], [2709], [2709], [], [], [], [], [], [], [], [], [], [], [], [2709], [2709], [2709], [], [], [2709], [2709], [], [], [2709], [2709], [], [], [], []]
