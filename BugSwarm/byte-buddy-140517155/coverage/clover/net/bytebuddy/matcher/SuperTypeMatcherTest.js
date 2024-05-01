var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":38,"id":52332,"methods":[{"el":19,"sc":5,"sl":16},{"el":28,"sc":5,"sl":21},{"el":37,"sc":5,"sl":30}],"name":"SuperTypeMatcherTest","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1461":{"methods":[{"sl":21}],"name":"testMatch","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_1606":{"methods":[{"sl":30}],"name":"testNoMatch","pass":true,"statements":[{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1461], [], [1461], [1461], [1461], [1461], [1461], [], [], [1606], [], [1606], [1606], [1606], [1606], [1606], [], []]
