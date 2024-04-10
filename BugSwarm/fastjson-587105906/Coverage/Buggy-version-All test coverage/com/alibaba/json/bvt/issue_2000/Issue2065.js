var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":64472,"methods":[{"el":10,"sc":5,"sl":8}],"name":"Issue2065","sl":7},{"el":25,"id":64473,"methods":[{"el":16,"sc":9,"sl":16},{"el":20,"sc":9,"sl":18},{"el":24,"sc":9,"sl":22}],"name":"Issue2065.Model","sl":12},{"el":44,"id":64478,"methods":[{"el":35,"sc":9,"sl":33},{"el":39,"sc":9,"sl":37},{"el":43,"sc":9,"sl":41}],"name":"Issue2065.EnumClass","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1256":{"methods":[{"sl":8}],"name":"test_for_issue","pass":true,"statements":[]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [1256], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
