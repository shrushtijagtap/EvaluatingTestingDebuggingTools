var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":27,"id":63718,"methods":[{"el":16,"sc":5,"sl":10}],"name":"Issue1725","sl":9},{"el":20,"id":63723,"methods":[],"name":"Issue1725.AbstractBean","sl":18},{"el":24,"id":63723,"methods":[],"name":"Issue1725.ConcreteBean","sl":22},{"el":26,"id":63723,"methods":[],"name":"Issue1725.FieldEnum","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3962":{"methods":[{"sl":10}],"name":"test_for_issue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [3962], [3962], [3962], [], [3962], [3962], [], [], [], [], [], [], [], [], [], [], [], []]
