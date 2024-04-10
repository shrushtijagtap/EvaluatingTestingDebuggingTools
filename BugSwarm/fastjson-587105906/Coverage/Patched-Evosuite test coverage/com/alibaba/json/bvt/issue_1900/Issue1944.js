var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":14,"id":63137,"methods":[{"el":9,"sc":5,"sl":7}],"name":"Issue1944","sl":6},{"el":13,"id":63139,"methods":[],"name":"Issue1944.Model","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3839":{"methods":[{"sl":7}],"name":"test_for_issue","pass":true,"statements":[{"sl":8}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [3839], [3839], [], [], [], [], [], []]
