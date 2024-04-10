var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":65,"id":64155,"methods":[{"el":25,"sc":5,"sl":11}],"name":"Issue1834","sl":10},{"el":44,"id":64167,"methods":[{"el":32,"sc":9,"sl":30},{"el":36,"sc":9,"sl":34},{"el":43,"sc":9,"sl":38}],"name":"Issue1834.IndexQuery_Comparable","sl":27},{"el":63,"id":64173,"methods":[{"el":51,"sc":9,"sl":49},{"el":55,"sc":9,"sl":53},{"el":62,"sc":9,"sl":57}],"name":"Issue1834.IndexQuery_Number","sl":46}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1246":{"methods":[{"sl":11},{"sl":30},{"sl":34},{"sl":49},{"sl":53}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":18},{"sl":19},{"sl":20},{"sl":22},{"sl":23},{"sl":24},{"sl":31},{"sl":35},{"sl":50},{"sl":54}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [1246], [1246], [1246], [1246], [1246], [1246], [], [1246], [1246], [1246], [], [1246], [1246], [1246], [], [], [], [], [], [1246], [1246], [], [], [1246], [1246], [], [], [], [], [], [], [], [], [], [], [], [], [], [1246], [1246], [], [], [1246], [1246], [], [], [], [], [], [], [], [], [], [], []]
