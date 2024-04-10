var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":74,"id":84553,"methods":[{"el":22,"sc":5,"sl":17},{"el":29,"sc":5,"sl":24},{"el":36,"sc":5,"sl":31},{"el":43,"sc":5,"sl":38},{"el":50,"sc":5,"sl":45},{"el":61,"sc":5,"sl":52}],"name":"NoneStringKeyTest","sl":15},{"el":65,"id":84580,"methods":[],"name":"NoneStringKeyTest.Result","sl":63},{"el":73,"id":84580,"methods":[{"el":72,"sc":9,"sl":70}],"name":"NoneStringKeyTest.SubjectDTO","sl":67}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1209":{"methods":[{"sl":31}],"name":"test_2","pass":true,"statements":[{"sl":32},{"sl":33},{"sl":35}]},"test_2093":{"methods":[{"sl":45}],"name":"test_3","pass":true,"statements":[{"sl":46},{"sl":47},{"sl":49}]},"test_2368":{"methods":[{"sl":52},{"sl":70}],"name":"test_4","pass":true,"statements":[{"sl":53},{"sl":54},{"sl":56},{"sl":57},{"sl":59},{"sl":60},{"sl":71}]},"test_3064":{"methods":[{"sl":24}],"name":"test_1","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":28}]},"test_3229":{"methods":[{"sl":38}],"name":"test_null_0","pass":true,"statements":[{"sl":39},{"sl":40},{"sl":42}]},"test_3664":{"methods":[{"sl":17}],"name":"test_0","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":21}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3664], [3664], [3664], [], [3664], [], [], [3064], [3064], [3064], [], [3064], [], [], [1209], [1209], [1209], [], [1209], [], [], [3229], [3229], [3229], [], [3229], [], [], [2093], [2093], [2093], [], [2093], [], [], [2368], [2368], [2368], [], [2368], [2368], [], [2368], [2368], [], [], [], [], [], [], [], [], [], [2368], [2368], [], [], []]
