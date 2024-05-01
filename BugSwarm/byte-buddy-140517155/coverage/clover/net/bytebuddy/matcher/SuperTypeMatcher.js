var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":46,"id":24361,"methods":[{"el":24,"sc":5,"sl":22},{"el":29,"sc":5,"sl":26},{"el":35,"sc":5,"sl":31},{"el":40,"sc":5,"sl":37},{"el":45,"sc":5,"sl":42}],"name":"SuperTypeMatcher","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1461":{"methods":[{"sl":22},{"sl":26}],"name":"testMatch","pass":true,"statements":[{"sl":23},{"sl":28}]},"test_1606":{"methods":[{"sl":22},{"sl":26}],"name":"testNoMatch","pass":true,"statements":[{"sl":23},{"sl":28}]},"test_4694":{"methods":[{"sl":22},{"sl":26}],"name":"testCanThrow","pass":true,"statements":[{"sl":23},{"sl":28}]},"test_4858":{"methods":[{"sl":22},{"sl":26}],"name":"testIsSubOrSuperType","pass":true,"statements":[{"sl":23},{"sl":28}]},"test_5531":{"methods":[{"sl":22},{"sl":31},{"sl":37},{"sl":42}],"name":"testObjectProperties","pass":true,"statements":[{"sl":23},{"sl":33},{"sl":39},{"sl":44}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4858, 4694, 1606, 1461, 5531], [4858, 4694, 1606, 1461, 5531], [], [], [4858, 4694, 1606, 1461], [], [4858, 4694, 1606, 1461], [], [], [5531], [], [5531], [], [], [], [5531], [], [5531], [], [], [5531], [], [5531], [], []]
