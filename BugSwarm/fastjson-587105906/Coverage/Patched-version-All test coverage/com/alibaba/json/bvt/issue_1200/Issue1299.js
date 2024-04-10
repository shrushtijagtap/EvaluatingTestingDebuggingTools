var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":82,"id":60650,"methods":[{"el":24,"sc":5,"sl":14}],"name":"Issue1299","sl":13},{"el":42,"id":60655,"methods":[{"el":33,"sc":9,"sl":32},{"el":37,"sc":9,"sl":35},{"el":41,"sc":9,"sl":39}],"name":"Issue1299.ServiceResult","sl":26},{"el":48,"id":60660,"methods":[],"name":"Issue1299.UnitsSaveResponse","sl":44},{"el":71,"id":60660,"methods":[{"el":58,"sc":9,"sl":56},{"el":62,"sc":9,"sl":60},{"el":66,"sc":9,"sl":64},{"el":70,"sc":9,"sl":68}],"name":"Issue1299.UnitSave","sl":50},{"el":75,"id":60668,"methods":[],"name":"Issue1299.SaveUnitInfo","sl":73},{"el":79,"id":60668,"methods":[],"name":"Issue1299.BaseResultDo","sl":77}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2033":{"methods":[{"sl":14},{"sl":32}],"name":"test_for_issue","pass":false,"statements":[{"sl":15},{"sl":21}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [2033], [2033], [], [], [], [], [], [2033], [], [], [], [], [], [], [], [], [], [], [2033], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
