var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":80795,"methods":[{"el":20,"sc":5,"sl":9}],"name":"JSONPath_issue1208","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3156":{"methods":[{"sl":9}],"name":"test_largeNumberProperty","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [3156], [3156], [3156], [3156], [3156], [], [3156], [3156], [3156], [], [3156], [], [], [], []]
