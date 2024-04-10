var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":69,"id":73562,"methods":[{"el":15,"sc":5,"sl":13},{"el":19,"sc":5,"sl":17},{"el":23,"sc":5,"sl":21},{"el":27,"sc":5,"sl":25},{"el":31,"sc":5,"sl":29},{"el":41,"sc":5,"sl":33}],"name":"EnumTest","sl":11},{"el":45,"id":73578,"methods":[],"name":"EnumTest.E","sl":43},{"el":68,"id":73578,"methods":[{"el":53,"sc":9,"sl":51},{"el":58,"sc":9,"sl":55},{"el":62,"sc":9,"sl":60},{"el":66,"sc":9,"sl":64}],"name":"EnumTest.Entity","sl":47}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1450":{"methods":[{"sl":21},{"sl":51},{"sl":60},{"sl":64}],"name":"test_enum_3","pass":true,"statements":[{"sl":22},{"sl":61},{"sl":65}]},"test_2367":{"methods":[{"sl":17}],"name":"test_enum_1","pass":true,"statements":[{"sl":18}]},"test_2853":{"methods":[{"sl":33}],"name":"test_enum_error_2","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":36},{"sl":38},{"sl":40}]},"test_3657":{"methods":[{"sl":29}],"name":"test_enum_error","pass":false,"statements":[{"sl":30}]},"test_4631":{"methods":[{"sl":13}],"name":"test_enum","pass":false,"statements":[{"sl":14}]},"test_646":{"methods":[{"sl":25}],"name":"test_enum_2","pass":false,"statements":[{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [4631], [4631], [], [], [2367], [2367], [], [], [1450], [1450], [], [], [646], [646], [], [], [3657], [3657], [], [], [2853], [2853], [2853], [2853], [], [2853], [], [2853], [], [], [], [], [], [], [], [], [], [], [1450], [], [], [], [], [], [], [], [], [1450], [1450], [], [], [1450], [1450], [], [], [], []]
