var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":51,"id":55400,"methods":[{"el":21,"sc":5,"sl":12},{"el":31,"sc":5,"sl":23}],"name":"Issue176","sl":10},{"el":46,"id":55412,"methods":[{"el":40,"sc":9,"sl":38},{"el":44,"sc":9,"sl":42}],"name":"Issue176.ParentClass","sl":33},{"el":50,"id":55416,"methods":[],"name":"Issue176.SubClass","sl":48}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1103":{"methods":[{"sl":12},{"sl":38},{"sl":42}],"name":"test_for_parent","pass":true,"statements":[{"sl":13},{"sl":15},{"sl":17},{"sl":19},{"sl":20},{"sl":39},{"sl":43}]},"test_2048":{"methods":[{"sl":23},{"sl":38},{"sl":42}],"name":"test_for_sub","pass":true,"statements":[{"sl":24},{"sl":26},{"sl":28},{"sl":29},{"sl":30},{"sl":39},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [1103], [1103], [], [1103], [], [1103], [], [1103], [1103], [], [], [2048], [2048], [], [2048], [], [2048], [2048], [2048], [], [], [], [], [], [], [], [2048, 1103], [2048, 1103], [], [], [2048, 1103], [2048, 1103], [], [], [], [], [], [], [], []]
