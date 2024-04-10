var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":56577,"methods":[{"el":25,"sc":5,"sl":12}],"name":"Issue166","sl":10},{"el":39,"id":56584,"methods":[{"el":33,"sc":9,"sl":31},{"el":37,"sc":9,"sl":35}],"name":"Issue166.VO","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3373":{"methods":[{"sl":12},{"sl":31},{"sl":35}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":16},{"sl":20},{"sl":22},{"sl":24},{"sl":32},{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [3373], [3373], [3373], [], [3373], [], [], [], [3373], [], [3373], [], [3373], [], [], [], [], [], [], [3373], [3373], [], [], [3373], [3373], [], [], [], []]
