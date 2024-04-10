var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":72,"id":42063,"methods":[{"el":18,"sc":5,"sl":14},{"el":31,"sc":5,"sl":20}],"name":"ArmoryTest","sl":12},{"el":53,"id":42076,"methods":[{"el":39,"sc":9,"sl":37},{"el":43,"sc":9,"sl":41},{"el":47,"sc":9,"sl":45},{"el":51,"sc":9,"sl":49}],"name":"ArmoryTest.Item","sl":33},{"el":57,"id":42084,"methods":[],"name":"ArmoryTest.MessageHead","sl":55},{"el":71,"id":42084,"methods":[{"el":65,"sc":9,"sl":63},{"el":69,"sc":9,"sl":67}],"name":"ArmoryTest.MessageBody","sl":59}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3423":{"methods":[{"sl":20},{"sl":37},{"sl":45},{"sl":63}],"name":"test_0","pass":true,"statements":[{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":26},{"sl":27},{"sl":29},{"sl":30},{"sl":38},{"sl":46},{"sl":64}]},"test_3780":{"methods":[{"sl":14},{"sl":37},{"sl":45}],"name":"test_item","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":38},{"sl":46}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [3780], [3780], [3780], [3780], [], [], [3423], [3423], [3423], [3423], [3423], [], [3423], [3423], [], [3423], [3423], [], [], [], [], [], [], [3780, 3423], [3780, 3423], [], [], [], [], [], [], [3780, 3423], [3780, 3423], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3423], [3423], [], [], [], [], [], [], [], []]
