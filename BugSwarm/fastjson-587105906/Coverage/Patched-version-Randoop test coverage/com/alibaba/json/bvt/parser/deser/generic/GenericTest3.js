var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":77040,"methods":[{"el":31,"sc":2,"sl":24}],"name":"GenericTest3","sl":10},{"el":13,"id":77040,"methods":[],"name":"GenericTest3.A","sl":11},{"el":17,"id":77040,"methods":[],"name":"GenericTest3.B","sl":15},{"el":22,"id":77040,"methods":[],"name":"GenericTest3.ValueObject","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3059":{"methods":[{"sl":24}],"name":"test_generic","pass":false,"statements":[{"sl":25}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3059], [3059], [], [], [], [], [], [], []]
