var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":58169,"methods":[{"el":13,"sc":5,"sl":11},{"el":17,"sc":5,"sl":15},{"el":21,"sc":5,"sl":19},{"el":25,"sc":5,"sl":23}],"name":"bug_for_pengsong0302","sl":9},{"el":44,"id":58177,"methods":[{"el":34,"sc":9,"sl":31},{"el":38,"sc":9,"sl":36},{"el":42,"sc":9,"sl":40}],"name":"bug_for_pengsong0302.A","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_413":{"methods":[{"sl":11}],"name":"test_0","pass":true,"statements":[{"sl":12}]},"test_4611":{"methods":[{"sl":23},{"sl":31},{"sl":36}],"name":"test_2029_1","pass":true,"statements":[{"sl":24},{"sl":32},{"sl":33},{"sl":37}]},"test_638":{"methods":[{"sl":15},{"sl":31},{"sl":36}],"name":"test_1","pass":true,"statements":[{"sl":16},{"sl":32},{"sl":33},{"sl":37}]},"test_639":{"methods":[{"sl":19}],"name":"test_2029","pass":true,"statements":[{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [413], [413], [], [], [638], [638], [], [], [639], [639], [], [], [4611], [4611], [], [], [], [], [], [], [638, 4611], [638, 4611], [638, 4611], [], [], [638, 4611], [638, 4611], [], [], [], [], [], [], [], []]
