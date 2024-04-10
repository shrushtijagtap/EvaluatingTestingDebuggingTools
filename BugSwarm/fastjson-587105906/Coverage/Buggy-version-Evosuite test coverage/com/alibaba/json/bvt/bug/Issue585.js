var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":80,"id":57185,"methods":[{"el":26,"sc":5,"sl":19},{"el":31,"sc":5,"sl":28},{"el":41,"sc":5,"sl":33},{"el":48,"sc":5,"sl":43}],"name":"Issue585","sl":15},{"el":79,"id":57203,"methods":[{"el":58,"sc":9,"sl":56},{"el":62,"sc":9,"sl":60},{"el":66,"sc":9,"sl":64},{"el":70,"sc":9,"sl":68},{"el":74,"sc":9,"sl":72},{"el":78,"sc":9,"sl":76}],"name":"Issue585.Result","sl":50}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2732":{"methods":[{"sl":33},{"sl":43},{"sl":56},{"sl":60},{"sl":76}],"name":"test_for_issue","pass":true,"statements":[{"sl":35},{"sl":37},{"sl":39},{"sl":40},{"sl":44},{"sl":45},{"sl":57},{"sl":61},{"sl":77}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2732], [], [2732], [], [2732], [], [2732], [2732], [], [], [2732], [2732], [2732], [], [], [], [], [], [], [], [], [], [], [2732], [2732], [], [], [2732], [2732], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2732], [2732], [], [], []]
