var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":52118,"methods":[{"el":14,"sc":5,"sl":11},{"el":19,"sc":5,"sl":16},{"el":24,"sc":5,"sl":21},{"el":29,"sc":5,"sl":26},{"el":34,"sc":5,"sl":31}],"name":"Bug_for_issue_304","sl":9},{"el":38,"id":52133,"methods":[],"name":"Bug_for_issue_304.VO","sl":36},{"el":42,"id":52133,"methods":[],"name":"Bug_for_issue_304.V1","sl":40}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1024":{"methods":[{"sl":16}],"name":"test_doubleQuote_vo","pass":true,"statements":[{"sl":17},{"sl":18}]},"test_1500":{"methods":[{"sl":31}],"name":"test_singleQuote_vo","pass":false,"statements":[{"sl":32},{"sl":33}]},"test_1777":{"methods":[{"sl":11}],"name":"test_doubleQuote","pass":true,"statements":[{"sl":12},{"sl":13}]},"test_1840":{"methods":[{"sl":26}],"name":"test_singleQuote","pass":false,"statements":[{"sl":27},{"sl":28}]},"test_2831":{"methods":[{"sl":21}],"name":"test_doubleQuote_vo_private","pass":true,"statements":[{"sl":22},{"sl":23}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [1777], [1777], [1777], [], [], [1024], [1024], [1024], [], [], [2831], [2831], [2831], [], [], [1840], [1840], [1840], [], [], [1500], [1500], [1500], [], [], [], [], [], [], [], [], [], []]
