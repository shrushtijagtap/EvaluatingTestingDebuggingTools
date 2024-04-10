var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":24,"id":83181,"methods":[{"el":23,"sc":5,"sl":13}],"name":"FileTest","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_304":{"methods":[{"sl":13}],"name":"test_file","pass":true,"statements":[{"sl":14},{"sl":16},{"sl":18},{"sl":20},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [304], [304], [], [304], [], [304], [], [304], [], [304], [], []]
