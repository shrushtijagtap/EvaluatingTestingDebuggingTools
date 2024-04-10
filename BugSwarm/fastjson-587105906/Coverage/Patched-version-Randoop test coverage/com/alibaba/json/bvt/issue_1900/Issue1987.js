var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":47,"id":64284,"methods":[{"el":33,"sc":5,"sl":11}],"name":"Issue1987","sl":10},{"el":46,"id":64295,"methods":[{"el":41,"sc":9,"sl":39},{"el":45,"sc":9,"sl":43}],"name":"Issue1987.JsonExample","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_453":{"methods":[{"sl":11},{"sl":39},{"sl":43}],"name":"test_for_issue","pass":false,"statements":[{"sl":12},{"sl":15},{"sl":19},{"sl":20},{"sl":23},{"sl":40},{"sl":44}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [453], [453], [], [], [453], [], [], [], [453], [453], [], [], [453], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [453], [453], [], [], [453], [453], [], [], []]
