var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":70,"id":48281,"methods":[{"el":19,"sc":5,"sl":12},{"el":28,"sc":5,"sl":21},{"el":34,"sc":5,"sl":30},{"el":44,"sc":5,"sl":36}],"name":"ASMDeserTest","sl":10},{"el":58,"id":48300,"methods":[{"el":52,"sc":9,"sl":50},{"el":56,"sc":9,"sl":54}],"name":"ASMDeserTest.VO","sl":46},{"el":62,"id":48304,"methods":[],"name":"ASMDeserTest.Entity","sl":60},{"el":69,"id":48304,"methods":[{"el":68,"sc":9,"sl":66}],"name":"ASMDeserTest.EntityError","sl":64}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2520":{"methods":[{"sl":21},{"sl":50},{"sl":54}],"name":"test_codec_1","pass":true,"statements":[{"sl":22},{"sl":24},{"sl":26},{"sl":27},{"sl":51},{"sl":55}]},"test_2592":{"methods":[{"sl":30}],"name":"test_ArrayList","pass":true,"statements":[{"sl":32},{"sl":33}]},"test_4875":{"methods":[{"sl":36},{"sl":66}],"name":"test_error","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":39},{"sl":41},{"sl":43},{"sl":67}]},"test_948":{"methods":[{"sl":12}],"name":"test_codec","pass":true,"statements":[{"sl":13},{"sl":15},{"sl":17},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [948], [948], [], [948], [], [948], [948], [], [], [2520], [2520], [], [2520], [], [2520], [2520], [], [], [2592], [], [2592], [2592], [], [], [4875], [4875], [4875], [4875], [], [4875], [], [4875], [], [], [], [], [], [], [2520], [2520], [], [], [2520], [2520], [], [], [], [], [], [], [], [], [], [], [4875], [4875], [], [], []]
