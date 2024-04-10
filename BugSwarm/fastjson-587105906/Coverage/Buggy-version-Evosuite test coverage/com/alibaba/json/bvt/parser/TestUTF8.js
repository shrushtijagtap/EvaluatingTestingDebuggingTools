var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":62,"id":71954,"methods":[{"el":15,"sc":5,"sl":11},{"el":24,"sc":5,"sl":17},{"el":33,"sc":5,"sl":26},{"el":42,"sc":5,"sl":35},{"el":51,"sc":5,"sl":44},{"el":60,"sc":5,"sl":53}],"name":"TestUTF8","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_170":{"methods":[{"sl":11}],"name":"test_utf","pass":false,"statements":[{"sl":12}]},"test_1746":{"methods":[{"sl":26}],"name":"test_utf_de","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32}]},"test_2336":{"methods":[{"sl":35}],"name":"test_utf_jp","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41}]},"test_4070":{"methods":[{"sl":44}],"name":"test_utf_","pass":true,"statements":[{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50}]},"test_4504":{"methods":[{"sl":53}],"name":"test_utf_7","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59}]},"test_4740":{"methods":[{"sl":17}],"name":"test_utf_cn","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":23}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [170], [170], [], [], [], [], [4740], [4740], [4740], [4740], [4740], [4740], [4740], [], [], [1746], [1746], [1746], [1746], [1746], [1746], [1746], [], [], [2336], [2336], [2336], [2336], [2336], [2336], [2336], [], [], [4070], [4070], [4070], [4070], [4070], [4070], [4070], [], [], [4504], [4504], [4504], [4504], [4504], [4504], [4504], [], [], []]
