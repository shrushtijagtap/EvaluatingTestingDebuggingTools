var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":15,"id":52052,"methods":[{"el":10,"sc":5,"sl":8}],"name":"Bug_for_issue_273","sl":7},{"el":14,"id":52054,"methods":[],"name":"Bug_for_issue_273.VO","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1701":{"methods":[{"sl":8}],"name":"test_for_issue","pass":true,"statements":[{"sl":9}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [1701], [1701], [], [], [], [], [], []]
