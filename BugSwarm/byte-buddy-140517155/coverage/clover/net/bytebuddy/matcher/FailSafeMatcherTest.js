var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":60,"id":51977,"methods":[{"el":15,"sc":5,"sl":12},{"el":30,"sc":5,"sl":23},{"el":39,"sc":5,"sl":32},{"el":49,"sc":5,"sl":41},{"el":59,"sc":5,"sl":51}],"name":"FailSafeMatcherTest","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2283":{"methods":[{"sl":23}],"name":"testMatch","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29}]},"test_3362":{"methods":[{"sl":32}],"name":"testNoMatch","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38}]},"test_5397":{"methods":[{"sl":41}],"name":"testMatchOnFailure","pass":true,"statements":[{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48}]},"test_5431":{"methods":[{"sl":51}],"name":"testNoMatchOnFailure","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2283], [], [2283], [2283], [2283], [2283], [2283], [], [], [3362], [], [3362], [3362], [3362], [3362], [3362], [], [], [5397], [], [], [5397], [5397], [5397], [5397], [5397], [], [], [5431], [], [], [5431], [5431], [5431], [5431], [5431], [], []]
