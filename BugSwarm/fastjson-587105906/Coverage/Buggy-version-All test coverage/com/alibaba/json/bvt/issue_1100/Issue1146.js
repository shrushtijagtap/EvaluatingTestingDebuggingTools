var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":29,"id":60107,"methods":[{"el":14,"sc":5,"sl":11}],"name":"Issue1146","sl":10},{"el":28,"id":60110,"methods":[{"el":21,"sc":9,"sl":19},{"el":24,"sc":9,"sl":22},{"el":27,"sc":9,"sl":25}],"name":"Issue1146.Test","sl":17}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3680":{"methods":[{"sl":11},{"sl":25}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3680], [3680], [3680], [], [], [], [], [], [], [], [], [], [], [], [3680], [3680], [], [], []]
