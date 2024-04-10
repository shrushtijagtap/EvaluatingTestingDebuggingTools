var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":68,"id":71151,"methods":[{"el":19,"sc":5,"sl":10},{"el":30,"sc":5,"sl":21},{"el":41,"sc":5,"sl":32},{"el":52,"sc":5,"sl":43}],"name":"JSONScannerTest_scanFieldString_error","sl":8},{"el":67,"id":71179,"methods":[{"el":61,"sc":9,"sl":59},{"el":65,"sc":9,"sl":63}],"name":"JSONScannerTest_scanFieldString_error.VO","sl":55}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1937":{"methods":[{"sl":43},{"sl":63}],"name":"test_error_3","pass":true,"statements":[{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":49},{"sl":51},{"sl":64}]},"test_3666":{"methods":[{"sl":32},{"sl":63}],"name":"test_error_2","pass":false,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":40},{"sl":64}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3666], [3666], [3666], [3666], [3666], [], [], [], [3666], [], [], [1937], [1937], [1937], [1937], [1937], [], [1937], [], [1937], [], [], [], [], [], [], [], [], [], [], [], [1937, 3666], [1937, 3666], [], [], [], []]
