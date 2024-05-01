var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":25,"id":15838,"methods":[{"el":24,"sc":5,"sl":22}],"name":"KRSS2OWLParserException","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2469":{"methods":[{"sl":22}],"name":"shouldParseGenericOBO","pass":true,"statements":[{"sl":23}]},"test_274":{"methods":[{"sl":22}],"name":"shouldFailWithBanningOfTriX","pass":true,"statements":[{"sl":23}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2469, 274], [2469, 274], [], []]
