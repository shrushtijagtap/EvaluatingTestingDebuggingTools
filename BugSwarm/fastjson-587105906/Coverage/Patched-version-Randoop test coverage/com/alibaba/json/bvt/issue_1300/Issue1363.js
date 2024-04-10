var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":63,"id":60941,"methods":[{"el":26,"sc":5,"sl":13},{"el":42,"sc":5,"sl":28}],"name":"Issue1363","sl":12},{"el":62,"id":60965,"methods":[{"el":50,"sc":9,"sl":49},{"el":55,"sc":9,"sl":52},{"el":60,"sc":9,"sl":57}],"name":"Issue1363.DataSimpleVO","sl":44}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3883":{"methods":[{"sl":13},{"sl":49},{"sl":52}],"name":"test_for_issue","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":53},{"sl":54}]},"test_4118":{"methods":[{"sl":28},{"sl":49},{"sl":52},{"sl":57}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":53},{"sl":54},{"sl":59}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [3883], [3883], [3883], [3883], [3883], [3883], [3883], [], [3883], [3883], [3883], [3883], [], [], [], [4118], [4118], [4118], [4118], [4118], [4118], [4118], [], [4118], [4118], [4118], [4118], [4118], [4118], [], [], [], [], [], [], [], [3883, 4118], [], [], [3883, 4118], [3883, 4118], [3883, 4118], [], [], [4118], [], [4118], [], [], [], []]
