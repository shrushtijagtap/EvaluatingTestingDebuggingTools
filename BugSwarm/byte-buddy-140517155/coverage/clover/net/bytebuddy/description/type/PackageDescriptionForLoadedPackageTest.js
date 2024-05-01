var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":9,"id":36002,"methods":[{"el":8,"sc":5,"sl":5}],"name":"PackageDescriptionForLoadedPackageTest","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1069":{"methods":[{"sl":5}],"name":"testEquals","pass":true,"statements":[{"sl":7}]},"test_1466":{"methods":[{"sl":5}],"name":"testNonTrivialPackage","pass":true,"statements":[{"sl":7}]},"test_1540":{"methods":[{"sl":5}],"name":"testHashCode","pass":true,"statements":[{"sl":7}]},"test_1568":{"methods":[{"sl":5}],"name":"testPackageContains","pass":true,"statements":[{"sl":7}]},"test_55":{"methods":[{"sl":5}],"name":"testTrivialPackage","pass":true,"statements":[{"sl":7}]},"test_722":{"methods":[{"sl":5}],"name":"testToString","pass":true,"statements":[{"sl":7}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [1568, 1069, 55, 722, 1540, 1466], [], [1568, 1069, 55, 722, 1540, 1466], [], []]
