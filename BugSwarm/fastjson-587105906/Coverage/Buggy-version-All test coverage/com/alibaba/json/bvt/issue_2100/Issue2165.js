var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":46,"id":64619,"methods":[{"el":19,"sc":5,"sl":10},{"el":30,"sc":5,"sl":21},{"el":41,"sc":5,"sl":32}],"name":"Issue2165","sl":8},{"el":45,"id":64640,"methods":[],"name":"Issue2165.Model","sl":43}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1302":{"methods":[{"sl":21}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":26},{"sl":28},{"sl":29}]},"test_1754":{"methods":[{"sl":32}],"name":"test_for_issue_2","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":37},{"sl":39},{"sl":40}]},"test_1924":{"methods":[{"sl":10}],"name":"test_for_issue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":15},{"sl":17},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [1924], [1924], [1924], [1924], [], [1924], [], [1924], [1924], [], [], [1302], [1302], [1302], [1302], [], [1302], [], [1302], [1302], [], [], [1754], [1754], [1754], [1754], [], [1754], [], [1754], [1754], [], [], [], [], [], []]
