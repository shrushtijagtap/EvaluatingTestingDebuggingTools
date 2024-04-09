var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":81756,"methods":[{"el":15,"sc":5,"sl":11},{"el":23,"sc":5,"sl":17},{"el":31,"sc":5,"sl":25},{"el":39,"sc":5,"sl":33},{"el":44,"sc":5,"sl":41},{"el":49,"sc":5,"sl":46}],"name":"RefTest2","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_135":{"methods":[{"sl":11}],"name":"test_ref","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14}]},"test_2652":{"methods":[{"sl":25}],"name":"test_ref_2","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":30}]},"test_3848":{"methods":[{"sl":46}],"name":"test_parse_1","pass":true,"statements":[{"sl":47},{"sl":48}]},"test_3864":{"methods":[{"sl":17}],"name":"test_ref_1","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22}]},"test_4162":{"methods":[{"sl":33}],"name":"test_ref_3","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38}]},"test_4414":{"methods":[{"sl":41}],"name":"test_parse","pass":true,"statements":[{"sl":42},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [135], [135], [135], [135], [], [], [3864], [3864], [3864], [3864], [3864], [3864], [], [], [2652], [2652], [2652], [2652], [2652], [2652], [], [], [4162], [4162], [4162], [4162], [4162], [4162], [], [], [4414], [4414], [4414], [], [], [3848], [3848], [3848], [], []]
