var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":65,"id":65096,"methods":[{"el":15,"sc":5,"sl":11},{"el":21,"sc":5,"sl":17},{"el":27,"sc":5,"sl":23},{"el":33,"sc":5,"sl":29},{"el":39,"sc":5,"sl":35},{"el":45,"sc":5,"sl":41},{"el":51,"sc":5,"sl":47}],"name":"Issue2260","sl":10},{"el":55,"id":65124,"methods":[],"name":"Issue2260.M1","sl":53},{"el":59,"id":65124,"methods":[],"name":"Issue2260.M2","sl":57},{"el":63,"id":65124,"methods":[],"name":"Issue2260.M3","sl":61}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2071":{"methods":[{"sl":29}],"name":"test_for_jdk8_zdt_3","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32}]},"test_2550":{"methods":[{"sl":11}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14}]},"test_2683":{"methods":[{"sl":23}],"name":"test_for_jdk8_zdt_2","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26}]},"test_3175":{"methods":[{"sl":17}],"name":"test_for_jdk8_zdt_1","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20}]},"test_3377":{"methods":[{"sl":41}],"name":"test_for_jdk8_ldt_2","pass":true,"statements":[{"sl":42},{"sl":43},{"sl":44}]},"test_4218":{"methods":[{"sl":47}],"name":"test_for_jdk8_ldt_3","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50}]},"test_4862":{"methods":[{"sl":35}],"name":"test_for_jdk8_ldt_1","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [2550], [2550], [2550], [2550], [], [], [3175], [3175], [3175], [3175], [], [], [2683], [2683], [2683], [2683], [], [], [2071], [2071], [2071], [2071], [], [], [4862], [4862], [4862], [4862], [], [], [3377], [3377], [3377], [3377], [], [], [4218], [4218], [4218], [4218], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
