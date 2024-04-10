var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":25,"id":67333,"methods":[{"el":16,"sc":5,"sl":12}],"name":"AmbiguousTest","sl":11},{"el":20,"id":67337,"methods":[],"name":"AmbiguousTest.Model","sl":18},{"el":24,"id":67337,"methods":[],"name":"AmbiguousTest.Item","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4200":{"methods":[{"sl":12}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [4200], [4200], [4200], [4200], [], [], [], [], [], [], [], [], [], []]
