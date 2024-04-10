var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":59,"id":59523,"methods":[{"el":20,"sc":5,"sl":12}],"name":"Issue1319","sl":11},{"el":25,"id":59531,"methods":[],"name":"Issue1319.EnumInterface","sl":23},{"el":30,"id":59531,"methods":[],"name":"Issue1319.MyEnum","sl":27},{"el":34,"id":59531,"methods":[],"name":"Issue1319.OtherEnum","sl":32},{"el":58,"id":59531,"methods":[{"el":40,"sc":9,"sl":39},{"el":45,"sc":9,"sl":42},{"el":48,"sc":9,"sl":46},{"el":51,"sc":9,"sl":49},{"el":54,"sc":9,"sl":52},{"el":57,"sc":9,"sl":55}],"name":"Issue1319.MyTest","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_943":{"methods":[{"sl":12},{"sl":39},{"sl":42},{"sl":46},{"sl":49},{"sl":52},{"sl":55}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":43},{"sl":44},{"sl":47},{"sl":50},{"sl":53},{"sl":56}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [943], [943], [943], [943], [943], [943], [943], [943], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [943], [], [], [943], [943], [943], [], [943], [943], [], [943], [943], [], [943], [943], [], [943], [943], [], [], []]
