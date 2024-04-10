var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":83,"id":65314,"methods":[{"el":15,"sc":5,"sl":11}],"name":"Issue2346","sl":10},{"el":29,"id":65318,"methods":[],"name":"Issue2346.TestEntity","sl":20},{"el":28,"id":65318,"methods":[],"name":"Issue2346.TestEntity.TestEntityBuilder","sl":26},{"el":56,"id":65318,"methods":[],"name":"Issue2346.TestEntity2","sl":33},{"el":55,"id":65318,"methods":[{"el":44,"sc":13,"sl":42},{"el":49,"sc":13,"sl":46},{"el":54,"sc":13,"sl":51}],"name":"Issue2346.TestEntity2.TestEntity2Builder","sl":39},{"el":82,"id":65326,"methods":[],"name":"Issue2346.TestEntity3","sl":60},{"el":81,"id":65326,"methods":[{"el":70,"sc":13,"sl":68},{"el":75,"sc":13,"sl":72},{"el":80,"sc":13,"sl":77}],"name":"Issue2346.TestEntity3.TestEntity3Builder","sl":65}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_270":{"methods":[{"sl":11}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [270], [270], [270], [270], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
