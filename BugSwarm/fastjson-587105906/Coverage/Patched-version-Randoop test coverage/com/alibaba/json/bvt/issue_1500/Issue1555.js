var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":89,"id":61806,"methods":[{"el":21,"sc":5,"sl":10},{"el":38,"sc":5,"sl":27}],"name":"Issue1555","sl":9},{"el":61,"id":61824,"methods":[{"el":48,"sc":9,"sl":46},{"el":52,"sc":9,"sl":50},{"el":56,"sc":9,"sl":54},{"el":60,"sc":9,"sl":58}],"name":"Issue1555.Model","sl":41},{"el":88,"id":61832,"methods":[{"el":75,"sc":9,"sl":73},{"el":79,"sc":9,"sl":77},{"el":83,"sc":9,"sl":81},{"el":87,"sc":9,"sl":85}],"name":"Issue1555.ModelTwo","sl":64}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2284":{"methods":[{"sl":27},{"sl":50},{"sl":58},{"sl":73},{"sl":81}],"name":"test_when_JSONField_have_not_name_attr","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":34},{"sl":36},{"sl":37},{"sl":51},{"sl":59},{"sl":74},{"sl":82}]},"test_492":{"methods":[{"sl":10},{"sl":46},{"sl":50},{"sl":54},{"sl":58}],"name":"test_for_issue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":17},{"sl":19},{"sl":20},{"sl":47},{"sl":51},{"sl":55},{"sl":59}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [492], [492], [492], [492], [492], [492], [], [492], [], [492], [492], [], [], [], [], [], [], [2284], [2284], [2284], [2284], [2284], [2284], [], [2284], [], [2284], [2284], [], [], [], [], [], [], [], [], [492], [492], [], [], [2284, 492], [2284, 492], [], [], [492], [492], [], [], [2284, 492], [2284, 492], [], [], [], [], [], [], [], [], [], [], [], [], [], [2284], [2284], [], [], [], [], [], [], [2284], [2284], [], [], [], [], [], [], []]
