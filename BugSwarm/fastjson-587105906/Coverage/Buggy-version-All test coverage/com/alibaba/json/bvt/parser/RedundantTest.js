var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":70,"id":71875,"methods":[{"el":22,"sc":13,"sl":19},{"el":28,"sc":5,"sl":17},{"el":49,"sc":5,"sl":30}],"name":"RedundantTest","sl":15},{"el":43,"id":71884,"methods":[{"el":35,"sc":13,"sl":32},{"el":42,"sc":13,"sl":37}],"name":"RedundantTest.MyExtraProcessor","sl":31},{"el":69,"id":71898,"methods":[{"el":59,"sc":9,"sl":57},{"el":63,"sc":9,"sl":61},{"el":67,"sc":9,"sl":65}],"name":"RedundantTest.VO","sl":52}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3973":{"methods":[{"sl":30},{"sl":61}],"name":"test_extraWithType","pass":false,"statements":[{"sl":43},{"sl":44},{"sl":46},{"sl":62}]},"test_4773":{"methods":[{"sl":17},{"sl":61}],"name":"test_extra","pass":false,"statements":[{"sl":18},{"sl":25},{"sl":62}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4773], [4773], [], [], [], [], [], [], [4773], [], [], [], [], [3973], [], [], [], [], [], [], [], [], [], [], [], [], [3973], [3973], [], [3973], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4773, 3973], [4773, 3973], [], [], [], [], [], [], [], []]
