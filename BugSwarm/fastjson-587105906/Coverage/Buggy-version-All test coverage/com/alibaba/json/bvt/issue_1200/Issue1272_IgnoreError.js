var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":25,"id":60528,"methods":[{"el":15,"sc":5,"sl":12}],"name":"Issue1272_IgnoreError","sl":11},{"el":24,"id":60531,"methods":[{"el":23,"sc":9,"sl":21}],"name":"Issue1272_IgnoreError.Point","sl":17}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4586":{"methods":[{"sl":12},{"sl":21}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [4586], [4586], [4586], [], [], [], [], [], [], [4586], [4586], [], [], []]
