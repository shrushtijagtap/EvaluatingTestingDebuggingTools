var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":83009,"methods":[{"el":24,"sc":5,"sl":19}],"name":"DupSetterTest2","sl":17},{"el":41,"id":83014,"methods":[{"el":32,"sc":9,"sl":30},{"el":36,"sc":9,"sl":34},{"el":40,"sc":9,"sl":38}],"name":"DupSetterTest2.VO","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3221":{"methods":[{"sl":19},{"sl":30},{"sl":34}],"name":"testEnum","pass":true,"statements":[{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":31},{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3221], [3221], [3221], [3221], [3221], [], [], [], [], [], [], [3221], [3221], [], [], [3221], [3221], [], [], [], [], [], [], []]
