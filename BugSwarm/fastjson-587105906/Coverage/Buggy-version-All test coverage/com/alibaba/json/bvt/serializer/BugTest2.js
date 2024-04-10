var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":51,"id":82454,"methods":[{"el":16,"sc":5,"sl":10}],"name":"BugTest2","sl":8},{"el":50,"id":82459,"methods":[{"el":28,"sc":9,"sl":23},{"el":32,"sc":9,"sl":30},{"el":36,"sc":9,"sl":34},{"el":40,"sc":9,"sl":38},{"el":44,"sc":9,"sl":42},{"el":48,"sc":9,"sl":46}],"name":"BugTest2.A","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4868":{"methods":[{"sl":10},{"sl":30},{"sl":38}],"name":"test_0","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":15},{"sl":31},{"sl":39}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [4868], [4868], [4868], [4868], [], [4868], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4868], [4868], [], [], [], [], [], [], [4868], [4868], [], [], [], [], [], [], [], [], [], [], [], []]
