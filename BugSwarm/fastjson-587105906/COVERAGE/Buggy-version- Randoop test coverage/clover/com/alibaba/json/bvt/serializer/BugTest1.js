var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":48,"id":82309,"methods":[{"el":19,"sc":5,"sl":16},{"el":24,"sc":5,"sl":21},{"el":29,"sc":5,"sl":26},{"el":34,"sc":5,"sl":31},{"el":39,"sc":5,"sl":36},{"el":43,"sc":5,"sl":41},{"el":47,"sc":5,"sl":45}],"name":"BugTest1","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1416":{"methods":[{"sl":26}],"name":"test_2","pass":true,"statements":[{"sl":27},{"sl":28}]},"test_1599":{"methods":[{"sl":31}],"name":"test_3","pass":true,"statements":[{"sl":32},{"sl":33}]},"test_2696":{"methods":[{"sl":41}],"name":"test_5","pass":true,"statements":[{"sl":42}]},"test_321":{"methods":[{"sl":21}],"name":"test_1","pass":true,"statements":[{"sl":22},{"sl":23}]},"test_324":{"methods":[{"sl":45}],"name":"test_7","pass":true,"statements":[{"sl":46}]},"test_3707":{"methods":[{"sl":16}],"name":"test_0","pass":true,"statements":[{"sl":17},{"sl":18}]},"test_555":{"methods":[{"sl":36}],"name":"test_4","pass":true,"statements":[{"sl":37},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3707], [3707], [3707], [], [], [321], [321], [321], [], [], [1416], [1416], [1416], [], [], [1599], [1599], [1599], [], [], [555], [555], [555], [], [], [2696], [2696], [], [], [324], [324], [], []]
