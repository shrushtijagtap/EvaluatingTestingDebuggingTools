var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":46,"id":60233,"methods":[{"el":28,"sc":5,"sl":17},{"el":41,"sc":5,"sl":30}],"name":"Issue969","sl":16},{"el":45,"id":60249,"methods":[],"name":"Issue969.Model","sl":43}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1822":{"methods":[{"sl":17}],"name":"test_for_issue","pass":true,"statements":[{"sl":18},{"sl":20},{"sl":21},{"sl":22},{"sl":24},{"sl":26},{"sl":27}]},"test_3842":{"methods":[{"sl":30}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":31},{"sl":33},{"sl":34},{"sl":35},{"sl":37},{"sl":39},{"sl":40}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1822], [1822], [], [1822], [1822], [1822], [], [1822], [], [1822], [1822], [], [], [3842], [3842], [], [3842], [3842], [3842], [], [3842], [], [3842], [3842], [], [], [], [], [], []]
