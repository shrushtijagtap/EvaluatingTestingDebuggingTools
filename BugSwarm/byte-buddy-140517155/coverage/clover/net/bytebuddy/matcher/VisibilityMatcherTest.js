var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":52364,"methods":[{"el":23,"sc":5,"sl":20},{"el":32,"sc":5,"sl":25},{"el":41,"sc":5,"sl":34}],"name":"VisibilityMatcherTest","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3685":{"methods":[{"sl":25}],"name":"testMatch","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":31}]},"test_5759":{"methods":[{"sl":34}],"name":"testNoMatch","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3685], [], [3685], [3685], [3685], [3685], [3685], [], [], [5759], [], [5759], [5759], [5759], [5759], [5759], [], []]
