var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":76,"id":92237,"methods":[{"el":24,"sc":5,"sl":13},{"el":34,"sc":5,"sl":26},{"el":44,"sc":5,"sl":36},{"el":54,"sc":5,"sl":46}],"name":"WriteAsArray_float2_private","sl":12},{"el":75,"id":92264,"methods":[{"el":62,"sc":9,"sl":60},{"el":66,"sc":9,"sl":64},{"el":70,"sc":9,"sl":68},{"el":74,"sc":9,"sl":72}],"name":"WriteAsArray_float2_private.VO","sl":56}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1812":{"methods":[{"sl":46},{"sl":64},{"sl":72}],"name":"test_error2","pass":false,"statements":[{"sl":47},{"sl":48},{"sl":49},{"sl":53},{"sl":65},{"sl":73}]},"test_333":{"methods":[{"sl":13},{"sl":60},{"sl":64},{"sl":68},{"sl":72}],"name":"test_0","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":18},{"sl":19},{"sl":21},{"sl":22},{"sl":23},{"sl":61},{"sl":65},{"sl":69},{"sl":73}]},"test_3454":{"methods":[{"sl":26},{"sl":64},{"sl":72}],"name":"test_error","pass":false,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":33},{"sl":65},{"sl":73}]},"test_4478":{"methods":[{"sl":36},{"sl":64},{"sl":72}],"name":"test_error1","pass":false,"statements":[{"sl":37},{"sl":38},{"sl":39},{"sl":43},{"sl":65},{"sl":73}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [333], [333], [333], [333], [], [333], [333], [], [333], [333], [333], [], [], [3454], [3454], [3454], [3454], [], [], [], [3454], [], [], [4478], [4478], [4478], [4478], [], [], [], [4478], [], [], [1812], [1812], [1812], [1812], [], [], [], [1812], [], [], [], [], [], [], [333], [333], [], [], [333, 4478, 1812, 3454], [333, 4478, 1812, 3454], [], [], [333], [333], [], [], [333, 4478, 1812, 3454], [333, 4478, 1812, 3454], [], [], []]
