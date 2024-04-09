var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":49,"id":57808,"methods":[{"el":24,"sc":5,"sl":15},{"el":32,"sc":5,"sl":26}],"name":"Issue998","sl":14},{"el":36,"id":57822,"methods":[],"name":"Issue998.Model","sl":34},{"el":48,"id":57822,"methods":[{"el":43,"sc":9,"sl":41},{"el":47,"sc":9,"sl":45}],"name":"Issue998.Item","sl":38}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_677":{"methods":[{"sl":15},{"sl":41},{"sl":45}],"name":"test_for_issue","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":22},{"sl":23},{"sl":42},{"sl":46}]},"test_726":{"methods":[{"sl":26},{"sl":45}],"name":"test_for_issue_1","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":46}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [677], [677], [677], [677], [677], [677], [], [677], [677], [], [], [726], [726], [726], [726], [726], [726], [], [], [], [], [], [], [], [], [], [677], [677], [], [], [726, 677], [726, 677], [], [], []]
