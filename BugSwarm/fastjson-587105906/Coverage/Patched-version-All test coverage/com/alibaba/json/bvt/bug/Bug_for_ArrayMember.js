var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":51723,"methods":[{"el":21,"sc":5,"sl":9}],"name":"Bug_for_ArrayMember","sl":8},{"el":35,"id":51732,"methods":[{"el":29,"sc":9,"sl":27},{"el":33,"sc":9,"sl":31}],"name":"Bug_for_ArrayMember.A","sl":23},{"el":39,"id":51736,"methods":[],"name":"Bug_for_ArrayMember.B","sl":37}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1306":{"methods":[{"sl":9},{"sl":27},{"sl":31}],"name":"test_arrayMember","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":19},{"sl":20},{"sl":28},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [1306], [1306], [1306], [], [1306], [], [1306], [1306], [1306], [], [1306], [1306], [], [], [], [], [], [], [1306], [1306], [], [], [1306], [1306], [], [], [], [], [], [], [], []]
