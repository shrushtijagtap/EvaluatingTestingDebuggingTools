var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":64286,"methods":[{"el":19,"sc":5,"sl":14},{"el":24,"sc":5,"sl":21},{"el":29,"sc":5,"sl":26},{"el":34,"sc":5,"sl":31}],"name":"Issue1901","sl":11},{"el":39,"id":64300,"methods":[],"name":"Issue1901.Model","sl":36}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4089":{"methods":[{"sl":26}],"name":"test_for_issue","pass":true,"statements":[{"sl":27},{"sl":28}]},"test_4137":{"methods":[{"sl":31}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":32},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4089], [4089], [4089], [], [], [4137], [4137], [4137], [], [], [], [], [], [], []]
