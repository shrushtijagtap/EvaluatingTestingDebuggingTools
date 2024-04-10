var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":48,"id":51858,"methods":[{"el":22,"sc":5,"sl":13}],"name":"Bug_for_Issue_535","sl":12},{"el":46,"id":51866,"methods":[{"el":32,"sc":9,"sl":30},{"el":36,"sc":9,"sl":34},{"el":40,"sc":9,"sl":38},{"el":44,"sc":9,"sl":42}],"name":"Bug_for_Issue_535.TestPOJO","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1838":{"methods":[{"sl":13},{"sl":30},{"sl":34},{"sl":38},{"sl":42}],"name":"test_for_issue","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":20},{"sl":21},{"sl":31},{"sl":35},{"sl":39},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [1838], [1838], [1838], [1838], [1838], [1838], [], [1838], [1838], [], [], [], [], [], [], [], [], [1838], [1838], [], [], [1838], [1838], [], [], [1838], [1838], [], [], [1838], [1838], [], [], [], [], []]
