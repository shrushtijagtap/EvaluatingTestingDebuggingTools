var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":69,"id":74794,"methods":[{"el":15,"sc":5,"sl":13},{"el":19,"sc":5,"sl":17},{"el":23,"sc":5,"sl":21},{"el":27,"sc":5,"sl":25},{"el":31,"sc":5,"sl":29},{"el":41,"sc":5,"sl":33}],"name":"EnumTest","sl":11},{"el":45,"id":74810,"methods":[],"name":"EnumTest.E","sl":43},{"el":68,"id":74810,"methods":[{"el":53,"sc":9,"sl":51},{"el":58,"sc":9,"sl":55},{"el":62,"sc":9,"sl":60},{"el":66,"sc":9,"sl":64}],"name":"EnumTest.Entity","sl":47}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1886":{"methods":[{"sl":33}],"name":"test_enum_error_2","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":36},{"sl":38},{"sl":40}]},"test_224":{"methods":[{"sl":29}],"name":"test_enum_error","pass":false,"statements":[{"sl":30}]},"test_3315":{"methods":[{"sl":21},{"sl":51},{"sl":60},{"sl":64}],"name":"test_enum_3","pass":true,"statements":[{"sl":22},{"sl":61},{"sl":65}]},"test_3825":{"methods":[{"sl":17}],"name":"test_enum_1","pass":true,"statements":[{"sl":18}]},"test_4080":{"methods":[{"sl":13}],"name":"test_enum","pass":false,"statements":[{"sl":14}]},"test_4615":{"methods":[{"sl":25}],"name":"test_enum_2","pass":false,"statements":[{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [4080], [4080], [], [], [3825], [3825], [], [], [3315], [3315], [], [], [4615], [4615], [], [], [224], [224], [], [], [1886], [1886], [1886], [1886], [], [1886], [], [1886], [], [], [], [], [], [], [], [], [], [], [3315], [], [], [], [], [], [], [], [], [3315], [3315], [], [], [3315], [3315], [], [], [], []]
