var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":83453,"methods":[{"el":17,"sc":2,"sl":10}],"name":"InterfaceTest","sl":9},{"el":34,"id":83459,"methods":[{"el":24,"sc":3,"sl":22},{"el":27,"sc":3,"sl":25},{"el":30,"sc":3,"sl":28},{"el":33,"sc":3,"sl":31}],"name":"InterfaceTest.A","sl":19},{"el":39,"id":83467,"methods":[],"name":"InterfaceTest.IA","sl":36},{"el":44,"id":83467,"methods":[],"name":"InterfaceTest.IB","sl":41}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2643":{"methods":[{"sl":10},{"sl":22},{"sl":25},{"sl":28},{"sl":31}],"name":"test_interface","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":23},{"sl":26},{"sl":29},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [2643], [2643], [2643], [2643], [], [2643], [2643], [], [], [], [], [], [2643], [2643], [], [2643], [2643], [], [2643], [2643], [], [2643], [2643], [], [], [], [], [], [], [], [], [], [], [], [], []]
