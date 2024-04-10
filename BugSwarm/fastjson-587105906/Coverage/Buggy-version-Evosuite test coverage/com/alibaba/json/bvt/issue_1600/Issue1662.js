var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":54,"id":63552,"methods":[{"el":25,"sc":5,"sl":18}],"name":"Issue1662","sl":17},{"el":30,"id":63557,"methods":[],"name":"Issue1662.Model","sl":27},{"el":39,"id":63557,"methods":[{"el":38,"sc":9,"sl":33}],"name":"Issue1662.ModelValueSerializer","sl":32},{"el":53,"id":63561,"methods":[{"el":48,"sc":9,"sl":43},{"el":52,"sc":9,"sl":50}],"name":"Issue1662.ModelValueDeserializer","sl":41}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3012":{"methods":[{"sl":18},{"sl":33},{"sl":43}],"name":"test_for_issue","pass":true,"statements":[{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":35},{"sl":36},{"sl":37},{"sl":44},{"sl":45},{"sl":46},{"sl":47}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3012], [], [3012], [3012], [3012], [3012], [], [], [], [], [], [], [], [], [], [3012], [], [3012], [3012], [3012], [], [], [], [], [], [3012], [3012], [3012], [3012], [3012], [], [], [], [], [], [], []]
