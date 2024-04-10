var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":27,"id":58215,"methods":[{"el":14,"sc":5,"sl":9}],"name":"Bug20190729_01","sl":7},{"el":26,"id":58219,"methods":[{"el":21,"sc":9,"sl":19},{"el":25,"sc":9,"sl":23}],"name":"Bug20190729_01.BucketInfo","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_586":{"methods":[{"sl":9},{"sl":23}],"name":"test_for_issue","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":13},{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [586], [586], [586], [], [586], [], [], [], [], [], [], [], [], [], [586], [586], [], [], [], []]
