var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":46,"id":61864,"methods":[{"el":15,"sc":5,"sl":12},{"el":21,"sc":5,"sl":17}],"name":"Issue1510","sl":11},{"el":45,"id":61871,"methods":[{"el":32,"sc":9,"sl":30},{"el":36,"sc":9,"sl":34},{"el":40,"sc":9,"sl":38},{"el":44,"sc":9,"sl":42}],"name":"Issue1510.Model","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3844":{"methods":[{"sl":17},{"sl":30},{"sl":34},{"sl":38},{"sl":42}],"name":"test_for_issue","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20},{"sl":31},{"sl":35},{"sl":39},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3844], [3844], [3844], [3844], [], [], [], [], [], [], [], [], [], [3844], [3844], [], [], [3844], [3844], [], [], [3844], [3844], [], [], [3844], [3844], [], [], []]
