var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":52,"id":52346,"methods":[{"el":29,"sc":5,"sl":26},{"el":40,"sc":5,"sl":31},{"el":51,"sc":5,"sl":42}],"name":"TypeSortMatcherTest","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2038":{"methods":[{"sl":31}],"name":"testMatch","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39}]},"test_4500":{"methods":[{"sl":42}],"name":"testNoMatch","pass":true,"statements":[{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2038], [], [2038], [2038], [2038], [2038], [2038], [2038], [2038], [], [], [4500], [], [4500], [4500], [4500], [4500], [4500], [4500], [4500], [], []]
