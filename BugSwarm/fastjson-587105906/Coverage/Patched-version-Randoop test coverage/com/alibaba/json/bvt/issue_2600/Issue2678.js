var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":80,"id":65727,"methods":[{"el":15,"sc":5,"sl":9},{"el":23,"sc":5,"sl":17}],"name":"Issue2678","sl":8},{"el":51,"id":65739,"methods":[{"el":35,"sc":9,"sl":32},{"el":40,"sc":9,"sl":37},{"el":45,"sc":9,"sl":42},{"el":50,"sc":9,"sl":47}],"name":"Issue2678.Person","sl":25},{"el":79,"id":65747,"methods":[{"el":63,"sc":9,"sl":59},{"el":68,"sc":9,"sl":65},{"el":73,"sc":9,"sl":70},{"el":78,"sc":9,"sl":75}],"name":"Issue2678.Person2","sl":53}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3134":{"methods":[{"sl":9},{"sl":32},{"sl":37},{"sl":42},{"sl":47}],"name":"test_field","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":34},{"sl":39},{"sl":44},{"sl":49}]},"test_71":{"methods":[{"sl":17},{"sl":59},{"sl":65},{"sl":70},{"sl":75}],"name":"test_getter","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":62},{"sl":67},{"sl":72},{"sl":77}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [3134], [3134], [3134], [3134], [3134], [3134], [], [], [71], [71], [71], [71], [71], [71], [], [], [], [], [], [], [], [], [], [3134], [], [3134], [], [], [3134], [], [3134], [], [], [3134], [], [3134], [], [], [3134], [], [3134], [], [], [], [], [], [], [], [], [], [71], [], [], [71], [], [], [71], [], [71], [], [], [71], [], [71], [], [], [71], [], [71], [], [], []]
