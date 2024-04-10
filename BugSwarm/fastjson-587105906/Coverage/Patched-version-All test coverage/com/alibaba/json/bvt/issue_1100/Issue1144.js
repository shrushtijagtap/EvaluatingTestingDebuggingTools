var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":60092,"methods":[{"el":15,"sc":5,"sl":11}],"name":"Issue1144","sl":10},{"el":22,"id":60096,"methods":[],"name":"Issue1144.Model","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4282":{"methods":[{"sl":11}],"name":"test_issue_1144","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [4282], [4282], [4282], [4282], [], [], [], [], [], [], [], [], []]
