var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":62,"id":58097,"methods":[{"el":14,"sc":5,"sl":12},{"el":18,"sc":5,"sl":16},{"el":22,"sc":5,"sl":20},{"el":26,"sc":5,"sl":24}],"name":"KeyBug_for_zhongl","sl":10},{"el":43,"id":58105,"methods":[{"el":38,"sc":9,"sl":36},{"el":42,"sc":9,"sl":40}],"name":"KeyBug_for_zhongl.VO","sl":28},{"el":60,"id":58108,"methods":[{"el":55,"sc":9,"sl":53},{"el":59,"sc":9,"sl":57}],"name":"KeyBug_for_zhongl.V2","sl":45}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2893":{"methods":[{"sl":24},{"sl":36}],"name":"testDeserialize_static","pass":true,"statements":[{"sl":25}]},"test_3403":{"methods":[{"sl":16},{"sl":53}],"name":"testDeserialize","pass":true,"statements":[{"sl":17}]},"test_3460":{"methods":[{"sl":12},{"sl":57}],"name":"testCustomedKey","pass":true,"statements":[{"sl":13},{"sl":58}]},"test_3927":{"methods":[{"sl":20},{"sl":40}],"name":"testCustomedKey_static","pass":true,"statements":[{"sl":21},{"sl":41}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [3460], [3460], [], [], [3403], [3403], [], [], [3927], [3927], [], [], [2893], [2893], [], [], [], [], [], [], [], [], [], [], [2893], [], [], [], [3927], [3927], [], [], [], [], [], [], [], [], [], [], [], [3403], [], [], [], [3460], [3460], [], [], [], []]
