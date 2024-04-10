var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":69,"id":74901,"methods":[{"el":20,"sc":5,"sl":12},{"el":30,"sc":5,"sl":22},{"el":40,"sc":5,"sl":32},{"el":45,"sc":5,"sl":42},{"el":50,"sc":5,"sl":47}],"name":"FieldDeserializerTest1","sl":10},{"el":64,"id":74925,"methods":[{"el":58,"sc":9,"sl":56},{"el":62,"sc":9,"sl":60}],"name":"FieldDeserializerTest1.Entity","sl":52},{"el":68,"id":74929,"methods":[],"name":"FieldDeserializerTest1.V1","sl":66}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_208":{"methods":[{"sl":22}],"name":"test_error_1","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":27},{"sl":29}]},"test_230":{"methods":[{"sl":42},{"sl":56},{"sl":60}],"name":"test_null","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":57},{"sl":61}]},"test_2343":{"methods":[{"sl":47},{"sl":56},{"sl":60}],"name":"test_null_2","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":57},{"sl":61}]},"test_2702":{"methods":[{"sl":12}],"name":"test_error","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":17},{"sl":19}]},"test_3716":{"methods":[{"sl":32},{"sl":60}],"name":"test_error_2","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":37},{"sl":39},{"sl":61}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [2702], [2702], [2702], [2702], [], [2702], [], [2702], [], [], [208], [208], [208], [208], [], [208], [], [208], [], [], [3716], [3716], [3716], [3716], [], [3716], [], [3716], [], [], [230], [230], [230], [], [], [2343], [2343], [2343], [], [], [], [], [], [], [230, 2343], [230, 2343], [], [], [230, 3716, 2343], [230, 3716, 2343], [], [], [], [], [], [], [], []]
