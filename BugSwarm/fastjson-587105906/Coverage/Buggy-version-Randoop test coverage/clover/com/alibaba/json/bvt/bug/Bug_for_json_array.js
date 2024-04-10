var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":56,"id":54127,"methods":[{"el":15,"sc":5,"sl":9}],"name":"Bug_for_json_array","sl":7},{"el":55,"id":54131,"methods":[{"el":26,"sc":9,"sl":24},{"el":30,"sc":9,"sl":28},{"el":34,"sc":9,"sl":32},{"el":38,"sc":9,"sl":36},{"el":42,"sc":9,"sl":40},{"el":46,"sc":9,"sl":44},{"el":50,"sc":9,"sl":48},{"el":54,"sc":9,"sl":52}],"name":"Bug_for_json_array.Parser","sl":17}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_598":{"methods":[{"sl":9},{"sl":24},{"sl":28},{"sl":32},{"sl":36},{"sl":40},{"sl":44},{"sl":48},{"sl":52}],"name":"test_bug","pass":true,"statements":[{"sl":10},{"sl":12},{"sl":14},{"sl":25},{"sl":29},{"sl":33},{"sl":37},{"sl":41},{"sl":45},{"sl":49},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [598], [598], [], [598], [], [598], [], [], [], [], [], [], [], [], [], [598], [598], [], [], [598], [598], [], [], [598], [598], [], [], [598], [598], [], [], [598], [598], [], [], [598], [598], [], [], [598], [598], [], [], [598], [598], [], [], []]
