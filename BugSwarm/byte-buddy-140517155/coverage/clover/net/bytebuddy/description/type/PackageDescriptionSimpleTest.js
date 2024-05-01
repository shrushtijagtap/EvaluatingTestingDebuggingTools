var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":22,"id":36004,"methods":[{"el":16,"sc":5,"sl":13},{"el":21,"sc":5,"sl":18}],"name":"PackageDescriptionSimpleTest","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4022":{"methods":[{"sl":18}],"name":"testPackageAnnotations","pass":true,"statements":[{"sl":20}]},"test_4156":{"methods":[{"sl":13}],"name":"testPackageName","pass":true,"statements":[{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [4156], [], [4156], [], [], [4022], [], [4022], [], []]
