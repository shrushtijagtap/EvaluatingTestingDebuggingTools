var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":49,"id":63557,"methods":[{"el":22,"sc":5,"sl":17}],"name":"Issue1662_1","sl":16},{"el":27,"id":63561,"methods":[],"name":"Issue1662_1.Model","sl":24},{"el":36,"id":63561,"methods":[{"el":35,"sc":9,"sl":30}],"name":"Issue1662_1.ModelValueSerializer","sl":29},{"el":48,"id":63565,"methods":[{"el":43,"sc":9,"sl":40},{"el":47,"sc":9,"sl":45}],"name":"Issue1662_1.ModelValueDeserializer","sl":38}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3239":{"methods":[{"sl":17},{"sl":30},{"sl":40}],"name":"test_for_issue","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20},{"sl":32},{"sl":33},{"sl":34},{"sl":41},{"sl":42}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3239], [3239], [3239], [3239], [], [], [], [], [], [], [], [], [], [3239], [], [3239], [3239], [3239], [], [], [], [], [], [3239], [3239], [3239], [], [], [], [], [], [], []]
