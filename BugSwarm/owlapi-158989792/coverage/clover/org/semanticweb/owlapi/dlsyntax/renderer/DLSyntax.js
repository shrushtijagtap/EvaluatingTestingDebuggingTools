var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":65,"id":4098,"methods":[{"el":53,"sc":5,"sl":50},{"el":59,"sc":5,"sl":55},{"el":64,"sc":5,"sl":62}],"name":"DLSyntax","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1038":{"methods":[{"sl":50},{"sl":55}],"name":"testCommasOnDisjointTwoOntology","pass":true,"statements":[{"sl":51},{"sl":52},{"sl":58}]},"test_1243":{"methods":[{"sl":55}],"name":"testCommasOnDisjointThreeOntology","pass":true,"statements":[{"sl":58}]},"test_1257":{"methods":[{"sl":55}],"name":"testCommasOnDisjointThree","pass":true,"statements":[{"sl":58}]},"test_155":{"methods":[{"sl":55}],"name":"testCommasOnDisjointFourOntology","pass":true,"statements":[{"sl":58}]},"test_2446":{"methods":[{"sl":55}],"name":"testCommasOnDisjointTwo","pass":true,"statements":[{"sl":58}]},"test_2454":{"methods":[{"sl":55}],"name":"testCommasOnDisjointFour","pass":true,"statements":[{"sl":58}]},"test_2539":{"methods":[{"sl":62}],"name":"testCommasOnDisjointTwoOntologyHTML","pass":true,"statements":[{"sl":63}]},"test_2639":{"methods":[{"sl":62}],"name":"testCommasOnDisjointThreeOntologyHTML","pass":true,"statements":[{"sl":63}]},"test_85":{"methods":[{"sl":62}],"name":"testCommasOnDisjointFourOntologyHTML","pass":true,"statements":[{"sl":63}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1038], [1038], [1038], [], [], [1243, 1257, 155, 2454, 2446, 1038], [], [], [1243, 1257, 155, 2454, 2446, 1038], [], [], [], [85, 2639, 2539], [85, 2639, 2539], [], []]
