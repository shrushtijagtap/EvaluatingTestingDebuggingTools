var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":46,"id":96372,"methods":[{"el":16,"sc":2,"sl":14},{"el":21,"sc":2,"sl":19},{"el":26,"sc":2,"sl":24},{"el":31,"sc":2,"sl":29}],"name":"Outter","sl":10},{"el":45,"id":96380,"methods":[],"name":"Outter.Inner","sl":33},{"el":44,"id":96380,"methods":[{"el":39,"sc":4,"sl":37},{"el":43,"sc":4,"sl":41}],"name":"Outter.Inner.InnerInner","sl":34},{"el":83,"id":96384,"methods":[{"el":55,"sc":2,"sl":50},{"el":66,"sc":2,"sl":57},{"el":81,"sc":2,"sl":68}],"name":"InnerInnerTest","sl":48}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
