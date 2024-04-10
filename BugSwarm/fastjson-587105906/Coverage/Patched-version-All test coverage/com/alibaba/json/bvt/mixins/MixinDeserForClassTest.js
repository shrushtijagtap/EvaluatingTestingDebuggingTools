var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":52,"id":67002,"methods":[{"el":43,"sc":5,"sl":40},{"el":50,"sc":5,"sl":45}],"name":"MixinDeserForClassTest","sl":10},{"el":19,"id":67002,"methods":[{"el":18,"sc":9,"sl":15}],"name":"MixinDeserForClassTest.BaseClass","sl":11},{"el":29,"id":67004,"methods":[{"el":28,"sc":9,"sl":25}],"name":"MixinDeserForClassTest.BaseClass1","sl":21},{"el":38,"id":67006,"methods":[{"el":37,"sc":9,"sl":35}],"name":"MixinDeserForClassTest.Mixin","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3060":{"methods":[{"sl":15},{"sl":45}],"name":"test_2","pass":true,"statements":[{"sl":17},{"sl":46},{"sl":47},{"sl":48},{"sl":49}]},"test_3380":{"methods":[{"sl":25},{"sl":40}],"name":"test_1","pass":true,"statements":[{"sl":27},{"sl":41},{"sl":42}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3060], [], [3060], [], [], [], [], [], [], [], [3380], [], [3380], [], [], [], [], [], [], [], [], [], [], [], [], [3380], [3380], [3380], [], [], [3060], [3060], [3060], [3060], [3060], [], [], []]
