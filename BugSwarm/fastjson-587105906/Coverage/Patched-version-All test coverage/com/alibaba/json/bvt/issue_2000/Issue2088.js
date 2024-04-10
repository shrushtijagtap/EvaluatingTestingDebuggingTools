var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":44,"id":64487,"methods":[{"el":16,"sc":5,"sl":13},{"el":27,"sc":5,"sl":18},{"el":38,"sc":5,"sl":29}],"name":"Issue2088","sl":12},{"el":43,"id":64504,"methods":[],"name":"Issue2088.Model","sl":40}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3203":{"methods":[{"sl":29}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":33},{"sl":34},{"sl":35},{"sl":37}]},"test_792":{"methods":[{"sl":18}],"name":"test_for_issue","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":22},{"sl":23},{"sl":24},{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [792], [792], [792], [], [792], [792], [792], [], [792], [], [], [3203], [3203], [3203], [], [3203], [3203], [3203], [], [3203], [], [], [], [], [], [], []]
