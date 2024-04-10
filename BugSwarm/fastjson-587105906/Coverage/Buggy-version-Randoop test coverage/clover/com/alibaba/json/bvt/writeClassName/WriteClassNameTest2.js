var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":53,"id":92889,"methods":[{"el":24,"sc":5,"sl":13}],"name":"WriteClassNameTest2","sl":11},{"el":38,"id":92897,"methods":[{"el":32,"sc":9,"sl":30},{"el":36,"sc":9,"sl":34}],"name":"WriteClassNameTest2.A","sl":26},{"el":52,"id":92901,"methods":[{"el":46,"sc":9,"sl":44},{"el":50,"sc":9,"sl":48}],"name":"WriteClassNameTest2.B","sl":40}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2077":{"methods":[{"sl":13},{"sl":30},{"sl":34},{"sl":44},{"sl":48}],"name":"test_writeClassName","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":21},{"sl":23},{"sl":31},{"sl":35},{"sl":45},{"sl":49}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [2077], [2077], [2077], [2077], [2077], [2077], [], [], [2077], [], [2077], [], [], [], [], [], [], [2077], [2077], [], [], [2077], [2077], [], [], [], [], [], [], [], [], [2077], [2077], [], [], [2077], [2077], [], [], [], []]
