var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":44,"id":59996,"methods":[{"el":24,"sc":5,"sl":14}],"name":"Issue1151","sl":13},{"el":28,"id":60004,"methods":[],"name":"Issue1151.A","sl":26},{"el":32,"id":60004,"methods":[],"name":"Issue1151.B","sl":30},{"el":43,"id":60004,"methods":[{"el":38,"sc":9,"sl":36},{"el":42,"sc":9,"sl":40}],"name":"Issue1151.C","sl":34}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_149":{"methods":[{"sl":14},{"sl":36},{"sl":40}],"name":"test_for_issue","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":19},{"sl":20},{"sl":22},{"sl":23},{"sl":41}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [149], [149], [149], [149], [], [149], [149], [], [149], [149], [], [], [], [], [], [], [], [], [], [], [], [], [149], [], [], [], [149], [149], [], [], []]
