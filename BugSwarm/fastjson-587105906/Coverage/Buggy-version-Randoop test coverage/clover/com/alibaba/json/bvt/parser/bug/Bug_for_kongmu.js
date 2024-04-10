var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":103,"id":73085,"methods":[{"el":21,"sc":5,"sl":7}],"name":"Bug_for_kongmu","sl":6},{"el":65,"id":73088,"methods":[{"el":30,"sc":9,"sl":28},{"el":34,"sc":9,"sl":32},{"el":38,"sc":9,"sl":36},{"el":42,"sc":9,"sl":40}],"name":"Bug_for_kongmu.BaseDO","sl":24},{"el":64,"id":73096,"methods":[{"el":53,"sc":13,"sl":51},{"el":59,"sc":13,"sl":57},{"el":63,"sc":13,"sl":61}],"name":"Bug_for_kongmu.BaseDO.Result","sl":45},{"el":102,"id":73102,"methods":[{"el":73,"sc":9,"sl":71},{"el":77,"sc":9,"sl":75},{"el":81,"sc":9,"sl":79},{"el":85,"sc":9,"sl":83}],"name":"Bug_for_kongmu.Child","sl":67},{"el":101,"id":73110,"methods":[{"el":93,"sc":13,"sl":91},{"el":96,"sc":13,"sl":94},{"el":100,"sc":13,"sl":98}],"name":"Bug_for_kongmu.Child.Toy","sl":88}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1468":{"methods":[{"sl":7},{"sl":32},{"sl":40},{"sl":51},{"sl":61},{"sl":75},{"sl":83},{"sl":91},{"sl":98}],"name":"test_for_bug","pass":true,"statements":[{"sl":8},{"sl":19},{"sl":33},{"sl":41},{"sl":52},{"sl":62},{"sl":76},{"sl":84},{"sl":92},{"sl":99}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [1468], [1468], [], [], [], [], [], [], [], [], [], [], [1468], [], [], [], [], [], [], [], [], [], [], [], [], [1468], [1468], [], [], [], [], [], [], [1468], [1468], [], [], [], [], [], [], [], [], [], [1468], [1468], [], [], [], [], [], [], [], [], [1468], [1468], [], [], [], [], [], [], [], [], [], [], [], [], [1468], [1468], [], [], [], [], [], [], [1468], [1468], [], [], [], [], [], [], [1468], [1468], [], [], [], [], [], [1468], [1468], [], [], [], []]
