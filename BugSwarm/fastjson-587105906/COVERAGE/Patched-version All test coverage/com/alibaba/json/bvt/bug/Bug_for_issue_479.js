var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":90,"id":53884,"methods":[{"el":14,"sc":5,"sl":11},{"el":23,"sc":5,"sl":16},{"el":32,"sc":5,"sl":25}],"name":"Bug_for_issue_479","sl":9},{"el":40,"id":53899,"methods":[],"name":"Bug_for_issue_479.VO","sl":34},{"el":48,"id":53899,"methods":[],"name":"Bug_for_issue_479.V1","sl":42},{"el":89,"id":53899,"methods":[{"el":59,"sc":9,"sl":57},{"el":63,"sc":9,"sl":61},{"el":67,"sc":9,"sl":65},{"el":71,"sc":9,"sl":69},{"el":75,"sc":9,"sl":73},{"el":79,"sc":9,"sl":77},{"el":83,"sc":9,"sl":81},{"el":87,"sc":9,"sl":85}],"name":"Bug_for_issue_479.V2","sl":50}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3840":{"methods":[{"sl":25}],"name":"test_for_issue_private","pass":true,"statements":[{"sl":26},{"sl":28},{"sl":29},{"sl":30},{"sl":31}]},"test_4853":{"methods":[{"sl":16}],"name":"test_for_issue","pass":true,"statements":[{"sl":17},{"sl":19},{"sl":20},{"sl":21},{"sl":22}]},"test_738":{"methods":[{"sl":11}],"name":"test_for_issue_blankinput","pass":true,"statements":[{"sl":12},{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [738], [738], [738], [], [], [4853], [4853], [], [4853], [4853], [4853], [4853], [], [], [3840], [3840], [], [3840], [3840], [3840], [3840], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
