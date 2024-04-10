var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":44,"id":56562,"methods":[{"el":11,"sc":5,"sl":9},{"el":20,"sc":5,"sl":13}],"name":"Issue146","sl":8},{"el":43,"id":56571,"methods":[{"el":29,"sc":9,"sl":27},{"el":33,"sc":9,"sl":31},{"el":37,"sc":9,"sl":35},{"el":41,"sc":9,"sl":39}],"name":"Issue146.VO","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4490":{"methods":[{"sl":13},{"sl":27},{"sl":31},{"sl":35},{"sl":39}],"name":"test_for_issue","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":28},{"sl":32},{"sl":36},{"sl":40}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [4490], [4490], [4490], [4490], [4490], [4490], [4490], [], [], [], [], [], [], [], [4490], [4490], [], [], [4490], [4490], [], [], [4490], [4490], [], [], [4490], [4490], [], [], [], []]
