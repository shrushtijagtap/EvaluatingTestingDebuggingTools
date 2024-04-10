var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":75190,"methods":[{"el":14,"sc":5,"sl":10}],"name":"InnerClassDeser","sl":9},{"el":22,"id":75194,"methods":[],"name":"InnerClassDeser.Model","sl":16},{"el":21,"id":75194,"methods":[],"name":"InnerClassDeser.Model.Item","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3071":{"methods":[{"sl":10}],"name":"test_for_inner_class","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [3071], [3071], [3071], [3071], [], [], [], [], [], [], [], [], [], []]
