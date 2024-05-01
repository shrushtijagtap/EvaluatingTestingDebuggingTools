var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":52250,"methods":[{"el":18,"sc":5,"sl":15},{"el":27,"sc":5,"sl":20},{"el":36,"sc":5,"sl":29}],"name":"NegatingMatcherTest","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1899":{"methods":[{"sl":29}],"name":"testPositiveToNegative","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35}]},"test_2392":{"methods":[{"sl":20}],"name":"testNegateToPositive","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2392], [], [2392], [2392], [2392], [2392], [2392], [], [], [1899], [], [1899], [1899], [1899], [1899], [1899], [], []]
