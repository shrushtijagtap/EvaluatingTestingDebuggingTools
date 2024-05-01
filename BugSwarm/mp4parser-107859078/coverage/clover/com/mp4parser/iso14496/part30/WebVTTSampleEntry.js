var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":21903,"methods":[{"el":20,"sc":5,"sl":18},{"el":25,"sc":5,"sl":22},{"el":31,"sc":5,"sl":27},{"el":35,"sc":5,"sl":33},{"el":39,"sc":5,"sl":37}],"name":"WebVTTSampleEntry","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_33":{"methods":[{"sl":18}],"name":"testVerySimpleCheck","pass":true,"statements":[{"sl":19}]},"test_94":{"methods":[{"sl":18},{"sl":22},{"sl":27}],"name":"roundtrip","pass":true,"statements":[{"sl":19},{"sl":24},{"sl":29},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [33, 94], [33, 94], [], [], [94], [], [94], [], [], [94], [], [94], [94], [], [], [], [], [], [], [], [], [], []]
