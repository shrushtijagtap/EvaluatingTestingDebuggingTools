var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":60,"id":57261,"methods":[{"el":18,"sc":5,"sl":11}],"name":"Issue69","sl":9},{"el":43,"id":57267,"methods":[{"el":29,"sc":9,"sl":27},{"el":33,"sc":9,"sl":31},{"el":37,"sc":9,"sl":35},{"el":41,"sc":9,"sl":39}],"name":"Issue69.VO","sl":21},{"el":59,"id":57275,"methods":[{"el":51,"sc":9,"sl":49},{"el":56,"sc":9,"sl":54}],"name":"Issue69.Entry","sl":45}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1850":{"methods":[{"sl":11},{"sl":27},{"sl":35},{"sl":49}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":16},{"sl":17},{"sl":28},{"sl":36},{"sl":50}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [1850], [1850], [1850], [1850], [], [1850], [1850], [], [], [], [], [], [], [], [], [], [1850], [1850], [], [], [], [], [], [], [1850], [1850], [], [], [], [], [], [], [], [], [], [], [], [], [1850], [1850], [], [], [], [], [], [], [], [], [], []]
