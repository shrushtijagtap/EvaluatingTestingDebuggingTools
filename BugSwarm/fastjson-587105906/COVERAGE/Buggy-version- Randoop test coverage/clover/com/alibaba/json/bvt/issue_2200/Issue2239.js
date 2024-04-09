var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":47,"id":64864,"methods":[{"el":18,"sc":5,"sl":10}],"name":"Issue2239","sl":9},{"el":22,"id":64867,"methods":[],"name":"Issue2239.Bean","sl":20},{"el":33,"id":64867,"methods":[{"el":32,"sc":9,"sl":30}],"name":"Issue2239.BaseResponse","sl":24},{"el":46,"id":64869,"methods":[{"el":41,"sc":9,"sl":39},{"el":45,"sc":9,"sl":43}],"name":"Issue2239.PageBean","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2181":{"methods":[{"sl":10}],"name":"test_for_issue","pass":true,"statements":[{"sl":12},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [2181], [], [2181], [], [2181], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
