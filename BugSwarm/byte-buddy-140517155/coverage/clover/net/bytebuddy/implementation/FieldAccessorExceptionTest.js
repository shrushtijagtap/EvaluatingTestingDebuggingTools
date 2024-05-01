var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":73,"id":42578,"methods":[{"el":18,"sc":5,"sl":15},{"el":23,"sc":5,"sl":20},{"el":28,"sc":5,"sl":25},{"el":35,"sc":5,"sl":30},{"el":42,"sc":5,"sl":37}],"name":"FieldAccessorExceptionTest","sl":11},{"el":52,"id":42592,"methods":[{"el":51,"sc":9,"sl":49}],"name":"FieldAccessorExceptionTest.Foo","sl":45},{"el":62,"id":42593,"methods":[{"el":61,"sc":9,"sl":59}],"name":"FieldAccessorExceptionTest.Bar","sl":55},{"el":72,"id":42594,"methods":[{"el":71,"sc":9,"sl":69}],"name":"FieldAccessorExceptionTest.Qux","sl":65}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1679":{"methods":[{"sl":25}],"name":"testFieldNoBeanMethodName","pass":true,"statements":[{"sl":27}]},"test_2026":{"methods":[{"sl":15}],"name":"testFinalFieldSetter","pass":true,"statements":[{"sl":17}]},"test_2557":{"methods":[{"sl":20}],"name":"testFieldNoVisibleField","pass":true,"statements":[{"sl":22}]},"test_2593":{"methods":[{"sl":37}],"name":"testFieldNonPublicOnInterface","pass":true,"statements":[{"sl":39},{"sl":40},{"sl":41}]},"test_3251":{"methods":[{"sl":30}],"name":"testFieldNonStaticOnInterface","pass":true,"statements":[{"sl":32},{"sl":33},{"sl":34}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2026], [], [2026], [], [], [2557], [], [2557], [], [], [1679], [], [1679], [], [], [3251], [], [3251], [3251], [3251], [], [], [2593], [], [2593], [2593], [2593], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
