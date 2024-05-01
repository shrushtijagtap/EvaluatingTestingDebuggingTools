var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":41,"id":50995,"methods":[{"el":15,"sc":5,"sl":12},{"el":22,"sc":5,"sl":17},{"el":29,"sc":5,"sl":24},{"el":35,"sc":5,"sl":31},{"el":40,"sc":5,"sl":37}],"name":"BooleanMatcherTest","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1878":{"methods":[{"sl":17}],"name":"testMatch","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":21}]},"test_2008":{"methods":[{"sl":24}],"name":"testNoMatch","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":28}]},"test_3145":{"methods":[{"sl":37}],"name":"testObjectProperties","pass":true,"statements":[{"sl":39}]},"test_4286":{"methods":[{"sl":31}],"name":"testToString","pass":true,"statements":[{"sl":33},{"sl":34}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1878], [], [1878], [1878], [1878], [], [], [2008], [], [2008], [2008], [2008], [], [], [4286], [], [4286], [4286], [], [], [3145], [], [3145], [], []]
