var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":111,"id":100607,"methods":[{"el":39,"sc":5,"sl":36},{"el":43,"sc":5,"sl":41},{"el":47,"sc":5,"sl":45},{"el":51,"sc":5,"sl":49},{"el":57,"sc":5,"sl":53},{"el":61,"sc":5,"sl":59},{"el":69,"sc":5,"sl":63},{"el":73,"sc":5,"sl":71},{"el":78,"sc":5,"sl":75},{"el":82,"sc":5,"sl":80},{"el":86,"sc":5,"sl":84},{"el":90,"sc":5,"sl":88},{"el":98,"sc":5,"sl":92},{"el":102,"sc":5,"sl":100},{"el":106,"sc":5,"sl":104},{"el":110,"sc":5,"sl":108}],"name":"HelloServiceImpl","sl":34}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2283":{"methods":[{"sl":36}],"name":"test_0","pass":true,"statements":[{"sl":38}]},"test_3092":{"methods":[{"sl":100}],"name":"testPerson","pass":true,"statements":[{"sl":101}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2283], [], [2283], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3092], [3092], [], [], [], [], [], [], [], [], [], []]
