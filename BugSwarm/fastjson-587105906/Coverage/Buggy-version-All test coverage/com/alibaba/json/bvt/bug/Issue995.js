var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":57934,"methods":[{"el":14,"sc":5,"sl":10}],"name":"Issue995","sl":9},{"el":18,"id":57937,"methods":[],"name":"Issue995.Person","sl":16},{"el":22,"id":57937,"methods":[],"name":"Issue995.Nose","sl":20}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4565":{"methods":[{"sl":10}],"name":"test_for_issue","pass":true,"statements":[{"sl":11},{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [4565], [4565], [], [4565], [], [], [], [], [], [], [], [], [], []]
