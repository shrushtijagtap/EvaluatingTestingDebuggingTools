var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":59,"id":63092,"methods":[{"el":12,"sc":5,"sl":7},{"el":19,"sc":5,"sl":14},{"el":27,"sc":5,"sl":22}],"name":"Issue1933","sl":6},{"el":58,"id":63107,"methods":[{"el":37,"sc":9,"sl":35},{"el":41,"sc":9,"sl":39},{"el":45,"sc":9,"sl":43},{"el":49,"sc":9,"sl":47},{"el":53,"sc":9,"sl":51},{"el":57,"sc":9,"sl":55}],"name":"Issue1933.OrderInfoVO","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2225":{"methods":[{"sl":7},{"sl":39}],"name":"test_for_issue","pass":true,"statements":[{"sl":8},{"sl":9},{"sl":10},{"sl":11},{"sl":40}]},"test_4054":{"methods":[{"sl":22},{"sl":55}],"name":"test_for_issue_2","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":56}]},"test_4426":{"methods":[{"sl":14},{"sl":47}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":48}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [2225], [2225], [2225], [2225], [2225], [], [], [4426], [4426], [4426], [4426], [4426], [], [], [], [4054], [4054], [4054], [4054], [4054], [], [], [], [], [], [], [], [], [], [], [], [], [2225], [2225], [], [], [], [], [], [], [4426], [4426], [], [], [], [], [], [], [4054], [4054], [], [], []]
