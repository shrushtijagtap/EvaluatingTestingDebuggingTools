var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":52,"id":65888,"methods":[{"el":18,"sc":5,"sl":9},{"el":29,"sc":5,"sl":20},{"el":40,"sc":5,"sl":31},{"el":51,"sc":5,"sl":42}],"name":"Issue2689","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2150":{"methods":[{"sl":31}],"name":"test_2","pass":true,"statements":[{"sl":32},{"sl":33},{"sl":34},{"sl":36},{"sl":38}]},"test_2552":{"methods":[{"sl":9}],"name":"test_0","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12},{"sl":14},{"sl":16}]},"test_3699":{"methods":[{"sl":42}],"name":"test_3","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":45},{"sl":47},{"sl":49}]},"test_4701":{"methods":[{"sl":20}],"name":"test_1","pass":true,"statements":[{"sl":21},{"sl":22},{"sl":23},{"sl":25},{"sl":27}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [2552], [2552], [2552], [2552], [], [2552], [], [2552], [], [], [], [4701], [4701], [4701], [4701], [], [4701], [], [4701], [], [], [], [2150], [2150], [2150], [2150], [], [2150], [], [2150], [], [], [], [3699], [3699], [3699], [3699], [], [3699], [], [3699], [], [], []]
