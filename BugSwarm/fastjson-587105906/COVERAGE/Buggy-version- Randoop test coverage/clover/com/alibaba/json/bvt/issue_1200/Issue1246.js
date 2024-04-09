var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":79,"id":60299,"methods":[{"el":35,"sc":5,"sl":14}],"name":"Issue1246","sl":13},{"el":39,"id":60315,"methods":[],"name":"Issue1246.C","sl":37},{"el":51,"id":60315,"methods":[{"el":46,"sc":9,"sl":44},{"el":50,"sc":9,"sl":48}],"name":"Issue1246.D","sl":41},{"el":63,"id":60319,"methods":[{"el":58,"sc":9,"sl":56},{"el":62,"sc":9,"sl":60}],"name":"Issue1246.A","sl":53},{"el":78,"id":60323,"methods":[{"el":72,"sc":9,"sl":68},{"el":77,"sc":9,"sl":74}],"name":"Issue1246.B","sl":65}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2802":{"methods":[{"sl":14},{"sl":44},{"sl":48},{"sl":74}],"name":"test_for_issue","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":18},{"sl":19},{"sl":20},{"sl":22},{"sl":23},{"sl":25},{"sl":26},{"sl":27},{"sl":29},{"sl":30},{"sl":32},{"sl":33},{"sl":34},{"sl":45},{"sl":49},{"sl":76}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [2802], [2802], [2802], [], [2802], [2802], [2802], [], [2802], [2802], [], [2802], [2802], [2802], [], [2802], [2802], [], [2802], [2802], [2802], [], [], [], [], [], [], [], [], [], [2802], [2802], [], [], [2802], [2802], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2802], [], [2802], [], [], []]
