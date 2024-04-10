var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":12,"id":51720,"methods":[{"el":11,"sc":5,"sl":8}],"name":"Bug_for_Issue_519","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2880":{"methods":[{"sl":8}],"name":"test_issue","pass":true,"statements":[{"sl":9},{"sl":10}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [2880], [2880], [2880], [], []]
