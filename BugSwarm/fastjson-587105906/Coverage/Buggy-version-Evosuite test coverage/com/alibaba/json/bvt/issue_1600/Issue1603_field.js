var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":63305,"methods":[{"el":14,"sc":5,"sl":11},{"el":19,"sc":5,"sl":16},{"el":24,"sc":5,"sl":21}],"name":"Issue1603_field","sl":10},{"el":28,"id":63314,"methods":[],"name":"Issue1603_field.Model_1","sl":26},{"el":32,"id":63314,"methods":[],"name":"Issue1603_field.Model_2","sl":30},{"el":36,"id":63314,"methods":[],"name":"Issue1603_field.Model_3","sl":34}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1661":{"methods":[{"sl":11}],"name":"test_emptySet","pass":true,"statements":[{"sl":12},{"sl":13}]},"test_1926":{"methods":[{"sl":21}],"name":"test_unmodifier","pass":true,"statements":[{"sl":22},{"sl":23}]},"test_346":{"methods":[{"sl":16}],"name":"test_emptyList","pass":true,"statements":[{"sl":17},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [1661], [1661], [1661], [], [], [346], [346], [346], [], [], [1926], [1926], [1926], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
