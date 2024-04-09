var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":44,"id":53848,"methods":[{"el":14,"sc":5,"sl":12}],"name":"Bug_for_issue_555_setter","sl":10},{"el":19,"id":53850,"methods":[],"name":"Bug_for_issue_555_setter.A","sl":16},{"el":34,"id":53850,"methods":[{"el":28,"sc":9,"sl":26},{"el":32,"sc":9,"sl":30}],"name":"Bug_for_issue_555_setter.B","sl":21},{"el":43,"id":53854,"methods":[{"el":42,"sc":9,"sl":40}],"name":"Bug_for_issue_555_setter.Spec","sl":36}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4796":{"methods":[{"sl":12}],"name":"test_for_issue","pass":false,"statements":[{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [4796], [4796], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
