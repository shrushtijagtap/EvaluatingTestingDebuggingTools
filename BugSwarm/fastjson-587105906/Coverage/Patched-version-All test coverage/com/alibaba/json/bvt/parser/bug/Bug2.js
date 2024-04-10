var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":56,"id":73144,"methods":[{"el":19,"sc":5,"sl":13},{"el":27,"sc":5,"sl":21}],"name":"Bug2","sl":11},{"el":41,"id":73154,"methods":[{"el":35,"sc":9,"sl":33},{"el":39,"sc":9,"sl":37}],"name":"Bug2.Page","sl":29},{"el":54,"id":73158,"methods":[{"el":49,"sc":9,"sl":47},{"el":53,"sc":9,"sl":51}],"name":"Bug2.Result","sl":43}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3836":{"methods":[{"sl":13},{"sl":33},{"sl":37}],"name":"test_0","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":18},{"sl":34},{"sl":38}]},"test_4866":{"methods":[{"sl":21}],"name":"test_1","pass":false,"statements":[{"sl":22},{"sl":23}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [3836], [3836], [3836], [3836], [], [3836], [], [], [4866], [4866], [4866], [], [], [], [], [], [], [], [], [], [3836], [3836], [], [], [3836], [3836], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
