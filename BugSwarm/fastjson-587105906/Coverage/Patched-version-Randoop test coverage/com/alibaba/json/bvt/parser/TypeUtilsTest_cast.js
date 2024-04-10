var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":99,"id":72273,"methods":[{"el":19,"sc":5,"sl":17},{"el":25,"sc":5,"sl":21},{"el":35,"sc":5,"sl":27},{"el":45,"sc":5,"sl":37}],"name":"TypeUtilsTest_cast","sl":15},{"el":98,"id":72291,"methods":[{"el":54,"sc":9,"sl":50},{"el":60,"sc":9,"sl":56},{"el":66,"sc":9,"sl":62},{"el":72,"sc":9,"sl":68},{"el":78,"sc":9,"sl":74},{"el":84,"sc":9,"sl":80},{"el":90,"sc":9,"sl":86},{"el":96,"sc":9,"sl":92}],"name":"TypeUtilsTest_cast.MyCalendar","sl":48}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1873":{"methods":[{"sl":17}],"name":"test_cast_0","pass":true,"statements":[{"sl":18}]},"test_245":{"methods":[{"sl":37}],"name":"test_castToDate_error_nullClass","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40},{"sl":42},{"sl":44}]},"test_2465":{"methods":[{"sl":27}],"name":"test_castToDate_error","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":32},{"sl":34}]},"test_4421":{"methods":[{"sl":21}],"name":"test_cast_1","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1873], [1873], [], [], [4421], [4421], [4421], [4421], [], [], [2465], [2465], [2465], [2465], [], [2465], [], [2465], [], [], [245], [245], [245], [245], [], [245], [], [245], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
