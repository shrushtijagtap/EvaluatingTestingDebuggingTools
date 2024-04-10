var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":47,"id":57342,"methods":[{"el":26,"sc":5,"sl":18}],"name":"Issue771","sl":16},{"el":46,"id":57350,"methods":[{"el":41,"sc":9,"sl":32},{"el":45,"sc":9,"sl":43}],"name":"Issue771.FooBar","sl":28}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1473":{"methods":[{"sl":18},{"sl":32},{"sl":43}],"name":"test_for_issue","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":38},{"sl":40},{"sl":44}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1473], [1473], [1473], [1473], [1473], [1473], [1473], [1473], [], [], [], [], [], [], [1473], [1473], [1473], [1473], [1473], [], [1473], [], [1473], [], [], [1473], [1473], [], [], []]
