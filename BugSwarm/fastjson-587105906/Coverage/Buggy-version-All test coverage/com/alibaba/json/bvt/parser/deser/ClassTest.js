var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":47,"id":74536,"methods":[{"el":15,"sc":5,"sl":10},{"el":26,"sc":5,"sl":17},{"el":32,"sc":5,"sl":28}],"name":"ClassTest","sl":8},{"el":46,"id":74554,"methods":[{"el":40,"sc":9,"sl":38},{"el":44,"sc":9,"sl":42}],"name":"ClassTest.VO","sl":34}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2125":{"methods":[{"sl":10},{"sl":38},{"sl":42}],"name":"test_null","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":39},{"sl":43}]},"test_2511":{"methods":[{"sl":28}],"name":"test_array","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":31}]},"test_2866":{"methods":[{"sl":17}],"name":"test_primitive","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":25}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [2125], [2125], [2125], [2125], [2125], [], [], [2866], [2866], [2866], [2866], [2866], [2866], [2866], [2866], [2866], [], [], [2511], [2511], [2511], [2511], [], [], [], [], [], [], [2125], [2125], [], [], [2125], [2125], [], [], [], []]
