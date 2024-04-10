var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":63111,"methods":[{"el":20,"sc":5,"sl":10}],"name":"Issue1580_private","sl":9},{"el":41,"id":63119,"methods":[{"el":28,"sc":9,"sl":26},{"el":32,"sc":9,"sl":30},{"el":36,"sc":9,"sl":34},{"el":40,"sc":9,"sl":38}],"name":"Issue1580_private.Model","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2272":{"methods":[{"sl":10},{"sl":26}],"name":"test_for_issue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":14},{"sl":15},{"sl":16},{"sl":18},{"sl":19},{"sl":27}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [2272], [2272], [2272], [], [2272], [2272], [2272], [], [2272], [2272], [], [], [], [], [], [], [2272], [2272], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
