var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":33,"id":45449,"methods":[{"el":27,"sc":5,"sl":23},{"el":32,"sc":5,"sl":29}],"name":"StubMethodOtherTest","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2794":{"methods":[{"sl":29}],"name":"testObjectProperties","pass":true,"statements":[{"sl":31}]},"test_4123":{"methods":[{"sl":23}],"name":"testPreparation","pass":true,"statements":[{"sl":25},{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4123], [], [4123], [4123], [], [], [2794], [], [2794], [], []]
