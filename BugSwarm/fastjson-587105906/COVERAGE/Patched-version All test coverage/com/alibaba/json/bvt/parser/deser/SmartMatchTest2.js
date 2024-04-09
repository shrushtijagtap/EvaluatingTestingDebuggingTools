var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":53,"id":75568,"methods":[{"el":17,"sc":5,"sl":12},{"el":24,"sc":5,"sl":19}],"name":"SmartMatchTest2","sl":10},{"el":38,"id":75576,"methods":[{"el":32,"sc":9,"sl":30},{"el":36,"sc":9,"sl":34}],"name":"SmartMatchTest2.VO","sl":26},{"el":52,"id":75580,"methods":[{"el":46,"sc":9,"sl":44},{"el":50,"sc":9,"sl":48}],"name":"SmartMatchTest2.VO2","sl":40}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2605":{"methods":[{"sl":19},{"sl":44},{"sl":48}],"name":"test_vo2","pass":true,"statements":[{"sl":20},{"sl":22},{"sl":23},{"sl":45},{"sl":49}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2605], [2605], [], [2605], [2605], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2605], [2605], [], [], [2605], [2605], [], [], [], []]
