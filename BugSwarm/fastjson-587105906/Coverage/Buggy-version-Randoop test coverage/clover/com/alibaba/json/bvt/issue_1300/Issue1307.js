var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":61,"id":60608,"methods":[{"el":24,"sc":6,"sl":22},{"el":29,"sc":9,"sl":27},{"el":45,"sc":5,"sl":32},{"el":60,"sc":5,"sl":47}],"name":"Issue1307","sl":20}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1427":{"methods":[{"sl":22},{"sl":32}],"name":"test_context_value_filter_not_effected","pass":true,"statements":[{"sl":23},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":39}]},"test_1915":{"methods":[{"sl":22},{"sl":27},{"sl":47}],"name":"test_context_value_filter_effected","pass":true,"statements":[{"sl":23},{"sl":28},{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":54}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1427, 1915], [1427, 1915], [], [], [], [1915], [1915], [], [], [], [1427], [], [1427], [1427], [1427], [1427], [], [1427], [], [], [], [], [], [], [], [1915], [], [1915], [1915], [1915], [1915], [], [1915], [], [], [], [], [], [], []]
