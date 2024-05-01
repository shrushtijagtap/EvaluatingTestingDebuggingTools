var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":60,"id":20920,"methods":[{"el":32,"sc":5,"sl":30},{"el":34,"sc":5,"sl":34},{"el":38,"sc":5,"sl":36},{"el":43,"sc":5,"sl":40},{"el":48,"sc":5,"sl":45},{"el":55,"sc":5,"sl":50},{"el":59,"sc":5,"sl":57}],"name":"Token","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2469":{"methods":[{"sl":34},{"sl":40},{"sl":50}],"name":"shouldParseGenericOBO","pass":true,"statements":[{"sl":41},{"sl":42},{"sl":51},{"sl":52},{"sl":53}]},"test_274":{"methods":[{"sl":34},{"sl":40},{"sl":50}],"name":"shouldFailWithBanningOfTriX","pass":true,"statements":[{"sl":41},{"sl":42},{"sl":51},{"sl":52},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2469, 274], [], [], [], [], [], [2469, 274], [2469, 274], [2469, 274], [], [], [], [], [], [], [], [2469, 274], [2469, 274], [2469, 274], [2469, 274], [], [], [], [], [], [], [], [], [], [], []]
