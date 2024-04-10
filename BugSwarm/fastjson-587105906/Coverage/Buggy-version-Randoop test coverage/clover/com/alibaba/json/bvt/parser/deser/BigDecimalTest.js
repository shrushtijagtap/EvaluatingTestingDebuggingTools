var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":49,"id":74300,"methods":[{"el":19,"sc":5,"sl":12},{"el":27,"sc":5,"sl":21},{"el":34,"sc":5,"sl":29}],"name":"BigDecimalTest","sl":11},{"el":48,"id":74318,"methods":[{"el":42,"sc":9,"sl":40},{"el":46,"sc":9,"sl":44}],"name":"BigDecimalTest.VO","sl":36}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1250":{"methods":[{"sl":12},{"sl":40},{"sl":44}],"name":"test_null","pass":false,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":41},{"sl":45}]},"test_1422":{"methods":[{"sl":21}],"name":"test_postfix","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26}]},"test_3635":{"methods":[{"sl":29}],"name":"test_className","pass":false,"statements":[{"sl":30},{"sl":31},{"sl":32},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [1250], [1250], [1250], [1250], [], [], [], [], [], [1422], [1422], [1422], [1422], [1422], [1422], [], [], [3635], [3635], [3635], [3635], [3635], [], [], [], [], [], [], [1250], [1250], [], [], [1250], [1250], [], [], [], []]
