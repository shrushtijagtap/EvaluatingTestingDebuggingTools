var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":36,"id":81367,"methods":[{"el":20,"sc":5,"sl":15},{"el":27,"sc":5,"sl":22},{"el":35,"sc":5,"sl":29}],"name":"TestSpecial_3","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1943":{"methods":[{"sl":15}],"name":"test_special","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19}]},"test_3074":{"methods":[{"sl":22}],"name":"test_special_1","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26}]},"test_4256":{"methods":[{"sl":29}],"name":"test_special_2","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1943], [1943], [1943], [1943], [1943], [], [], [3074], [3074], [3074], [3074], [3074], [], [], [4256], [4256], [4256], [4256], [4256], [4256], [], []]
