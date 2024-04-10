var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":46,"id":63159,"methods":[{"el":24,"sc":5,"sl":10}],"name":"Issue1572","sl":9},{"el":45,"id":63169,"methods":[{"el":32,"sc":9,"sl":30},{"el":36,"sc":9,"sl":34},{"el":40,"sc":9,"sl":38},{"el":44,"sc":9,"sl":42}],"name":"Issue1572.Person","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4179":{"methods":[{"sl":10},{"sl":30},{"sl":34},{"sl":38},{"sl":42}],"name":"test_for_issue","pass":true,"statements":[{"sl":11},{"sl":13},{"sl":15},{"sl":17},{"sl":18},{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":31},{"sl":35},{"sl":39},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [4179], [4179], [], [4179], [], [4179], [], [4179], [4179], [], [4179], [4179], [4179], [4179], [], [], [], [], [], [], [4179], [4179], [], [], [4179], [4179], [], [], [4179], [4179], [], [], [4179], [4179], [], [], []]
