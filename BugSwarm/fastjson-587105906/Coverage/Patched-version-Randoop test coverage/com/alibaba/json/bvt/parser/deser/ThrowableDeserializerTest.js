var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":70,"id":75622,"methods":[{"el":17,"sc":5,"sl":11},{"el":27,"sc":5,"sl":19},{"el":37,"sc":5,"sl":29},{"el":47,"sc":5,"sl":39},{"el":57,"sc":5,"sl":49}],"name":"ThrowableDeserializerTest","sl":10},{"el":63,"id":75652,"methods":[{"el":62,"sc":9,"sl":60}],"name":"ThrowableDeserializerTest.MyException","sl":59},{"el":69,"id":75653,"methods":[{"el":68,"sc":9,"sl":66}],"name":"ThrowableDeserializerTest.MyException2","sl":65}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1772":{"methods":[{"sl":49},{"sl":66}],"name":"test_error3","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":52},{"sl":54},{"sl":56},{"sl":67}]},"test_2119":{"methods":[{"sl":39}],"name":"test_error2","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":42},{"sl":44},{"sl":46}]},"test_242":{"methods":[{"sl":29}],"name":"test_error1","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32},{"sl":34},{"sl":36}]},"test_2925":{"methods":[{"sl":19}],"name":"test_error","pass":true,"statements":[{"sl":20},{"sl":21},{"sl":22},{"sl":24},{"sl":26}]},"test_4494":{"methods":[{"sl":11}],"name":"test_0","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [4494], [4494], [4494], [4494], [4494], [4494], [], [], [2925], [2925], [2925], [2925], [], [2925], [], [2925], [], [], [242], [242], [242], [242], [], [242], [], [242], [], [], [2119], [2119], [2119], [2119], [], [2119], [], [2119], [], [], [1772], [1772], [1772], [1772], [], [1772], [], [1772], [], [], [], [], [], [], [], [], [], [1772], [1772], [], [], []]
