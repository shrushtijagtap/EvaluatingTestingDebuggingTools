var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":36,"id":80257,"methods":[{"el":20,"sc":5,"sl":15},{"el":27,"sc":5,"sl":22},{"el":35,"sc":5,"sl":29}],"name":"TestSpecial_3","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1059":{"methods":[{"sl":15}],"name":"test_special","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19}]},"test_2778":{"methods":[{"sl":22}],"name":"test_special_1","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26}]},"test_4715":{"methods":[{"sl":29}],"name":"test_special_2","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1059], [1059], [1059], [1059], [1059], [], [], [2778], [2778], [2778], [2778], [2778], [], [], [4715], [4715], [4715], [4715], [4715], [4715], [], []]
