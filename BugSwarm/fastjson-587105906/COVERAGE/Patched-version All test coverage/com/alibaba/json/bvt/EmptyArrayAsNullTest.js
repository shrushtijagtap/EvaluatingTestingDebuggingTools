var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":25,"id":42731,"methods":[{"el":16,"sc":5,"sl":11}],"name":"EmptyArrayAsNullTest","sl":9},{"el":20,"id":42735,"methods":[],"name":"EmptyArrayAsNullTest.Model","sl":18},{"el":24,"id":42735,"methods":[],"name":"EmptyArrayAsNullTest.Value","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4280":{"methods":[{"sl":11}],"name":"test_emtpyAsNull","pass":true,"statements":[{"sl":12},{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [4280], [4280], [], [4280], [4280], [], [], [], [], [], [], [], [], [], []]
