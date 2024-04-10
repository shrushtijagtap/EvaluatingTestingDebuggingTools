var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":53,"id":81219,"methods":[{"el":16,"sc":5,"sl":11},{"el":24,"sc":5,"sl":19}],"name":"JSONPath_object_filter","sl":10},{"el":52,"id":81227,"methods":[{"el":34,"sc":9,"sl":31},{"el":38,"sc":9,"sl":36},{"el":42,"sc":9,"sl":40},{"el":46,"sc":9,"sl":44},{"el":50,"sc":9,"sl":48}],"name":"JSONPath_object_filter.Entity","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1532":{"methods":[{"sl":19},{"sl":31},{"sl":36}],"name":"test_object_filter_not_match","pass":true,"statements":[{"sl":20},{"sl":22},{"sl":23},{"sl":32},{"sl":33},{"sl":37}]},"test_2712":{"methods":[{"sl":11},{"sl":31},{"sl":36}],"name":"test_object_filter","pass":true,"statements":[{"sl":12},{"sl":14},{"sl":15},{"sl":32},{"sl":33},{"sl":37}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [2712], [2712], [], [2712], [2712], [], [], [], [1532], [1532], [], [1532], [1532], [], [], [], [], [], [], [], [2712, 1532], [2712, 1532], [2712, 1532], [], [], [2712, 1532], [2712, 1532], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
