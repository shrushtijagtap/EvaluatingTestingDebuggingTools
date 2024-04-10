var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":60350,"methods":[{"el":36,"sc":5,"sl":12}],"name":"Issue1231","sl":11},{"el":41,"id":60365,"methods":[],"name":"Issue1231.Model","sl":38}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1972":{"methods":[{"sl":12}],"name":"test_for_issue","pass":false,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":17},{"sl":18},{"sl":21}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [1972], [1972], [1972], [1972], [], [1972], [1972], [], [], [1972], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
