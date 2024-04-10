var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":71904,"methods":[{"el":25,"sc":5,"sl":11},{"el":29,"sc":5,"sl":27}],"name":"TestException","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3375":{"methods":[{"sl":11},{"sl":27}],"name":"test_0","pass":true,"statements":[{"sl":12},{"sl":14},{"sl":15},{"sl":17},{"sl":20},{"sl":22},{"sl":24},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3375], [3375], [], [3375], [3375], [], [3375], [], [], [3375], [], [3375], [], [3375], [], [], [3375], [3375], [], []]
